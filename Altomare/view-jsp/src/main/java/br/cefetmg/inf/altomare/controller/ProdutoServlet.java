package br.cefetmg.inf.altomare.controller;


import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ProdutoServlet", urlPatterns = {"/ProdutoServlet"})

public class ProdutoServlet extends HttpServlet {
    private String jsp = "";
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String acao = request.getParameter("acao");
        
        if(acao.equals("Cadastrar")) {
            jsp = CadastrarProduto.execute(request);
            response.sendRedirect(jsp);
        }
        else if (acao.equals("Listar")) {
            jsp = ListarProduto.execute(request);
            response.sendRedirect(jsp);

        }
        else if (acao.equals("Alterar")) {
            jsp = AlterarProduto.execute(request);
            response.sendRedirect(jsp);
        }
        else if (acao.equals("ExcluirNome")) {
            jsp = ExcluirProduto.executeNome(request);
            response.sendRedirect(jsp);
        }
        else if (acao.equals("ExcluirId")) {
            jsp = ExcluirProduto.executeID(request);
            response.sendRedirect(jsp);
        }
        
        response.sendRedirect("/index.jsp");
    }
}
