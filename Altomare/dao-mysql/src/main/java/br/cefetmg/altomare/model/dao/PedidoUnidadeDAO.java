package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.PedidoUnidadeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import java.util.*;

public class PedidoUnidadeDAO implements IPedidoUnidadeDAO{
    @Override
    public boolean inserir(PedidoUnidadeDTO pedidoUnidade) {

        String sql = "INSERT INTO cartao (valor, data_ocorrencia, conteudo, id_conta"
                + ") VALUES(?, ?, ?, ?)";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, pedidoUnidade.getValor());
            pstmt.setString(2, pedidoUnidade.getDataOcorrencia());
            pstmt.setString(3, pedidoUnidade.getConteudo());
            pstmt.setLong(4, pedidoUnidade.getIdRelaciona());
            
            pstmt.execute();

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
    public boolean atualizar(PedidoUnidadeDTO pedidoUnidade){

        String sql = "UPDATE pedidounidade " +
                       " SET valor = ?, " +
                       "     data_ocorrencia = ? " +
                       "     conteudo = ? " +
                       "     id_conta = ? " +
                       " WHERE id_pedido_unidade = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, pedidoUnidade.getValor());
            pstmt.setString(2, pedidoUnidade.getDataOcorrencia());
            pstmt.setString(3, pedidoUnidade.getConteudo());
            pstmt.setLong(4, pedidoUnidade.getIdRelaciona());
            pstmt.setLong(5, pedidoUnidade.getIdPedidoUnidade());
            
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
    public boolean deletar(PedidoUnidadeDTO pedidoUnidade) {

        String sql = "DELETE FROM pedidounidade WHERE id_pedido_unidade = ?";

        try {
            Connection connection = ConexaoDB.inicializaDB();
            
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, pedidoUnidade.getIdPedidoUnidade());
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
    public ArrayList<PedidoUnidadeDTO> buscaPorIdRelaciona(Long id) {
         try {
            Connection connection = ConexaoDB.inicializaDB();

            String sql = "SELECT * FROM pedidounidade WHERE id_pedido_unidade = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<PedidoUnidadeDTO> pedidosUnidadeEncontrados = new ArrayList<>();
            PedidoUnidadeDTO cartao;
            while (rs.next()) {
                cartao = new PedidoUnidadeDTO();
                cartao.setIdPedidoUnidade(rs.getLong("id_pedido_unidade"));
                cartao.setValor(rs.getDouble("valor"));
                cartao.setDataOcorrencia(rs.getString("data_ocorrencia"));
                cartao.setConteudo(rs.getString("conteudo"));
                cartao.setIdRelaciona(rs.getLong("id_conta"));
                
                pedidosUnidadeEncontrados.add(cartao);
            }

            rs.close();
            pstmt.close();
            connection.close();
            
            return pedidosUnidadeEncontrados;
        }
        catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        catch (ClassNotFoundException o) {
            throw new RuntimeException(o);
        }
    }
}
