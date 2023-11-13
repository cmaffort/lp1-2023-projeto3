package br.cefetmg.inf.altomare.controller;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.model.dao.ProdutoDAO;
import br.cefetmg.altomare.model.dto.ProdutoDTO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "AlterarProduto", urlPatterns = {"/AlterarProduto"})
public class AlterarProduto extends HttpServlet {

    public static String execute(HttpServletRequest request) {
        String jsp = "";

        String idStr = request.getParameter("idProduto");
        String nome = request.getParameter("novoNome");
        String precoStr = request.getParameter("novoPreco");
        String estado = request.getParameter("novoEstado");
        String tipo = request.getParameter("novoTipoProduto");
        String quantidadeStr = request.getParameter("Novaquantidade");
        String dataStr = request.getParameter("novaDataEntrada");

        int produtoId = Integer.parseInt(idStr);
        double preco = Double.parseDouble(precoStr);

        int quantidade = 0;
        if (quantidadeStr != null && !quantidadeStr.isEmpty()) {
            quantidade = Integer.parseInt(quantidadeStr);
        }
            
        Date data = Date.valueOf(dataStr);

        ProdutoDTO produto = new ProdutoDTO(nome, preco, tipo, estado, produtoId, quantidade, data);

        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();

            try {
                produtoDAO.atualizarProduto(produto);
                jsp = "index.jsp"; // Define a página para redirecionar
            } catch (SQLException ex) {
                ex.printStackTrace();
                jsp = "index.jsp"; // Define a página de erro
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            jsp = "erro.jsp"; // Define a página de erro
        }

        return jsp;
    }
}
