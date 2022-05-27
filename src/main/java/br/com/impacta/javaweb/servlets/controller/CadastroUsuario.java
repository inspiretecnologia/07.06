package br.com.impacta.javaweb.servlets.controller;

import br.com.impacta.javaweb.servlets.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroUsuario", value = "/CadastroUsuario")
public class CadastroUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Usuario usuario = new Usuario();
        usuario.setNome(request.getParameter("nome"));
        usuario.setNome(request.getParameter("login"));
        usuario.setNome(request.getParameter("email"));
        usuario.setNome(request.getParameter("senha"));

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
       // String senha = request.getParameter("senha");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro Usuario realizado com sucesso!!!</title>");
        out.println("<head>");
        out.println("<body>");
        out.println("<h4>Nome:</h4>" + usuario.getNome());
        out.println("<h4>login:</h4>" + usuario.getLogin());
        out.println("<h4>email:</h4>" + senha);

        out.println("</body></html>");
    }
}
