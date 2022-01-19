package com.Insurance.WebService.domain;

import com.Insurance.WebService.services.NtlmAuthenticationService;
import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


public class NtmlAuthentication implements NtlmAuthenticationService {

    private String username;
    private String password;
    private String domain;
    private String URL;
    private HttpEntity AuthResponse;
    private String stringAuthResponse;

    public NtmlAuthentication() {
    }

    public NtmlAuthentication(String username, String password, String domain,String URL) {
        this.username = username;
        this.password = password;
        this.domain = domain;
        this.URL= URL;
        CredentialsProvider credentialsProvider=SetUpCredentials(this.username,this.password,this.domain);
        HttpClient httpClient=BuildConnectionClient(credentialsProvider);
        HttpPost post = new HttpPost(this.URL); //Provide Request URL

        ////
        try {
            org.apache.http.HttpResponse response = httpClient.execute(post);

            HttpEntity responseEntity = response.getEntity();
            AuthResponse=response.getEntity();

            stringAuthResponse=response.toString();

            if (responseEntity != null) {
                System.out.println(EntityUtils.toString(responseEntity));
               // AuthResponse=responseEntity;
                //stringAuthResponse=EntityUtils.toString(AuthResponse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public CredentialsProvider SetUpCredentials(String username, String domain, String password) {
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(AuthScope.ANY,
                SetUpNTCredentials(username, password,domain));

        return credsProvider;
    }

    @Override
    public NTCredentials SetUpNTCredentials(String username, String domain, String password) {
        NTCredentials ntCredentials=new NTCredentials(username, password, "Host", domain);
        return ntCredentials;
    }

    @Override
    public HttpClient BuildConnectionClient(CredentialsProvider credentialsProvider) {
        HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(credentialsProvider).build();

        return client;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public HttpEntity getAuthResponse() {
        return AuthResponse;
    }

    public String getStringAuthResponse() {
        return stringAuthResponse;
    }
}

