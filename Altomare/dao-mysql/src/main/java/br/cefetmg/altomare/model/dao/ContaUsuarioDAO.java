package br.cefetmg.altomare.model.dao;

import java.util.*;
import br.cefetmg.altomare.model.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.model.dto.DespesaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.cefetmg.altomare.dao.connection.ConexaoDB;

public class ContaUsuarioDAO implements IContaUsuarioDAO{
    @Override
    public boolean inserir(ContaUsuarioDTO contaUsuario) {

        String sql = "INSERT INTO conta_usuario (id_conta, historico, esta_aberta, total"
                + ") VALUES(?, ?, ?, ?)";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, contaUsuario.getIdConta());
            //pstmt.setArray(2, contaUsuario.getHistorico()); Array != ArrayList
            pstmt.setBoolean(3, contaUsuario.getStatusConta());
            pstmt.setDouble(4, contaUsuario.getTotal());
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
    public boolean atualizar(ContaUsuarioDTO contaUsuario){

        String sql = "UPDATE conta_usuario " +
                       " SET historico = ?, " +
                       "     esta_aberta = ? " +
                       "     total = ? " +
                       " WHERE id_conta = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            //pstmt.setArray(1, contaUsuario.getHistorico()); Array != ArrayList
            pstmt.setBoolean(2, contaUsuario.getStatusConta());
            pstmt.setDouble(3, contaUsuario.getTotal());
            pstmt.setLong(5, contaUsuario.getIdConta());
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
    public boolean delete(ContaUsuarioDTO contaUsuario) {

        String sql = "DELETE FROM conta_usuario WHERE id = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, contaUsuario.getIdConta());
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
    public ArrayList<DespesaDTO> getDespesas(ContaUsuarioDTO contaUsuario) { //tratar retorno da query -> rs não é ArrayList
 
        String sql = "SELECT historico FROM conta_usuario";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            pstmt.close();
            connection.close();
            
            return (ArrayList<DespesaDTO>) rs;
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
    }
}