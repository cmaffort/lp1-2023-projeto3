package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.DespesaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.cefetmg.altomare.idao.IDespesaDAO;

public class DespesaDAO implements IDespesaDAO{
    @Override
    public boolean inserir(DespesaDTO despesa) {

        Connection connection = ConexaoDB.inicializaDB();

        String sql = "INSERT INTO despesa (id_despesa, valor, foi_registrada, tipo, descricao, data_ocorrencia"
                + ") VALUES(?, ?, ?, ?, ?, ?)";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1, despesa.getIdDespesa());
        pstmt.setDouble(2, despesa.getValor());
        pstmt.setBoolean(3, despesa.getStatus());
        pstmt.setString(4, despesa.getTipo());
        pstmt.setString(5, despesa.getDescricao());
        pstmt.setString(6, despesa.getDataOcorrencia()); //setDate() não funciona 
        ResultSet rs = pstmt.executeQuery();

        rs.close();
        pstmt.close();
        connection.close();
        
        return true;
    }

    @Override
    public boolean atualizar(DespesaDTO despesa){

        Connection connection = ConexaoDB.inicializaDB();

        String sql = "UPDATE despesa " +
                       " SET valor = ?, " +
                       "     foi_registrada = ? " +
                       "     tipo = ? " +
                       "     descricao = ? " +
                       "     data_ocorrencia = ? " +
                       " WHERE id_despesa = ?";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setDOuble(1, despesa.getValor());
        pstmt.setBoolean(2, despesa.getStatus());
        pstmt.setString(3, despesa.getTipo());
        pstmt.setString(5, despesa.getDescricao());
        pstmt.setString(6, despesa.getDataOcorrencia()); //setDate() não funciona 
        pstmt.setLong(1, despesa.getIdDespesa());
        pstmt.executeUpdate();

        pstmt.close();
        connection.close();

        return true;
    }

    @Override
    public boolean deletar(DespesaDTO despesa) {
        
        Connection connection = ConexaoDB.inicializaDB();

        String sql = "DELETE FROM despesa WHERE id = ?";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1, despesa.getIdDespesa());
        pstmt.executeUpdate();

        pstmt.close();
        connection.close();
        
        return true;
    }
}