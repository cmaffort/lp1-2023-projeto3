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

        String sql = "INSERT INTO contausuario (total, finalizado, data_criacao, estado"
                + ") VALUES(?, ?, ?, ?);";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, pedidoTodo.getTotal());
            pstmt.setBoolean(2, pedidoTodo.getStatus());
            pstmt.setString(3, pedidoTodo.getDataCriacao());
            pstmt.setString(4, pedidoTodo.getEstado());
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
                       " estado = ? " +
                       " WHERE id_pedido_todo = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, pedidoTodo.getTotal());
            pstmt.setBoolean(2, pedidoTodo.getStatus());
            pstmt.setString(3, pedidoTodo.getDataCriacao());
            pstmt.setString(4, pedidoTodo.getEstado());
            pstmt.setLong(5, pedidoTodo.getIdPedidoTodo());
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
    public ArrayList<PedidoUnidadeDTO> getDespesas(PedidoTodoDTO pedidoTodo) {

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
}
