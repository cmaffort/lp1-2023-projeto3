/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.dao.connection.ConexaoDB;
import br.cefetmg.altomare.model.dto.PacoteDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PacoteDAO implements IPacoteDAO {

    Connection connection;

    public PacoteDAO() throws SQLException, ClassNotFoundException {
        this.connection = ConexaoDB.inicializaDB();
    }

    /**
     *
     * @param pacote
     * @throws SQLException
     */
    @Override
    public void inserirPacote(PacoteDTO pacote) throws SQLException {
    String sql = "INSERT INTO pacote (nome,cpf,telefone,destino,datapart,duracao) VALUES (?,?,?,?,?,?)";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, pacote.getNomeContratante());
        statement.setString(2, pacote.getCpfContratante());
        statement.setString(3, pacote.getTelefoneContratante());
        statement.setString(4, pacote.getDestino());
        statement.setString(5, pacote.getDataPartida());
        statement.setString(6, pacote.getDuracaoCruzeiro());

        statement.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e);
    } finally {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    }
    
    /**
     *
     * @param cpf
     * @return
     * @throws SQLException
     */
    @Override
    public PacoteDTO obterPacotePorCPF(String cpf) throws SQLException {
    String sql = "SELECT * FROM pacote WHERE cpf = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, cpf);

        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                return extrairPacoteDoResultSet(resultSet);
            }
        }
    }
    return null; 
}
public ArrayList<PacoteDTO> listarPacotes() throws SQLException {
    ArrayList<PacoteDTO> pacotes = new ArrayList<>();
    String sql = "SELECT * FROM pacote";

    try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            PacoteDTO pacote = extrairPacoteDoResultSet(resultSet);
            pacotes.add(pacote);
        }

    } catch (SQLException e) {
        System.out.println(e);
        throw e;
    }

    return pacotes;
}
private PacoteDTO extrairPacoteDoResultSet(ResultSet resultSet) throws SQLException {
    PacoteDTO pacote = new PacoteDTO();
    pacote.setNomeContratante(resultSet.getString("nome"));
    pacote.setCpfContratante(resultSet.getString("cpf"));
    pacote.setTelefoneContratante(resultSet.getString("telefone"));
    pacote.setDestino(resultSet.getString("destino"));
    pacote.setDataPartida(resultSet.getString("datapart"));
    pacote.setDuracaoCruzeiro(resultSet.getString("duracao"));

    return pacote;
}


}
