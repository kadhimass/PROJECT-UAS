package com.example.belajar.spring.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Allow access to login and registration pages
        String uri = request.getRequestURI();
        if (uri.startsWith("/auth") || uri.equals("/")) {
            return true;
        }

        // Check if user is logged in
        Object userSession = request.getSession().getAttribute("loggedInUser");
        if (userSession == null) {
            response.sendRedirect("/auth/login");
            return false;
        }

        return true;
    }
}