package br.cefetmg.altomare.model.dao;

import java.util.*;
import br.cefetmg.altomare.model.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.dto.model.DespesaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.cefetmg.altomare.idao.IContaUsuarioDAO;

public class ContaUsuarioDAO implements IContaUsuarioDAO{
    @Override
    public boolean inserir(ContaUsuarioDTO contaUsuario) {

        Connection connection = ConexaoDB.inicializaDB();

        String sql = "INSERT INTO conta_usuario (id_conta, historico, esta_aberta, total"
                + ") VALUES(?, ?, ?, ?)";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1, contaUsuario.getIdConta());
        pstmt.setArray(2, contaUsuario.getHistorico());
        pstmt.setBoolean(3, contaUsuario.getStatusConta());
        pstmt.setDouble(4, contaUsuario.getTotal());
        ResultSet rs = pstmt.executeQuery();

        rs.close();
        pstmt.close();
        connection.close();
        
        return true;
    }

    @Override
    public boolean atualizar(ContaUsuarioDTO contaUsuario){

        Connection connection = ConexaoDB.inicializaDB();

        String sql = "UPDATE conta_usuario " +
                       " SET historico = ?, " +
                       "     esta_aberta = ? " +
                       "     total = ? " +
                       " WHERE id_conta = ?";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setArray(1, contaUsuario.getHistorico());
        pstmt.setBoolean(2, contaUsuario.getStatusConta());
        pstmt.setDouble(3, contaUsuario.getTotal());
        pstmt.setLong(5, contaUsuario.getIdConta());
        pstmt.executeUpdate();

        pstmt.close();
        connection.close();

        return true;
    }

    @Override
    public boolean delete(ContaUsuarioDTO contaUsuario) {
        
        Connection connection = ConexaoDB.inicializaDB();

        String sql = "DELETE FROM conta_usuario WHERE id = ?";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1, contaUsuario.getIdConta());
        pstmt.executeUpdate();

        pstmt.close();
        connection.close();
        
        return true;
    }
    
    @Override
    public ArrayList<DespesaDTO> getDespesas(ContaUsuarioDTO contaUsuario) { //tratar retorno da query -> rs não é ArrayList
        Connection connection = ConexaoDB.inicializaDB();

        String sql = "SELECT historico FROM conta_usuario";

        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        pstmt.close();
        connection.close();
        
        return (ArrayList<DespesaDTO>) rs;
    }
}