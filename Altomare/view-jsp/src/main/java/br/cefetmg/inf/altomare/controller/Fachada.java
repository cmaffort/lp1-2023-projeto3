
package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.exception.NegocioException;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.InputStream;
import java.nio.file.Paths;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//@include file="../../headerGerente.jsp";

@WebServlet(name = "Fachada", urlPatterns = {"/Fachada"})
@MultipartConfig
public class Fachada extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException, PersistenciaException, NegocioException, SQLException, ClassNotFoundException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            request.setCharacterEncoding("UTF-8");
           String acao = request.getParameter("acao");
           String jsp ;
           
           //Part filePart = request.getPart("foto"); // Obtém o upload do arquivo
            //String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // Obtém o nome do arquivo
            //InputStream fileContent = filePart.getInputStream(); // Obtém o conteúdo do arquivo
            
            //Armazena o InputStream em um atributo de solicitação para que ele possa ser acessado na servlet CadastrarPassageiro
          // request.setAttribute("foto", fileContent);

       if(acao.equals("Login"))
          jsp = Login.execute(request);   
       else if(acao.equals("CadastrarPassageiro"))
           jsp = CadastrarPassageiro.execute(request);
       else if(acao.equals("CadastrarItem"))
           jsp = Cardapio.execute(request);
       else if(acao.equals("CadastrarFuncionario"))
           jsp = CadastrarFuncionario.execute(request);
       else if(acao.equals("CadastrarSeguranca"))
           jsp = CadastrarSeguranca.execute(request);
       else if(acao.equals("ExcluirSeguranca"))
           jsp = ExcluiSeguranca.execute(request);
       else
           jsp = "/erro.jsp";
       
       //Redirecionando pagina
        response.sendRedirect(jsp);
        
        }
        catch(Exception e) {
                 e.printStackTrace();
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
         } catch (SQLException ex) {
            Logger.getLogger(Fachada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fachada.class.getName()).log(Level.SEVERE, null, ex);
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
         } catch (SQLException ex) {
            Logger.getLogger(Fachada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fachada.class.getName()).log(Level.SEVERE, null, ex);
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
    
