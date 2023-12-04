
package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.IManterPassageiro;
import br.cefetmg.altomare.model.service.ManterFuncionario;
import br.cefetmg.altomare.model.service.ManterPassageiro;
import jakarta.servlet.RequestDispatcher;
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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @return 
     */
    public static String execute(jakarta.servlet.http.HttpServletRequest request){
        String jsp = "";
        
        try{
            String user = request.getParameter("cpfUsuario");
            String senha = request.getParameter("senhaUsuario");
            
            IManterFuncionario manterFuncionario = new ManterFuncionario();
            FuncionarioDTO funcionario = manterFuncionario.getUserLogin(user, senha);
            
             if(funcionario != null){
                request.getSession().setAttribute("cpfFuncionario", funcionario.getCpf());
                if(funcionario.getSetor().equals("gerencia"))
                    jsp = "/setores.jsp";
                if(funcionario.getSetor().equals("limpeza"))     
                    jsp = "/agenteLimpezaManutencao.jsp";
                if(funcionario.getSetor().equals("saude"))     
                    jsp = "/Medico.jsp";
                if(funcionario.getSetor().equals("inpecao"))     
                    jsp = "/inspetor.jsp";
                if(funcionario.getSetor().equals("entregaQuartos"))     
                    jsp = "/garconQuartos.jsp";
                if(funcionario.getSetor().equals("entregaRestaurante"))     
                    jsp = "/garconRestaurante.jsp";
                if(funcionario.getSetor().equals("restaurante"))     
                    jsp = "/cozinheiro.jsp";
            }else{
                IManterPassageiro manterPassageiro = new ManterPassageiro();
                PassageiroDTO passageiro = manterPassageiro.getUserLogin(user, senha);
                
                if(passageiro == null){
                    String erro = "Usuário não encontrado.";
                    request.setAttribute("erro", erro);
                    jsp = "/erro.jsp";
                }
                else{
                    jsp = "/erro.jsp";
                }
             }
           
        }catch(PersistenciaException | NegocioException | ClassNotFoundException | SQLException e){
            jsp = "";
        }
        return jsp;
    }
    
    @SuppressWarnings("null")
    public static void validarSessao(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException{
        String cpfFuncionario = (String) request.getSession().getAttribute("cpfFuncionario");
        String jsp;
        
        if(cpfFuncionario == null){
            jsp = "/login-index.jsp";
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
