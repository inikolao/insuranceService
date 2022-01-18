package com.Insurance.WebService.services;

import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;

public interface NtlmAuthenticationService {

    CredentialsProvider SetUpCredentials(String username, String domain, String password);
    NTCredentials SetUpNTCredentials(String username, String domain, String password);
    HttpClient BuildConnectionClient(CredentialsProvider credentialsProvider);
}
