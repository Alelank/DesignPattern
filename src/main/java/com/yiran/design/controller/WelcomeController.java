package com.yiran.design.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ale on 2021/3/4
 */
public class WelcomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求进入...");
        System.out.println("master ... ");
        resp.sendRedirect("index.jsp");
        System.out.println("dev1 update --- ");
    }
}
