
package br.cefetmg.inf.altomare.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.model.dao.ProdutoDAO;
import br.cefetmg.altomare.model.dto.ProdutoDTO;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ExcluirProduto", urlPatterns = {"/ExcluirProduto"})
public class ExcluirProduto extends HttpServlet {

public static String execute(HttpServletRequest request) {
        String jsp = "";

        try {
            String namePro = request.getParameter("Nome");
            

            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.excluirProduto(namePro);
            jsp = "index.jsp"; // Define a página de redirecionamento após a exclusão
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
            jsp = "erro.jsp"; // Define a página de erro
        }

        return jsp;
    }
}
