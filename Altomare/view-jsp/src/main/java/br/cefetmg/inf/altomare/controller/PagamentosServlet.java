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


@WebServlet(name = "PagamentosServlet", urlPatterns = {"/PagamentosServlet"})
public class PagamentosServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String titular = request.getParameter("titular");
        String vencimento = request.getParameter("vencimento");
        String cvv = request.getParameter("cvv");
        Integer cvvInt = Integer.parseInt(cvv);
        String numero = request.getParameter("numero");
        Long numeroInt = Long.parseLong(numero);
        
        
        CartaoDTO novoCartao = new CartaoDTO(titular, vencimento, "debito", cvvInt, numeroInt, 1L); //em vez de 1,
                                                                                                                      //pegar variavel
        CartaoDAO cartoesManager = new CartaoDAO();                                                                   //de session
        cartoesManager.inserir(novoCartao);
        
        response.sendRedirect("core/pagamentos/pagamentos.jsp");
        //RequestDispatcher rd = request.getRequestDispatcher("/core/pagamentos/pagamentos.jsp");
        //rd.forward(request, response);
    }
}
