package br.cefetmg.inf.altomare.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BaixarPdf")
public class BaixarPdf extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cpf = request.getParameter("cpf");

        String diretorioContratos = getServletContext().getRealPath("/contratos");

        String caminhoArquivo = Paths.get(diretorioContratos, cpf + "_contrato.pdf").toString();

        response.setHeader("Content-Disposition", "attachment; filename=contrato.pdf");
        response.setContentType("application/pdf");

        try (FileInputStream inputStream = new FileInputStream(new File(caminhoArquivo));
                OutputStream outputStream = response.getOutputStream()) {

            // Lê o conteúdo do arquivo e o escreve na resposta
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            response.getWriter().write("Erro ao baixar o contrato.");
        }
    }
}
