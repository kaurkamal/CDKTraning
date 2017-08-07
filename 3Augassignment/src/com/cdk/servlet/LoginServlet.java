package com.cdk.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    Map<String, String> map = null;

    public void init() throws ServletException {
        map = new HashMap<>();
        map.put("kamal", "asdfghjkl");
        map.put("kanwal", "zxcvbnm");
        map.put("harry", "zxcvbnm");
    }

    public void destroy() {
        map = null;
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter p =  response.getWriter();
        response.setContentType("text/html");
        if (!map.containsKey(name)) {
            p.write("user not found");

        } else if (password.equals(map.get(name))) {
            session.setAttribute("status", true);
            p.write("valid user");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/news");
            requestDispatcher.forward(request, response);
        } else {
            p.write("login again");
        }
    }}
