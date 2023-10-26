package br.cefetmg.altomare.dao;

import br.cefetmg.altomare.dto.ProdutoDTO;
import java.util.List;


public interface IProdutoDAO {
    
    public void inserirProduto(ProdutoDTO produto);
    public void atualizarProduto(ProdutoDTO produto); 
    public void excluirProduto(int produtoId);
    public List<ProdutoDTO> listarProdutos();
    
}
