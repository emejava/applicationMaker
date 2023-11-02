package com.applicationmaker.controller.servlet.socialLogin.telegram;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/telegram-login")
public class TelegramLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Telegram Login Service Used");
        String botToken = "6591418180:AAGtCzP-Y1pRagY8o3rJutg3KtFEk82JY3c"; // Your Telegram Bot Token
        String botUsername = "Appmaker_firstBot"; // Your Telegram Bot Username
        String redirectUri = "https://web.telegram.org/a/#6591418180";
        String telegramLoginUrl = "https://telegram.me/" + botUsername + "?start=" + redirectUri;

        // Redirect the user to the Telegram login page
        resp.sendRedirect(telegramLoginUrl);
    }



}