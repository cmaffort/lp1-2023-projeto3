package br.cefetmg.altomare.dao.mysql;

import br.cefetmg.altomare.dto.AtividadeDTO;
import br.cefetmg.altomare.idao.IAtividadeDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtividadeDAO implements IAtividadeDAO {

    private Connection connection; 

    public AtividadeDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirAtividade(AtividadeDTO atividade) {
        String sql = "INSERT INTO atividades (nome, data, hora_inicio, hora_termino, local, limite_ocupacao, responsavel, descricao, visivel) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, atividade.getNome());
            preparedStatement.setString(2, atividade.getData());
            preparedStatement.setString(3, atividade.getHoraInicio());
            preparedStatement.setString(4, atividade.getHoraTermino());
            preparedStatement.setString(5, atividade.getLocal());
            preparedStatement.setInt(6, atividade.getLimiteOcupacao());
            preparedStatement.setString(7, atividade.getResponsavel());
            preparedStatement.setString(8, atividade.getDescricao());
            preparedStatement.setBoolean(9, atividade.isVisivel());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }

    public void atualizarAtividade(AtividadeDTO atividade) {
        String sql = "UPDATE atividades SET data = ?, horaInicio = ?, horaTrmino = ?, "
                + "local = ?, limiteOcupacao = ?, responsavel = ?, descricao = ?, visivel = ? "
                + "WHERE nome = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, atividade.getNome());
            preparedStatement.setString(2, atividade.getData());
            preparedStatement.setString(3, atividade.getHoraInicio());
            preparedStatement.setString(4, atividade.getHoraTermino());
            preparedStatement.setString(5, atividade.getLocal());
            preparedStatement.setInt(6, atividade.getLimiteOcupacao());
            preparedStatement.setString(7, atividade.getResponsavel());
            preparedStatement.setBoolean(8, atividade.isVisivel());
            preparedStatement.setString(9, atividade.getDescricao());
             
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }

    public boolean lotado(AtividadeDTO atividade) {
        String sql = "SELECT * FROM inscricoes WHERE atividade = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, atividade.getNome());
            
            int rows = preparedStatement.executeUpdate();
            
            return rows == atividade.getLimiteOcupacao();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private List<AtividadeDTO> listar(boolean incluirInvisivel) {
        List<AtividadeDTO> atividades = new ArrayList<>();
        String sql = "SELECT * FROM atividades";
        
        if (!incluirInvisivel)
            sql += " WHERE visivel = 1";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                AtividadeDTO atividade = new AtividadeDTO(
                        resultSet.getString("nome"),
                        resultSet.getString("data"),
                        resultSet.getString("hora_inicio"),
                        resultSet.getString("hora_termino"),
                        resultSet.getString("local"),
                        resultSet.getInt("limite_ocupacao"),
                        resultSet.getString("responsavel"),
                        resultSet.getString("descricao"),
                        resultSet.getBoolean("visivel")
                );
                atividades.add(atividade);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Trate o erro apropriadamente
        }

        return atividades;
    }

    public List<AtividadeDTO> listarAtividades() {
        return listar(true);
    }
    
    public List<AtividadeDTO> listarAtividadesVisiveis() {
        return listar(false);
    }
}
