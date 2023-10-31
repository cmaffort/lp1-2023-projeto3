package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.DespesaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.cefetmg.altomare.dao.connection.ConexaoDB;

public class DespesaDAO implements IDespesaDAO{
    @Override
    public boolean inserir(DespesaDTO despesa) {

        String sql = "INSERT INTO despesa (id_despesa, valor, foi_registrada, tipo, descricao, data_ocorrencia"
                + ") VALUES(?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, despesa.getIdDespesa());
            pstmt.setDouble(2, despesa.getValor());
            pstmt.setBoolean(3, despesa.getStatus());
            pstmt.setString(4, despesa.getTipo());
            pstmt.setString(5, despesa.getDescricao());
            //pstmt.setString(6, despesa.getDataOcorrencia()); java.util.Date != sql Date 
            ResultSet rs = pstmt.executeQuery();

            rs.close();
            pstmt.close();
            connection.close();
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
        
        return true;
    }

    @Override
    public boolean atualizar(DespesaDTO despesa){

        String sql = "UPDATE despesa " +
                       " SET valor = ?, " +
                       "     foi_registrada = ? " +
                       "     tipo = ? " +
                       "     descricao = ? " +
                       "     data_ocorrencia = ? " +
                       " WHERE id_despesa = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, despesa.getValor());
            pstmt.setBoolean(2, despesa.getStatus());
            pstmt.setString(3, despesa.getTipo());
            pstmt.setString(5, despesa.getDescricao());
            //pstmt.setString(6, despesa.getDataOcorrencia()); //java.util.Date != sql Date
            pstmt.setLong(1, despesa.getIdDespesa());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }

        return true;
    }

    @Override
    public boolean deletar(DespesaDTO despesa) {

        String sql = "DELETE FROM despesa WHERE id = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, despesa.getIdDespesa());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
        
        return true;
    }
}