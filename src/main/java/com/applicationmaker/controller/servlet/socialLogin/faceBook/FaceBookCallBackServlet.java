package com.applicationmaker.controller.servlet.socialLogin.faceBook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


@WebServlet("/facebook-callback")
public class FaceBookCallBackServlet extends HttpServlet {

    @Inject
    @ConfigProperty(name = "facebook.clientId")
    private String facebookClientId;

    @Inject
    @ConfigProperty(name = "facebook.clientSecret")
    private String facebookClientSecret;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the authorization code from the request query parameters
        String authorizationCode = req.getParameter("code");

        // Exchange the authorization code for an access token
        String accessToken = exchangeAuthorizationCodeForAccessToken(authorizationCode);

        // Use the access token to fetch user data from Facebook
        String userData = fetchUserDataFromFacebook(accessToken);

        // Process the user data as needed (e.g., create or log in the user)


        resp.getWriter().write("Facebook login successful");
    }




    private String exchangeAuthorizationCodeForAccessToken(String authorizationCode) {
        try {
            String redirectUri = "http://localhost:8080/oauth2/authorization/facebook"; // Replace with your redirect URI

            // Construct the URL for exchanging the authorization code for an access token
            String tokenExchangeUrl = "https://graph.facebook.com/v12.0/oauth/access_token?client_id=" + facebookClientId +
                    "&redirect_uri=" + redirectUri + "&client_secret=" + facebookClientSecret +
                    "&code=" + authorizationCode;

            // Send a GET request to Facebook to exchange the code for an access token
            URL url = new URL(tokenExchangeUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if (conn.getResponseCode() == 200) {
                try (InputStream in = conn.getInputStream();
                     Scanner scanner = new Scanner(in)) {
                    scanner.useDelimiter("\\A");
                    return scanner.hasNext() ? scanner.next() : "";
                }
            }
        } catch (IOException e) {
            // Handle exceptions
        }

        return null; // Handle the case when the exchange fails
    }

    private String fetchUserDataFromFacebook(String accessToken) {
        try {
            // Construct the URL to fetch user data from Facebook
            String userDataUrl = "https://graph.facebook.com/v12.0/me?fields=id,name,email&access_token=" + accessToken;

            // Send a GET request to Facebook to fetch user data
            URL url = new URL(userDataUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            if (conn.getResponseCode() == 200) {
                try (InputStream in = conn.getInputStream();
                     Scanner scanner = new Scanner(in)) {
                    scanner.useDelimiter("\\A");
                    return scanner.hasNext() ? scanner.next() : "";
                }
            }
        } catch (IOException e) {
            // Handle exceptions
        }

        return null; // Handle the case when fetching user data fails
    }
}
