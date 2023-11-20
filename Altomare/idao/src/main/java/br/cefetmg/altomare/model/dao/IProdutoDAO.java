package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.ProdutoDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public interface IProdutoDAO {
    
    public void inserirProduto(ProdutoDTO produto) throws SQLException,ClassNotFoundException;
    public void atualizarProduto(ProdutoDTO produto) throws SQLException;
    public void excluirProdutoNome(String nome) throws SQLException;
    public void excluirProdutoID(Integer Id) throws SQLException;
    public ArrayList<ProdutoDTO> listarProdutos() throws SQLException,ClassNotFoundException;
    
}
