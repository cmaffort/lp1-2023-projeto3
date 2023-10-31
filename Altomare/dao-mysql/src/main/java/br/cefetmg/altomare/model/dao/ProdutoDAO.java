package br.cefetmg.altomare.dao.mysql;

import br.cefetmg.altomare.dto.ProdutoDTO;
import br.cefetmg.altomare.idao.IProdutoDAO;
import java.sql.Connection;
import br.cefetmg.altomare.dao.mysql.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {

        Connection connection;


    public ProdutoDAO() throws SQLException, ClassNotFoundException {
        this.connection = ConexaoDB.inicializaDB();
        
    }

    public void inserirProduto(ProdutoDTO produto) throws SQLException {
        String sql = "INSERT INTO produtos (nome, tipo, preco, estado,quantidade, data) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getTipo());
            statement.setDouble(3, produto.getPreco());
            statement.setString(4, produto.getEstado());
            statement.setInt(5, produto.getQuantidade());
            statement.setDate(6, new java.sql.Date(produto.getData().getTime()));
            statement.executeUpdate();
              
           String updateQuantidadeTotalSQL = "UPDATE produtos SET quantidade_total = quantidade_total + ? WHERE nome = ?";
    try (PreparedStatement updateStatement = connection.prepareStatement(updateQuantidadeTotalSQL)) {
        updateStatement.setInt(1, produto.getQuantidade());
        updateStatement.setString(2, produto.getNome());
        updateStatement.executeUpdate();
    }                            
    
     try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

        }
    }

    public void atualizarProduto(ProdutoDTO produto) throws SQLException {
        String sql = "UPDATE produtos SET nome = ?, preco = ?, estado = ?,quantidade = ?,data = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPreco());
            statement.setString(3, produto.getEstado());
            statement.setInt(4, produto.getId());
             statement.setInt(5, produto.getQuantidade());
            statement.setDate(6, new java.sql.Date(produto.getData().getTime()));
            statement.executeUpdate();
        }
         try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
    }

    public void excluirProduto(int produtoId) throws SQLException {
        String sql = "DELETE FROM produtos WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, produtoId);
            statement.executeUpdate();
        }
         try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
    }

    public List<ProdutoDTO> listarProdutos() throws SQLException {
        List<ProdutoDTO> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                ProdutoDTO produto = new ProdutoDTO();
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setTipo(resultSet.getString("tipo"));
                produto.setPreco(resultSet.getDouble("preco"));
                produto.setEstado(resultSet.getString("estado"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produto.setData(resultSet.getDate("data"));


                produtos.add(produto);
            }
        }
        
         try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
         
                return produtos;

    }
}
