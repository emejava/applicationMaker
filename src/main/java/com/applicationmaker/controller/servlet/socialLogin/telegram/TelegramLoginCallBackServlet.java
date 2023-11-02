package com.applicationmaker.controller.servlet.socialLogin.telegram;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/telegram-login-callback")
public class TelegramLoginCallBackServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String telegramUserId = req.getParameter("id");

        resp.getWriter().write("Telegram User ID : "+telegramUserId);
    }
}
