<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edição de produtos</title>
        <link rel="stylesheet" type="text/css" href="css/produtos.css">
        <%@include file="headerprodutos.jsp" %>

    </head>
    <body>
        <h1>Edição de produtos</h1>

        <form action="ProdutoServlet" method="post">
            <label>ID do Produto: <input type="text" name="idProduto"></label><br>
            <label>Novo Nome: <input type="text" name="novoNome" placeholder="novoNome"></label><br>
            <label>Novo Preço: <input type="text" name="novoPreco" placeholder="novoPreço"></label><br>
            <label>Nova Data de Entrada: <input type="text" name="novaDataEntrada" placeholder="novaData"></label><br>
            <label>Nova Quantidade:<input type="number" name="Novaquantidade" placeholder="Novaquantidade"></label><br>
            <label>Novo Tipo de Produto: <select id="novoTipoProduto" name="novoTipoProduto">
                                 <option value="none"></option>
                                <option value="Alimento">Alimento</option>
                                <option value="Médicos">Médicos</option>
                                <option value="Bebidas">Bebidas</option>
                               </select></label><br>
            <label>Novo Estado: <input type="text" name="novoEstado" placeholder="novoEstado"></label><br>
            <center><input type="submit" name="acao" value="Alterar" class="button" name="ordem" value="Alterar">
        </form>
    </body>
</html>
