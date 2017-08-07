package com.cdk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

public class WeatherServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter p = response.getWriter();
        response.setContentType("text/html");
        p.write("<a href = '/logout'> logout </a>");
        p.write(" <h3>sunny outside</h3>");
    }
}
