package com.applicationmaker.controller.servlet.socialLogin.google;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;

@WebServlet("/google-callback")
public class GoogleCallbackServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            String clientId = "799623685566-bc7oaoeeehqiabhi45qh06nu0oe2f0mc.apps.googleusercontent.com\n";
            String clientSecret = "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";
            String redirectUri = "http://localhost:8080/oauth2/authorization/google";
            String scope = "openid profile email";

            String code = request.getParameter("code");

            OAuthClientRequest oauthRequest = OAuthClientRequest
                    .tokenLocation("https://accounts.google.com/o/oauth2/token")
                    .setGrantType(GrantType.AUTHORIZATION_CODE)
                    .setClientId(clientId)
                    .setClientSecret(clientSecret)
                    .setRedirectURI(redirectUri)
                    .setCode(code)
                    .setScope(scope)
                    .buildBodyMessage();

            OAuthClient oauthClient = new OAuthClient(new URLConnectionClient());
            OAuthJSONAccessTokenResponse oauthResponse = oauthClient.accessToken(oauthRequest, OAuthJSONAccessTokenResponse.class);

            String accessToken = oauthResponse.getAccessToken();
            String idToken = oauthResponse.getParam("id_token");

            // You can use the access token and ID token as needed.
        } catch (OAuthProblemException | OAuthSystemException e) {
            e.printStackTrace();
        }
    }
}
