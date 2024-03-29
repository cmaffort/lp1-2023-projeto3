package br.cefetmg.inf.altomare.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.model.dao.PacoteDAO;
import br.cefetmg.altomare.model.dto.PacoteDTO;
import jakarta.servlet.RequestDispatcher;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/ObterPacotePorCPF")
public class ObterPacotePorCPF extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cpf = request.getParameter("cpf");

        try {
            PacoteDAO pacoteDAO = new PacoteDAO();
            
            PacoteDTO pacote = pacoteDAO.obterPacotePorCPF(cpf);

            request.setAttribute("pacote", pacote);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/exibirPacote.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/erro.jsp");
            dispatcher.forward(request, response);
        }
    }
}


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
