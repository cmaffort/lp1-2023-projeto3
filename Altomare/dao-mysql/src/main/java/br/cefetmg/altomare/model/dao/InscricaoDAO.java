
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.dto.InscricaoDTO;
import br.cefetmg.altomare.model.dao.IInscricaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
