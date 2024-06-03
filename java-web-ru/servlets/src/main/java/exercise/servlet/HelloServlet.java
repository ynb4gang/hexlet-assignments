package io.hexlet.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    // BEGIN
    @Override
    protected void doGet(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
        var parameter = request.getParameter("name");
        var name = parameter == null ? "Guest" : parameter;
        var message = "Hello, " + name + "!";
        request.setAttribute("message", message);

        request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
    }
    // END
}
