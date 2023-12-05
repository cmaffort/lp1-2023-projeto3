package br.cefetmg.inf.altomare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.model.dto.*;
import br.cefetmg.altomare.model.dao.*;
import br.cefetmg.altomare.model.service.*;
import java.util.*;

@WebServlet(name = "PagamentoContaServlet", urlPatterns = {"/PagamentoContaServlet"})
public class PagamentoContaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        ContaUsuarioDAO contaManager = new ContaUsuarioDAO();
        contaManager.atualizar(new ContaUsuarioDTO(true, 0, 1));
        
        response.sendRedirect("/core/pagamentos/pagamentos.jsp");
    }
    
    @Override
    protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
            throws jakarta.servlet.ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
            throws jakarta.servlet.ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
     
}
