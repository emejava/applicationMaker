package com.applicationmaker.controller.servlet.socialLogin.github;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import java.io.IOException;

@WebServlet("/github-login")
public class GithubLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            System.out.println("Github Login Service Used");
            String clientId = "Iv1.ffe3fe3ea9a9573b";
            String clientSecret = "0059a75b2e2379c1feef8091fe4be47b2c3db9f2";
            String redirectUri = "http://localhost:8080/oauth2/authorization/github";
            String scope = "user"; // GitHub scope

            OAuthClientRequest oauthRequest = OAuthClientRequest
                    .authorizationLocation("https://github.com/login/oauth/authorize")
                    .setResponseType("code")
                    .setClientId(clientId)
                    .setRedirectURI(redirectUri)
                    .setScope(scope)
                    .buildQueryMessage();

            response.sendRedirect(oauthRequest.getLocationUri());
        } catch (OAuthSystemException | IOException e) {
            e.printStackTrace();
        }
    }
}
