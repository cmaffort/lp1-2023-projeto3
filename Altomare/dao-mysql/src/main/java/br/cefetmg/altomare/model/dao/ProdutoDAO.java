package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.dao.connection.ConexaoDB;
import br.cefetmg.altomare.model.dto.ProdutoDTO;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public  class ProdutoDAO implements IProdutoDAO {

    Connection connection;

    public ProdutoDAO() throws SQLException, ClassNotFoundException {
        this.connection = ConexaoDB.inicializaDB();
    }

    @Override
    public void inserirProduto(ProdutoDTO produto) throws SQLException, ClassNotFoundException {
        String inserirSQL = "INSERT INTO produto (nome, tipo, preco, estado, quantidade, data) VALUES (?,?,?,?,?,?)";
        String atualizarQuantidadeTotalSQL = "UPDATE produto SET quantidade_total = quantidade_total + ? WHERE nome = ?";

        try (PreparedStatement inserirStatement = connection.prepareStatement(inserirSQL); PreparedStatement atualizarQuantidadeTotalStatement = connection.prepareStatement(atualizarQuantidadeTotalSQL)) {

           

            inserirStatement.setString(1, produto.getNome());
            inserirStatement.setString(1, produto.getNome());
            inserirStatement.setString(2, produto.getTipo());
            inserirStatement.setDouble(3, produto.getPreco());
            inserirStatement.setString(4, produto.getEstado());
            inserirStatement.setInt(5, produto.getQuantidade());
            
            
            
            inserirStatement.setString(6,produto.getData() );
        
        
            inserirStatement.executeUpdate();
        
            atualizarQuantidadeTotalStatement.setInt(1, produto.getQuantidade());
            atualizarQuantidadeTotalStatement.setString(2, produto.getNome());
            atualizarQuantidadeTotalStatement.executeUpdate();

          

        } catch (SQLException e) {
            
            throw e;
        } finally {
            
        }
    }

    @Override
    public void atualizarProduto(ProdutoDTO produto) throws SQLException {
        String sql = "UPDATE produto SET nome = ?, preco = ?, estado = ?,tipo = ? , quantidade = ?, data = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPreco());
            statement.setString(3, produto.getEstado());
            statement.setString(4, produto.getTipo());
            statement.setInt(5, produto.getQuantidade());
            statement.setString(6,produto.getData() );
            statement.setInt(7, produto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    @Override
    public void excluirProdutoNome(String nome) {
   
        String sql = "DELETE FROM produto WHERE nome = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
   @Override     
public void excluirProdutoID(Integer Id) {
   
        String sql = "DELETE FROM produto WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, Id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public ArrayList<ProdutoDTO> listarProdutos() throws SQLException {
        ArrayList<ProdutoDTO> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                ProdutoDTO produto = new ProdutoDTO();
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setTipo(resultSet.getString("tipo"));
                produto.setPreco(resultSet.getDouble("preco"));
                produto.setEstado(resultSet.getString("estado"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produto.setData(resultSet.getString("data"));

                produtos.add(produto);
            }

        } catch (SQLException e) {
            System.out.println(e);
            throw e;
        }

        return produtos;
    }
}

   
