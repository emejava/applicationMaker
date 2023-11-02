package com.applicationmaker.controller.servlet.socialLogin.google;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import java.io.IOException;

@WebServlet("/google-login")
public class GoogleLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            System.out.println("Google Login Service Used");
            String clientId = "799623685566-bc7oaoeeehqiabhi45qh06nu0oe2f0mc.apps.googleusercontent.com";
            String clientSecret = "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";
            String redirectUri = "http://localhost:8080/oauth2/authorization/google";
            String scope = "openid profile email";

            OAuthClientRequest oauthRequest = OAuthClientRequest
                    .authorizationLocation("https://accounts.google.com/o/oauth2/auth")
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
