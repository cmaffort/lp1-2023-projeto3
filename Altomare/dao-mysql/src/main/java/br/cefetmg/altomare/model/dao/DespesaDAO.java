package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.DespesaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import java.util.*;
import java.sql.Date;

public class DespesaDAO implements IDespesaDAO{
    @Override
    public boolean inserir(DespesaDTO despesa) {

        String sql = "INSERT INTO despesa (valor, foi_registrada, tipo, descricao, data_ocorrencia, id_conta"
                + ") VALUES(?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, despesa.getValor());
            pstmt.setBoolean(2, despesa.getStatus());
            pstmt.setString(3, despesa.getTipo());
            pstmt.setString(4, despesa.getDescricao());
            pstmt.setString(5, despesa.getDataOcorrencia());
            pstmt.setLong(6, despesa.getIdConta());
            //ResultSet rs = pstmt.executeQuery();
            pstmt.execute();
            //rs.close();
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
            pstmt.setString(4, despesa.getDescricao());
            pstmt.setString(5, despesa.getDataOcorrencia());
            pstmt.setLong(6, despesa.getIdDespesa());
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

        String sql = "DELETE FROM despesa WHERE id_despesa = ?";

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
    
    @Override
    public ArrayList<DespesaDTO> buscaPorIdConta(Long id) {
         try {
            Connection connection = ConexaoDB.inicializaDB();

            String sql = "SELECT * FROM despesa WHERE id_conta = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<DespesaDTO> despesasEncontradas = new ArrayList<>();
            DespesaDTO despesa;
            while (rs.next()) {
                despesa = new DespesaDTO();
                despesa.setIdDespesa(rs.getLong("id_despesa"));
                despesa.setValor(rs.getDouble("valor"));
                despesa.setStatus(rs.getBoolean("foi_registrada"));
                despesa.setTipo(rs.getString("tipo"));
                despesa.setDescricao(rs.getString("descricao"));
                despesa.setDataOcorrencia(rs.getString("data_ocorrencia"));
                despesa.setIdConta(rs.getLong("id_conta"));
                
                despesasEncontradas.add(despesa);
            }

            rs.close();
            pstmt.close();
            connection.close();
            
            return despesasEncontradas;
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
    }
}