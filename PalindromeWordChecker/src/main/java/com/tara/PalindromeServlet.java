package com.tara;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class PalindromeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String word = request.getParameter("word");

        String reverse = new StringBuilder(word).reverse().toString();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Result</h2>");

        if (word.equalsIgnoreCase(reverse)) {
            out.println("<p>" + word + " is a Palindrome</p>");
        } else {
            out.println("<p>" + word + " is NOT a Palindrome</p>");
        }
    }
}