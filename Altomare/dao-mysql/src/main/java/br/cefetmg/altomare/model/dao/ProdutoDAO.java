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

public class ProdutoDAO implements IProdutoDAO {

    Connection connection;

    public ProdutoDAO() throws SQLException, ClassNotFoundException {
        this.connection = ConexaoDB.inicializaDB();
    }

    @Override
    public void inserirProduto(ProdutoDTO produto) throws SQLException, ClassNotFoundException {
        String inserirSQL = "INSERT INTO produto (nome, tipo, preco, estado, quantidade, data) VALUES (?,?,?,?,?,?)";
        String atualizarQuantidadeTotalSQL = "UPDATE produto SET quantidade_total = quantidade_total + ? WHERE nome = ?";

        try (PreparedStatement inserirStatement = connection.prepareStatement(inserirSQL); PreparedStatement atualizarQuantidadeTotalStatement = connection.prepareStatement(atualizarQuantidadeTotalSQL)) {

            connection.setAutoCommit(false);

            inserirStatement.setString(1, produto.getNome());
            inserirStatement.setString(1, produto.getNome());
            inserirStatement.setString(2, produto.getTipo());
            inserirStatement.setDouble(3, produto.getPreco());
            inserirStatement.setString(4, produto.getEstado());
            inserirStatement.setInt(5, produto.getQuantidade());
            
            
            if (produto.getData() != null) {
            inserirStatement.setDate(5, new java.sql.Date(produto.getData().getTime()));
        } else {
            inserirStatement.setDate(5, null);
        }
            inserirStatement.executeUpdate();
        
            atualizarQuantidadeTotalStatement.setInt(1, produto.getQuantidade());
            atualizarQuantidadeTotalStatement.setString(2, produto.getNome());
            atualizarQuantidadeTotalStatement.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public void atualizarProduto(ProdutoDTO produto) throws SQLException {
        String sql = "UPDATE produto SET nome = ?, preco = ?, estado = ?, quantidade = ?, data = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPreco());
            statement.setString(3, produto.getEstado());
            statement.setInt(4, produto.getQuantidade());
            statement.setDate(5, new java.sql.Date(produto.getData().getTime()));
            statement.setInt(6, produto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void excluirProduto(String nome) {
        String sql = "DELETE FROM produto WHERE nome = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
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
                produto.setData(resultSet.getDate("data"));

                produtos.add(produto);
            }

        } catch (SQLException e) {
            System.out.println(e);
            throw e;
        }

        return produtos;
    }

}
