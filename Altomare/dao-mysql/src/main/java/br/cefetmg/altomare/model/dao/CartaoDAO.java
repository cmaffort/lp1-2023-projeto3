package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.CartaoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import java.util.*;
import java.sql.Date;

public class CartaoDAO implements ICartaoDAO{
    @Override
    public boolean inserir(CartaoDTO cartao) {

        String sql = "INSERT INTO cartao (titular, vencimento, cvv, numero, id_conta"
                + ") VALUES(?, ?, ?, ?, ?)";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cartao.getTitular());
            pstmt.setDate(2, new java.sql.Date(cartao.getVencimento().getTime()));
            pstmt.setInt(3, cartao.getCvv());
            pstmt.setLong(4, cartao.getNumero());
            pstmt.setLong(5, cartao.getIdConta());
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
    public boolean atualizar(CartaoDTO cartao){

        String sql = "UPDATE cartao " +
                       " SET titular = ?, " +
                       "     vencimento = ? " +
                       "     cvv = ? " +
                       "     numero = ? " +
                       "     id_conta = ? " +
                       " WHERE id_cartao = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cartao.getTitular());
            pstmt.setDate(2, new java.sql.Date(cartao.getVencimento().getTime()));
            pstmt.setInt(3, cartao.getCvv());
            pstmt.setLong(5, cartao.getNumero());
            pstmt.setLong(6, cartao.getIdConta()); //java.util.Date != sql Date
            pstmt.setLong(1, cartao.getIdCartao());
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
    public boolean deletar(CartaoDTO cartao) {

        String sql = "DELETE FROM cartao WHERE id = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cartao.getIdCartao());
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
    public ArrayList<CartaoDTO> buscaPorIdConta(Long id) {
         try {
            Connection connection = ConexaoDB.inicializaDB();

            String sql = "SELECT * FROM cartao WHERE id_conta = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<CartaoDTO> cartoesEncontrados = new ArrayList<>();
            CartaoDTO cartao;
            if (rs.next()) {
                cartao = new CartaoDTO();
                cartao.setIdCartao(rs.getLong("id_cartao"));
                cartao.setTitular(rs.getString("titular"));
                cartao.setVencimento(rs.getDate("vencimento"));
                cartao.setCvv(rs.getInt("cvv"));
                cartao.setNumero(rs.getLong("numero"));
                cartao.setIdConta(rs.getLong("id_conta"));
                
                cartoesEncontrados.add(cartao);
            }

            rs.close();
            pstmt.close();
            connection.close();
            
            return cartoesEncontrados;
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
    }
}
