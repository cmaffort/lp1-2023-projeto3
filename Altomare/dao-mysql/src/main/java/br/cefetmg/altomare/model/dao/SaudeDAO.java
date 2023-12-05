/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.dao.connection.ConexaoDB;
import br.cefetmg.altomare.model.dto.ProdutoDTO;
import br.cefetmg.altomare.model.dto.SaudeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SaudeDAO implements ISaudeDAO {

    Connection connection;

    public SaudeDAO() throws SQLException, ClassNotFoundException {
        this.connection = ConexaoDB.inicializaDB();
    }

    @Override
    public void salvarProntuario(SaudeDTO prontuario) throws SQLException, ClassNotFoundException {
        String inserirSQL = "INSERT INTO Saude (name, cabine, genero, telefone, datanas, Observacao,medicamento) VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement inserirStatement = connection.prepareStatement(inserirSQL)) {

            inserirStatement.setString(1, prontuario.getName());
            inserirStatement.setString(2, prontuario.getCabine());
            inserirStatement.setString(3, prontuario.getGenero());
            inserirStatement.setString(4, prontuario.getTelefone());
            inserirStatement.setString(5, prontuario.getDatanas());
            inserirStatement.setString(6, prontuario.getObservacao());
            inserirStatement.setString(7, prontuario.getMedicamento());


            inserirStatement.executeUpdate();

        } catch (SQLException e) {

            throw e;
        } finally {

        }
    }

    @Override
    public ArrayList<SaudeDTO> listarProntuarios() throws SQLException {
        ArrayList<SaudeDTO> prontuarios = new ArrayList<>();
        String sql = "SELECT * FROM Saude";

        try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                SaudeDTO prontuario = new SaudeDTO();
                prontuario.setId(resultSet.getInt("id"));
                prontuario.setName(resultSet.getString("name"));
                prontuario.setCabine(resultSet.getString("cabine"));
                prontuario.setGenero(resultSet.getString("genero"));
                prontuario.setTelefone(resultSet.getString("telefone"));
                prontuario.setDatanas(resultSet.getString("datanas"));
                prontuario.setObservacao(resultSet.getString("Observacao"));
                prontuario.setMedicamento(resultSet.getString("medicamento"));

                
                prontuarios.add(prontuario);
            }

        } catch (SQLException e) {
            System.out.println(e);
            throw e;
        }

        return prontuarios;
    }
}
