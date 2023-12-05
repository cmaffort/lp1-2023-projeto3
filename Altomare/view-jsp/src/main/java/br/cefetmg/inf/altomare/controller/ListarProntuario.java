package br.cefetmg.inf.altomare.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.model.dao.SaudeDAO;
import br.cefetmg.altomare.model.dto.SaudeDTO;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ListarProntuario", urlPatterns = {"/ListarProntuario"})
public class ListarProntuario extends HttpServlet {

    public static String doPost(HttpServletRequest request) throws ClassNotFoundException {
        String jsp = "";

        try {
            SaudeDAO saudeDAO = new SaudeDAO();
            List<SaudeDTO> prontuarios = saudeDAO.listarProntuarios();
         
            if (prontuarios != null && !prontuarios.isEmpty()) {
                request.setAttribute("prontuarios", prontuarios);
                jsp = "/listarProntuarios.jsp";
            } else {
                String erro = "Não há registros de prontuários.";
                request.setAttribute("erro", erro);
                jsp = "/erro.jsp";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            jsp = "";
        }

        return jsp;
    }
}
