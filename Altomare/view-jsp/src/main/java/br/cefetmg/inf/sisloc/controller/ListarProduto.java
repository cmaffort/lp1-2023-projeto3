package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.dao.mysql.ProdutoDAO;
import br.cefetmg.altomare.dto.ProdutoDTO;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ListarProduto", urlPatterns = {"/ListarProduto"})
public class ListarProduto extends HttpServlet {

    public static String execute(HttpServletRequest request) {
        String jsp = "";

        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            List<ProdutoDTO> produtos = produtoDAO.listarProdutos();
            request.setAttribute("produtos", produtos);
            jsp = "listar.jsp"; // Define a página para listar os produtos
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            jsp = "erro.jsp"; // Define a página de erro
        }

        return jsp;
    }
}
