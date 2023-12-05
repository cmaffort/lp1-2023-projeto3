package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dao.SaudeDAO;
import br.cefetmg.altomare.model.dto.SaudeDTO;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet(name = "CadastroProntuario", urlPatterns = {"/CadastroProntuario"})
public class CadastroProntuario extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jsp = "";

        try {
            String name = request.getParameter("nome");
            String cabine = request.getParameter("cabine");
            String genero = request.getParameter("genero");
            String telefone = request.getParameter("telefone");
            String datanas = request.getParameter("datanas");

            String medicamento = request.getParameter("medicamento");

            String observacao = request.getParameter("observacoes");

            SaudeDTO prontuario = new SaudeDTO();
            prontuario.setObservacao(observacao);

            prontuario.setName(name);
            prontuario.setCabine(cabine);
            prontuario.setGenero(genero);
            prontuario.setTelefone(telefone);
            prontuario.setDatanas(datanas);
            prontuario.setObservacao(observacao);
            prontuario.setMedicamento(medicamento);
            
            SaudeDAO saudeDAO = new SaudeDAO();
            saudeDAO.salvarProntuario(prontuario);

    jsp = request.getContextPath() + "/SalvarProntuario.jsp";


        } catch (SQLException | ClassNotFoundException ex) {
         System.out.println(ex);
   jsp = request.getContextPath() + "/SalvarProntuario.jsp";


        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);
        dispatcher.forward(request, response);
    }
}
