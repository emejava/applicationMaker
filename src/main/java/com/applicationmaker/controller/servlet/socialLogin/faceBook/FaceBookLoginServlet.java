package com.applicationmaker.controller.servlet.socialLogin.faceBook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import java.io.IOException;

@WebServlet("/facebook-login")
public class FaceBookLoginServlet extends HttpServlet {

    @Inject
    @ConfigProperty(name = "facebook.clientId")
    private String facebookClientId;

    @Inject
    @ConfigProperty(name = "facebook.clientSecret")
    private String facebookClientSecret;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FaceBook Login Service Used");
        String redirectUri = "http://localhost:8080/oauth2/authorization/facebook";
        String facebookOAuthUrl = "https://www.facebook.com/v12.0/dialog/oauth?client_id=" + facebookClientId + "&redirect_uri=" + redirectUri + "&scope=email";

        resp.sendRedirect(facebookOAuthUrl);
    }
}
