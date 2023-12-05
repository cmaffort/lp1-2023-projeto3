package br.cefetmg.inf.altomare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import br.cefetmg.altomare.model.dao.*;
import br.cefetmg.altomare.model.dto.*;

public class MudaEstadoPedido extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String estado = request.getParameter("estados");
        
        if (estado != "nada") {
            String id = request.getParameter("id");
            Long idInt = Long.parseLong(id);

            PedidoTodoDAO pedidoManager = new PedidoTodoDAO();
            PedidoTodoDTO pedidoPorId = pedidoManager.getPedidoTodoPorId(idInt);
            pedidoPorId.setEstado(estado);
            pedidoManager.atualizar(pedidoPorId);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("/core/pedidos/pedidos-restaurante-func.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
