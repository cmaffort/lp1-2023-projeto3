
package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.exception.NegocioException;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
//@include file="../../headerGerente.jsp";

@WebServlet(name = "Fachada", urlPatterns = {"/Fachada"})
public class Fachada extends HttpServlet {

    @SuppressWarnings("ConvertToStringSwitch")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException, PersistenciaException, NegocioException {
        response.setContentType("text/html;charset=UTF-8");
        
        try ( PrintWriter out = response.getWriter()) {
            request.setCharacterEncoding("UTF-8");
           String acao = request.getParameter("acao");
           String jsp;
           
       // out.println("<head>");
         // out.println("<link rel=\"stylesheet\" href=\"../../css/estilos-header.css\">");
          //out.println("</head>");
        
       if(acao.equals("Login"))
          jsp = Login.execute(request);   
       else if(acao.equals("CadastrarProduto"))
          jsp = CadastrarProduto.execute(request);
       else if(acao.equals("CadastrarFuncionario"))
          jsp = CadastrarFuncionario.execute(request); 
       else if(acao.equals("CadastrarPassageiro"))
           jsp = CadastrarPassageiro.execute(request);
       else if(acao.equals("ListarProduto"))
          jsp = ListarProduto.execute(request);
       else if(acao.equals("AlterarProduto"))
          jsp = AlterarProduto.execute(request);
       else if(acao.equals("ExcluirProduto"))
          jsp = ExcluirProduto.executeID(request);
       else if(acao.equals("CadastrarFuncionario"))
           jsp = CadastrarFuncionario.execute(request);
       else
           jsp = "/erro.jsp";
       
       //Redirecionando pagina
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        rd.forward(request, response);
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
             processRequest(request, response);
         } catch (PersistenciaException | NegocioException ex) {
             Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
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
         try {
             processRequest(request, response);
         } catch (PersistenciaException | NegocioException ex) {
             Logger.getLogger(FuncionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
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
    
