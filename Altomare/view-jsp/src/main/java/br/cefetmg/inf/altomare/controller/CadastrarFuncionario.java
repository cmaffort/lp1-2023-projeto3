package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dao.FuncionarioDAO;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class CadastrarFuncionario extends HttpServlet {


    @SuppressWarnings("CallToPrintStackTrace")

    public static String execute(HttpServletRequest request) throws PersistenciaException, NegocioException, IOException, ServletException, SQLException {
       @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace"})
        String jsp = "core/funcionarios/listarFuncionarios.jsp";

        try {
            
            String setor = request.getParameter("setor");
            String turno = request.getParameter("turno");
            String nome = request.getParameter("nomeFuncionario");
            String dataNascimento = request.getParameter("dataNascimentoFuncionario");
            String cpf = request.getParameter("cpf");
            String estadoCivil = request.getParameter("estadoCivilFuncionario");
            String rg = request.getParameter("rgFuncionario");
            String sexo = request.getParameter("sexoFuncionario");
            String email = request.getParameter("emailFuncionario");
            String telefone = request.getParameter("telefoneFuncionario");
            String dataAdmissao = request.getParameter("dataAdmissao");
            String senha = "";
           // Part photo = request.getPart("foto");
            //String caminho = TratamentoImagem.execute(request);
            
            FuncionarioDTO funcionario = new FuncionarioDTO(turno, 0.0, setor, dataAdmissao, 0.0, cpf, rg, nome, dataNascimento, email, senha, telefone, sexo, estadoCivil, null);

            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            funcionarioDAO.inserir(funcionario);
            
            request.setAttribute("sucess", "Funcionario cadastrado com sucesso");

        }  catch(PersistenciaException | ClassNotFoundException | SQLException  e) {
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

   
           