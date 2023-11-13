package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dto.ProdutoDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public interface IProduto {
    public void inserirProduto(ProdutoDTO produto) throws SQLException;
    public void atualizarProduto(ProdutoDTO produto) throws SQLException;
    public void excluirProduto(String nome) throws SQLException;
    public ArrayList<ProdutoDTO> listarProdutos() throws SQLException;
    
}
