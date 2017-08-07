package com.cdk.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;

@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpSession httpSession = ((HttpServletRequest)req).getSession();
        if((Boolean)httpSession.getAttribute("status")){
            chain.doFilter(req, resp);}
            else{
            resp.setContentType("text/html");
            resp.getWriter().write("<h3 style = 'color:red'> Please login again, not a valid user</h3>");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
