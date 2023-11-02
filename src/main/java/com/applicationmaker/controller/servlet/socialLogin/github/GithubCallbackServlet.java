package com.applicationmaker.controller.servlet.socialLogin.github;

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

@WebServlet("/github-callback")
public class GithubCallbackServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            String clientId = "Iv1.ffe3fe3ea9a9573b";
            String clientSecret = "0059a75b2e2379c1feef8091fe4be47b2c3db9f2";
            String redirectUri = "http://localhost:8080/oauth2/authorization/github";
            String code = request.getParameter("code");
            String scope = "user";

            OAuthClientRequest oauthRequest = OAuthClientRequest
                    .tokenLocation("https://github.com/login/oauth/access_token")
                    .setGrantType(GrantType.valueOf("authorization_code"))
                    .setClientId(clientId)
                    .setClientSecret(clientSecret)
                    .setRedirectURI(redirectUri)
                    .setScope(scope)
                    .setCode(code)
                    .setScope("user")
                    .buildBodyMessage();

            OAuthClient oauthClient = new OAuthClient(new URLConnectionClient());
            OAuthJSONAccessTokenResponse oauthResponse = oauthClient.accessToken(oauthRequest, OAuthJSONAccessTokenResponse.class);

            String accessToken = oauthResponse.getAccessToken();

            // Use the access token for GitHub API requests or to authenticate the user.
        } catch (OAuthSystemException | OAuthProblemException e) {
            e.printStackTrace();
        }
    }
}
