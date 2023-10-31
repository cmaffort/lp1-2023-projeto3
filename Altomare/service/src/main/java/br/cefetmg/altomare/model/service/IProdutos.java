package br.cefetmg.altomare.service;

import br.cefetmg.altomare.dto.ProdutoDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public interface IProduto {
    public void inserirProduto(ProdutoDTO produto) throws SQLException;
    public void atualizarProduto(ProdutoDTO produto) throws SQLException;
    public void excluirProduto(int produtoId) throws SQLException;
    public List<ProdutoDTO> listarProdutos() throws SQLException;
    
}
