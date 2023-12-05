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
import java.io.BufferedInputStream;


@WebServlet("/BaixarPdf")
public class BaixarPdf extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cpf = request.getParameter("cpf");

        // Validação básica do CPF (você pode usar bibliotecas de validação de CPF mais robustas)
        if (cpf == null || !cpf.matches("\\d{11}")) {
            response.getWriter().write("CPF inválido.");
            return;
        }

        String diretorioContratos = getServletContext().getRealPath("/contratos");

        String caminhoArquivo = Paths.get(diretorioContratos, cpf + "_contrato.pdf").toString();

        File arquivo = new File(caminhoArquivo);

        if (!arquivo.exists()) {
            response.getWriter().write("Contrato não encontrado para o CPF fornecido.");
            return;
        }

        response.setHeader("Content-Disposition", "attachment; filename=contrato.pdf");
        response.setContentType("application/pdf");

        try (FileInputStream inputStream = new FileInputStream(arquivo);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                OutputStream outputStream = response.getOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            response.getWriter().write("Erro ao baixar o contrato.");
            e.printStackTrace();
        }
    }
}

