package br.com.impacta.javaweb.servlets.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ValidaLogin", value = "/ValidaLogin")
public class ValidaLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        //login verdadeiro e senha verdadeira
        if (login != null && senha != null) {

            if (login == "alexmb" && senha == "123456") {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/sistema");
                dispatcher.forward(request,response);

            }
        }

        response.sendRedirect("/errologin.html");
    }
}