package br.cefetmg.altomare.model.dao;

import java.util.*;
import br.cefetmg.altomare.model.dto.PedidoTodoDTO;
import br.cefetmg.altomare.model.dto.PedidoUnidadeDTO;

public interface IPedidoTodoDAO {
    
    boolean inserir(PedidoTodoDTO pedidoTodo);

    boolean atualizar(PedidoTodoDTO pedidoTodo);

    boolean delete(PedidoTodoDTO pedidoTodo);

    ArrayList<PedidoUnidadeDTO> getPartesPedido(PedidoTodoDTO pedidoTodo);
    
    PedidoTodoDTO getPedidoTodoPorId(Long id);
    
    ArrayList<PedidoTodoDTO> getPedidoTodoPorTipoEstado(String tipo, String estado);
}
