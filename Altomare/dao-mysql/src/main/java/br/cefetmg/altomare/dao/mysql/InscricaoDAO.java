/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dao.mysql;

import br.cefetmg.altomare.dto.InscricaoDTO;
import br.cefetmg.altomare.idao.IInscricaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author letic
 */
public class InscricaoDAO implements IInscricaoDAO {
    private Connection connection; 

    public InscricaoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inserirInscricao(InscricaoDTO inscricao) {
        String sql = "INSERT INTO inscricoes(atividade, usuario) VALUES (?, ?)";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, inscricao.getAtividade());
            preparedStatement.setString(2, inscricao.getUsuario());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cancelarInscricao(InscricaoDTO inscricao) {
        String sql = "DELETE FROM inscricoes WHERE atividade = ?, usuario = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, inscricao.getAtividade());
            preparedStatement.setString(2, inscricao.getUsuario());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
