package br.cefetmg.inf.altomare.controller;
import br.cefetmg.altomare.model.dao.ProdutoDAO;
import br.cefetmg.altomare.model.dto.ProdutoDTO;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet("/CadastrarProduto")
public class CadastrarProduto extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public static String execute(HttpServletRequest request) {
        String jsp = "";

        try {
            String nome = request.getParameter("NAMEProd");
            String precoStr = request.getParameter("PrecProd");
            String estado = request.getParameter("EstadPro");
            String tipo = request.getParameter("tipoProduto");
            String quantidadeStr = request.getParameter("quantidade");
            String dataStr = request.getParameter("data");

            double preco = Double.parseDouble(precoStr);
            int quantidade = Integer.parseInt(quantidadeStr);
            Date data = Date.valueOf(dataStr);

            ProdutoDTO produto = new ProdutoDTO(nome, preco, tipo, estado, null, quantidade, data);

            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.inserirProduto(produto);

            jsp = "index.jsp"; 

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            jsp = "headerprodutos.jsp"; 
        }

        return jsp;
    }
}
