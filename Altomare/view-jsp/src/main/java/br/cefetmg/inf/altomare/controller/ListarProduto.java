

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

@WebServlet(name = "ListarProduto", urlPatterns = {"/ListarProduto"})
public class ListarProduto extends HttpServlet {

    public static String execute(HttpServletRequest request) {
        String jsp = "";

        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            List<ProdutoDTO> produtos = produtoDAO.listarProdutos();
         
         
            if(produtos != null){
                request.setAttribute("produtos", produtos);
                jsp = "/listar.jsp";
            }else{
                String erro = "Não há registros.";
                request.setAttribute("erro", erro);
                jsp = "/erro.jsp";
            }
        }catch(Exception e){
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
    
}
