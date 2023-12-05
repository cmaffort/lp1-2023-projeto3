package br.cefetmg.inf.altomare.controller;

import br.cefetmg.inf.altomare.controller.GerarContratoPDF;
import br.cefetmg.altomare.model.dao.PacoteDAO;

import br.cefetmg.altomare.model.dto.PacoteDTO;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ContratoServlet")
public class ContratoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomeContratante = request.getParameter("nomeContratante");
        String cpfContratante = request.getParameter("cpfContratante");
        String telefoneContratante = request.getParameter("telefoneContratante");
        String destino = request.getParameter("destino");
        String dataPartida = request.getParameter("dataPartida");
        String duracaoCruzeiro = request.getParameter("duracaoCruzeiro");
        String cabine = request.getParameter("cabine");
        String classe = request.getParameter("classe");

        try {
            PacoteDTO pacote = new PacoteDTO();

            pacote.setNomeContratante(nomeContratante);
            pacote.setCpfContratante(cpfContratante);
            pacote.setTelefoneContratante(telefoneContratante);
            pacote.setDestino(destino);
            pacote.setDataPartida(dataPartida);
            pacote.setDuracaoCruzeiro(duracaoCruzeiro);
            pacote.setCabine(cabine);
            pacote.setClasse(classe);

            PacoteDAO pacoteDAO = new PacoteDAO();
            pacoteDAO.inserirPacote(pacote);

            PacoteDTO pacoteRecuperado = pacoteDAO.obterPacotePorCPF(cpfContratante);
            request.setAttribute("pacote", pacoteRecuperado);
            request.getRequestDispatcher("/PacotePassageiro.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

        byte[] contrato = GerarContratoPDF.gerarContratoCruzeiroPDF(nomeContratante,
                telefoneContratante, cpfContratante, destino, dataPartida, duracaoCruzeiro);

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=contrato_" + request.getParameter("nomeContratante") + ".pdf");

        try (OutputStream out = response.getOutputStream()) {
            out.write(contrato);
        }
    }

}
