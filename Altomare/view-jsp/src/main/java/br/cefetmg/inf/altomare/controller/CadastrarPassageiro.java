
package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dao.PassageiroDAO;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "CadastrarPassageiro", urlPatterns = {"/CadastrarPassageiro"})
public class CadastrarPassageiro extends HttpServlet {

    public static String execute(jakarta.servlet.http.HttpServletRequest request) throws PersistenciaException, NegocioException, IOException, jakarta.servlet.ServletException {

               String  jsp = null;
                try {
            
                    String nome = request.getParameter("nome");
                    String dataNascimento = request.getParameter("dataNascimento");
                    String sexo = request.getParameter("sexo");
                    String cpf = request.getParameter("cpf");
                    String rg = request.getParameter("rg");
                    String civil = request.getParameter("civil");
                    String email = request.getParameter("email");
                    String telefone = request.getParameter("telefone");
                    String medico = request.getParameter("medico");
                    String senha = "";
                    String nomePasta = "ImagemPassageiro"; 
                    File diretorio = new File(nomePasta);
                      if (!diretorio.exists()) {
                         diretorio.mkdir();
                        }
                    
                    
                    Part photo = request.getPart("foto");
                    String nomeFoto = Paths.get(photo.getSubmittedFileName()).getFileName().toString();
                    
                  
                    
                     String caminho = diretorio + nomeFoto;
                     photo.write(caminho);
                      
                    PassageiroDTO passageiro = new PassageiroDTO (new ContaUsuarioDTO(), cpf, nome, dataNascimento, email, senha, sexo, civil, medico, rg, telefone, caminho);

                   
                    PassageiroDAO pass = new PassageiroDAO();
                    pass.InserirDadosPassageiro(passageiro);
          
                   jsp = "core/passageiro/ExibePassageiro.jsp";
                  
             } catch(PersistenciaException | ClassNotFoundException | SQLException e) {
              request.setAttribute("tperror", "cadastroPassageiro");
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
