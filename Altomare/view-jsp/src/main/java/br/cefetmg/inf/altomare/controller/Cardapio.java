/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dao.CardapioDAO;
import br.cefetmg.altomare.model.dao.ICardapioDAO;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.CardapioDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import br.cefetmg.altomare.model.service.IManterCardapio;
import br.cefetmg.altomare.model.service.ManterCardapio;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 *
 * @author Eliane
 */
@WebServlet(name = "Cardapio", urlPatterns = {"/Cardapio"})
public class Cardapio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @return 
     * @throws br.cefetmg.altomare.model.dao.exception.PersistenciaException
     * @throws ServletException if a servlet-specific error occurs
     * @throws br.cefetmg.altomare.model.exception.NegocioException
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
   @SuppressWarnings("CallToPrintStackTrace")
   public static String execute(HttpServletRequest request) throws PersistenciaException, NegocioException, IOException, ServletException, SQLException, ClassNotFoundException {
       @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace"})
        String jsp = "/erro.jsp";
       
       try{
           String nome = request.getParameter("nomeItem");
           String preco = request.getParameter("precoItem");
           String descricao = request.getParameter("descricaoItem");
           
           ICardapioDAO cardapioDAO = new CardapioDAO();
           CardapioDTO item = new CardapioDTO(null, descricao, null, nome, preco);
           cardapioDAO.inserir(item);
           jsp = "core/cardapio/cardapio.jsp";
           request.setAttribute("sucess", "Item cadastrado com sucesso");

       }catch(SQLException  e) {
            e.printStackTrace();
            request.setAttribute("tperror", "cadastroFuncionario");
            request.setAttribute("error", "Não foi possível realizar o cadastro, tente novamente");
        } 
       
       return jsp;
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
