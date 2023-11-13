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

            int quantidade = 0;

            if (quantidadeStr != null && !quantidadeStr.isEmpty()) {
                try {
                    quantidade = Integer.parseInt(quantidadeStr);
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                }
            }
            Date data = null;

            if (dataStr != null && dataStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
                data = Date.valueOf(dataStr);
            } else {
                System.out.println("Formato de data inválido.");
            }

            ProdutoDTO produto = new ProdutoDTO();

            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setTipo(tipo);
            produto.setEstado(estado);
            produto.setQuantidade(quantidade);
            produto.setData(data);

            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.inserirProduto(produto);

            jsp = "index.jsp";

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
            jsp = "";
        }

        return jsp;
    }
}
