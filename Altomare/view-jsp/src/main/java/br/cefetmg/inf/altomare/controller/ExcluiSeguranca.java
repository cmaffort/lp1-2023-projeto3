/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dao.SegurancaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "ExcluiSeguranca", urlPatterns = {"/ExcluiSeguranca"})
public class ExcluiSeguranca extends HttpServlet {
 public static String execute(HttpServletRequest request){
           String jsp;
           try{
               String nome = request.getParameter("nome");
               SegurancaDAO seguranca = new SegurancaDAO();
               boolean delete = seguranca.Deletar(nome);
               
               if(delete != false){
                   jsp = "core/seguranca/ExibeSeguranca.jsp";
               }else{
                   String erro = "Ocorreu um erro ao excluir o usuário.";
                   request.setAttribute("erro", erro);
                   jsp = "/erro.jsp";
                   
               }
               
           }catch(Exception e){
               e.printStackTrace();
               jsp = "";
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

}
