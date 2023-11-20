
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.dao.connection.ConexaoDB;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.SegurancaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SegurancaDAO implements ISegurancaDAO{
    
    Connection conexao;
    
    public SegurancaDAO () throws SQLException, ClassNotFoundException {
        conexao = ConexaoDB.inicializaDB();        
    }
    
    @Override
    public boolean Inserir(SegurancaDTO seguranca)throws PersistenciaException{
        String sql = "INSERT INTO Passageiro(Nome, Especificacao) VALUES(?,?)";
         
            try (PreparedStatement in = conexao.prepareStatement(sql)) {
               
                in.setString(1, seguranca.getNome());
                in.setString(2, seguranca.getEspecificacao());
      
                in.execute();
                in.close(); 
             } 
            catch (SQLException ex) {
                throw new PersistenciaException(ex.getMessage());
            }  
            return true;
    }
    
    @Override
    public boolean Deletar(String Nome)throws PersistenciaException{
         String sql = "DELETE FROM produto WHERE nome = ?";
        try (PreparedStatement in = conexao.prepareStatement(sql)) {
            in.setString(1, Nome);
            in.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
       return true;
    }
    
    @Override
    public ArrayList< SegurancaDTO> listarTodos() throws PersistenciaException{
         ArrayList<SegurancaDTO> seguranca = new ArrayList<>();
        String sql = "SELECT * FROM seguranca";
        try ( PreparedStatement in = conexao.prepareStatement(sql);  ResultSet resultSet = in.executeQuery()) {
            while (resultSet.next()) {
                SegurancaDTO seg = new SegurancaDTO();
                seg.setNome(resultSet.getString("Nome"));
                seg.setEspecificacao(resultSet.getString("Especificacao"));
   
                seguranca.add(seg);
               // in.close();
               // resultSet.close();
            }
        } 
        catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
        return seguranca;
    }
}
