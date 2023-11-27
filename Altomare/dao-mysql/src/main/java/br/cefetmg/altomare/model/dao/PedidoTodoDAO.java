package br.cefetmg.altomare.model.dao;

import java.util.*;
import br.cefetmg.altomare.model.dto.PedidoTodoDTO;
import br.cefetmg.altomare.model.dto.PedidoUnidadeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.cefetmg.altomare.dao.connection.ConexaoDB;

public class PedidoTodoDAO implements IPedidoTodoDAO{
    @Override
    public boolean inserir(PedidoTodoDTO pedidoTodo) {

        String sql = "INSERT INTO contausuario (total, finalizado, data_criacao, estado, tipo"
                + ") VALUES(?, ?, ?, ?, ?);";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, pedidoTodo.getTotal());
            pstmt.setBoolean(2, pedidoTodo.getStatus());
            pstmt.setString(3, pedidoTodo.getDataCriacao());
            pstmt.setString(4, pedidoTodo.getEstado());
            pstmt.setString(5, pedidoTodo.getTipo());
            pstmt.executeUpdate();
            
            String sqlToGetId = "SELECT * FROM pedidotodo ORDER BY id_pedido_todo DESC LIMIT 1;";
            PreparedStatement retornarIdPedidoTodo = connection.prepareStatement(sql);
            ResultSet rs = retornarIdPedidoTodo.executeQuery(sqlToGetId);
            
            Long idPedidoTodoAdicionado = null;
            if (rs.next()) {
                idPedidoTodoAdicionado = rs.getLong("id_pedido_todo");
                pedidoTodo.setIdPedidoTodo(idPedidoTodoAdicionado);
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
    public boolean atualizar(PedidoTodoDTO pedidoTodo){

        String sql = "UPDATE pedidotodo " +
                       " SET total = ?, " +
                       " finalizado = ?, " +
                       " data_cricao = ?, " +
                       " estado = ?, " +
                       " tipo = ? " +
                       " WHERE id_pedido_todo = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, pedidoTodo.getTotal());
            pstmt.setBoolean(2, pedidoTodo.getStatus());
            pstmt.setString(3, pedidoTodo.getDataCriacao());
            pstmt.setString(4, pedidoTodo.getEstado());
            pstmt.setString(5, pedidoTodo.getTipo());
            pstmt.setLong(6, pedidoTodo.getIdPedidoTodo());
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
    public boolean delete(PedidoTodoDTO pedidoTodo) {

        String sql = "DELETE FROM pedidotodo WHERE id_pedido_todo = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, pedidoTodo.getIdPedidoTodo());
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
    public ArrayList<PedidoUnidadeDTO> getPartesPedido(PedidoTodoDTO pedidoTodo) {

        PedidoUnidadeDAO pegaUnidadesDoPedido = new PedidoUnidadeDAO();
            
        return pegaUnidadesDoPedido.buscaPorIdRelaciona(pedidoTodo.getIdPedidoTodo());
        
    }
    
    @Override
    public PedidoTodoDTO getPedidoTodoPorId(Long id) {
        try {
            Connection connection = ConexaoDB.inicializaDB();

            String sql = "SELECT * FROM pedidotodo WHERE id_pedido_todo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();

            PedidoTodoDTO pedidoTodoRecuperado = null;
            if (rs.next()) {
                pedidoTodoRecuperado = new PedidoTodoDTO();
                pedidoTodoRecuperado.setTotal(rs.getDouble("total"));
                pedidoTodoRecuperado.setStatus(rs.getBoolean("finalizado"));
                pedidoTodoRecuperado.setDataCriacao(rs.getString("data_criacao"));
                pedidoTodoRecuperado.setEstado(rs.getString("estado"));
                pedidoTodoRecuperado.setEstado(rs.getString("tipo"));
                pedidoTodoRecuperado.setIdPedidoTodo(rs.getLong("id_pedido_todo"));
            }

            rs.close();
            pstmt.close();
            connection.close();
            
            return pedidoTodoRecuperado;
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
    }
    
    public ArrayList<PedidoTodoDTO> getPedidoTodoPorTipoEstado(String tipo, String estado) {
        try {
            Connection connection = ConexaoDB.inicializaDB();

            String sql = "SELECT * FROM pedidotodo WHERE estado = ? AND tipo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, tipo);
            pstmt.setString(2, estado);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<PedidoTodoDTO> pedidosRecuperados = new ArrayList<PedidoTodoDTO>();
            if (rs.next()) {
                PedidoTodoDTO pedidoIndividual = new PedidoTodoDTO();
                pedidoIndividual.setTotal(rs.getDouble("total"));
                pedidoIndividual.setStatus(rs.getBoolean("finalizado"));
                pedidoIndividual.setDataCriacao(rs.getString("data_criacao"));
                pedidoIndividual.setEstado(rs.getString("estado"));
                pedidoIndividual.setTipo(rs.getString("tipo"));
                pedidoIndividual.setIdPedidoTodo(rs.getLong("id_pedido_todo"));
                
                pedidosRecuperados.add(pedidoIndividual);
            }

            rs.close();
            pstmt.close();
            connection.close();
            
            return pedidosRecuperados;
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
    }
}
