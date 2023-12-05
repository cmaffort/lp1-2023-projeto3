package br.cefetmg.altomare.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.CardapioDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CardapioDAO implements ICardapioDAO {

    Connection connection;

    public CardapioDAO() throws SQLException, ClassNotFoundException {
        this.connection = ConexaoDB.inicializaDB();
    }

    @Override
    public void inserir(CardapioDTO item) throws PersistenciaException {
        String sql = "INSERT INTO cardapio (Id, Nome, Preco, Descricao, Foto) VALUES(?,?,?,?,?)";

        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, item.getId());
            statement.setString(2, item.getNome());
            statement.setString(3, item.getPreco());
            statement.setString(4, item.getDescricao());
            statement.setString(5, item.getFoto());
            statement.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
    }

    @Override
    public boolean atualizar(CardapioDTO item) throws PersistenciaException {
        String sql = "UPDATE cardapio SET Nome = ?, Preco = ?, Descricao = ?, Foto = ? WHERE Id = ?";
        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, item.getId());
            statement.setString(2, item.getNome());
            statement.setString(3, item.getPreco());
            statement.setString(4, item.getDescricao());
            statement.setString(5, item.getFoto());
            statement.executeUpdate();
            statement.close();
            
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
        return consultarPorId(item.getId()) != null;
    }

    @Override
    public boolean delete(CardapioDTO cardapio) throws PersistenciaException {
        String sql = "DELETE FROM cardapio WHERE Id = ?";
        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(3, cardapio.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CardapioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public ArrayList<CardapioDTO> listarTodos() throws PersistenciaException {
        ArrayList<CardapioDTO> cardapio = new ArrayList<>();
        String sql = "SELECT * FROM cardapio";
        try ( PreparedStatement statement = connection.prepareStatement(sql);  ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                CardapioDTO item = new CardapioDTO();
                item.setId(resultSet.getString("Id"));
                item.setNome(resultSet.getString("Nome"));
                item.setPreco(resultSet.getString("Preco"));
                item.setDescricao(resultSet.getString("Descricao"));
                item.setFoto(resultSet.getString("Foto"));
                cardapio.add(item);
            }

        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
        return cardapio;
    }

    @Override
    public CardapioDTO consultarPorId(String id) throws PersistenciaException {
        CardapioDTO item = new CardapioDTO();
        String sql = "SELECT * FROM cardapio WHERE Id = ?";

        try ( PreparedStatement statement = connection.prepareStatement(sql);  ResultSet resultSet = statement.executeQuery()) {
            statement.setString(3, id);
            item.setId(resultSet.getString("Id"));
            item.setNome(resultSet.getString("Nome"));
            item.setPreco(resultSet.getString("Preco"));
            item.setDescricao(resultSet.getString("Descricao"));
            item.setFoto(resultSet.getString("Foto"));
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }

        return item;
    }
    
    @Override
    public CardapioDTO consultarPorNome(String nome) throws PersistenciaException {
        CardapioDTO item = new CardapioDTO();
        String sql = "SELECT * FROM cardapio WHERE Nome = ?";

        try ( PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
            statement.setString(2, nome);
            item.setId(resultSet.getString("Id"));
            item.setNome(resultSet.getString("Nome"));
            item.setPreco(resultSet.getString("Preco"));
            item.setDescricao(resultSet.getString("Descricao"));
            item.setFoto(resultSet.getString("Foto"));
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }

        return item;
    }

}
