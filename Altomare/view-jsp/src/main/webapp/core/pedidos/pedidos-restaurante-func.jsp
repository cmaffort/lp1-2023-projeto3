<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Altomare</title>
        <link rel="stylesheet" href="../../css/pedidos.css">
    </head>
    <body>
        <%@ include file="../../headerRestaurante.jsp" %>
        <%@ page import="br.cefetmg.altomare.model.dto.*" %>
        <%@ page import="br.cefetmg.altomare.model.service.*" %>
        <%@ page import="java.util.*" %>
        
        <div id="container-ver-pedidos">
            <div class="visualizacao-pedidos" id="visualizacao-restaurante">
                
            </div>
        </div>
        
        <div id="recebe-pedidos-restaurante">
            <% 
                GetPedidosToView pedidosRestauranteManager = new GetPedidosToView();
                ArrayList<PedidoTodoDTO> arrRequisitados = pedidosRestauranteManager.getPedidos("restaurante", "requisitado");
                ArrayList<PedidoTodoDTO> arrEmPreparo = pedidosRestauranteManager.getPedidos("restaurante", "em preparo");
                ArrayList<PedidoTodoDTO> arrFinalizado = pedidosRestauranteManager.getPedidos("restaurante", "finalizado");
                
                ArrayList<PedidoTodoDTO> pedidosUnidos = new ArrayList<>();
                pedidosUnidos.addAll(arrRequisitados);
                pedidosUnidos.addAll(arrEmPreparo);
                pedidosUnidos.addAll(arrFinalizado);
            %>
            <% 
                for (PedidoTodoDTO pedido: pedidosUnidos) { %>

                <div class="pedido-todo-db">
                    <div><% out.println(pedido.getIdPedidoTodo() + "*" + pedido.getEstado()); %></div>
                    <% 
                        ArrayList<PedidoUnidadeDTO> unidadesDoPedido = pedidosRestauranteManager.getUnidadesPorPedido(pedido);
                    %>
                    <% 
                        for (PedidoUnidadeDTO pedidoUnidade : unidadesDoPedido) { %>
                        <p><% out.println(pedidoUnidade.getValor() + "*" + pedidoUnidade.getConteudo()); %></p>
                        <%}%>
                </div>
            <%}%>
        </div>
        
    </body>
    
    <script src="../../js/js-pedidos.js"></script>
</html>
