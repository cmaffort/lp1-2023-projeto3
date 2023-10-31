package br.cefetmg.altomare.idao;

import br.cefetmg.altomare.dto.ProdutoDTO;
import java.sql.SQLException;
import java.util.List;


public interface IProdutoDAO {
    
    public void inserirProduto(ProdutoDTO produto) throws SQLException;
    public void atualizarProduto(ProdutoDTO produto) throws SQLException;
    public void excluirProduto(int produtoId) throws SQLException;
    public List<ProdutoDTO> listarProdutos() throws SQLException;
    
}
