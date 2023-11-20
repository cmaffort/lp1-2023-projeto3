package br.cefetmg.inf.altomare.controller;
import java.io.File;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

@WebServlet("/TratamentoImagem")
public class TratamentoImagem extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected static String execute(HttpServletRequest request)
            throws ServletException, IOException {
        String nomePasta = "ImagemPassageiro";  

        File diretorio = new File(nomePasta);
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        String nomeFoto = "";
        for (Part part : request.getParts()) {
            nomeFoto = extractFileName(part);
            part.write(nomePasta + File.separator + nomeFoto);
        }

        String caminho = nomePasta + File.separator + nomeFoto;
        return caminho;

    }

    private static String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }
}
