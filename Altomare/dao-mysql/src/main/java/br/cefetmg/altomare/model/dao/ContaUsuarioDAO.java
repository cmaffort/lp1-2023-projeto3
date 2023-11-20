package br.cefetmg.altomare.model.dao;

import java.util.*;
import br.cefetmg.altomare.model.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.model.dto.DespesaDTO;
import br.cefetmg.altomare.model.dto.CartaoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.cefetmg.altomare.dao.connection.ConexaoDB;

public class ContaUsuarioDAO implements IContaUsuarioDAO{
    @Override
    public boolean inserir(ContaUsuarioDTO contaUsuario) {

        String sql = "INSERT INTO contausuario (esta_aberta, total, id_conta"
                + ") VALUES(?, ?, ?);";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setBoolean(1, contaUsuario.getStatusConta());
            pstmt.setDouble(2, contaUsuario.getTotal());
            pstmt.setLong(3, contaUsuario.getIdConta());
            pstmt.executeUpdate();
            
            String sqlToGetId = "SELECT * FROM contausuario ORDER BY id_conta DESC LIMIT 1;";
            PreparedStatement retornarIdConta = connection.prepareStatement(sql);
            ResultSet rs = retornarIdConta.executeQuery(sqlToGetId);
            
            Long idContaAdicionada = null;
            if (rs.next()) {
                idContaAdicionada = rs.getLong("id_conta");
                contaUsuario.setIdConta(idContaAdicionada);
            }

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

        String sql = "UPDATE contausuario " +
                       " SET esta_aberta = ?, " +
                       "     total = ? " +
                       " WHERE id_conta = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setBoolean(1, contaUsuario.getStatusConta());
            pstmt.setDouble(2, contaUsuario.getTotal());
            pstmt.setLong(3, contaUsuario.getIdConta());
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

        String sql = "DELETE FROM contausuario WHERE id_conta > ?"; // por enquanto coloquei >

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
    public ArrayList<DespesaDTO> getDespesas(ContaUsuarioDTO contaUsuario) {

        DespesaDAO pegaDespesas = new DespesaDAO();
            
        return pegaDespesas.buscaPorIdConta(contaUsuario.getIdConta());
        
    }
    
    @Override
    public ArrayList<CartaoDTO> getCartoes(ContaUsuarioDTO contaUsuario) {

        CartaoDAO pegaCartoes = new CartaoDAO();
            
        return pegaCartoes.buscaPorIdConta(contaUsuario.getIdConta());
        
    }
    
    @Override
    public ContaUsuarioDTO getContaPorId(Long id) {
        try {
            Connection connection = ConexaoDB.inicializaDB();

            String sql = "SELECT * FROM contausuario WHERE id_conta = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();

            ContaUsuarioDTO contaRecuperada = null;
            if (rs.next()) {
                contaRecuperada = new ContaUsuarioDTO();
                contaRecuperada.setStatusConta(rs.getBoolean("esta_aberta"));
                contaRecuperada.setTotal(rs.getDouble("total"));
                contaRecuperada.setIdConta(rs.getLong("id_conta"));
            }

            rs.close();
            pstmt.close();
            connection.close();
            
            return contaRecuperada;
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
    }
}