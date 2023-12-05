package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.*;
import br.cefetmg.altomare.model.dto.*;
import java.util.*;

public class GetPedidosToView {

    PedidoTodoDAO pedidosManager = new PedidoTodoDAO();
    
    public ArrayList<PedidoTodoDTO> getPedidos(String tipo, String estado) {

        ArrayList<PedidoTodoDTO> pedidosPosFiltro = pedidosManager.getPedidoTodoPorTipoEstado(tipo, estado);
        
        return pedidosPosFiltro;
    }
    
    public ArrayList<PedidoUnidadeDTO> getUnidadesPorPedido(PedidoTodoDTO pedidoTodo) {
        
        return pedidosManager.getPartesPedido(pedidoTodo);
    }
}
