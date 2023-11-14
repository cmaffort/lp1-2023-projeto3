<%-- 
    Document   : listar
    Created on : 14 de out. de 2023, 23:37:35
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de produtos</title>
        <link rel="stylesheet" type="text/css" href="css/produtos.css">
        <%@include file="../../headerprodutos.jsp" %>
        
    </head>
    <body>
        <h3>Listagem de produtos</h3>
            
        <form name="listarPessoa" action="ProdutoServlet" method="post">


            <table id="produtos">
                <tr>
                    <th>
                        NOME DO PRODUTO
                    </th>
                    <th>

                    </th>
                    <th>
                        PREÇO DE COMPRA 
                    </th>
                    <th>
                        DATA DE ENTRADA
                    </th>
                    <th>
                        TIPO DE PRODUTO
                    </th>

                    <th>

                    </th>
                </tr>
                <center> <input type="submit" name="acao" value="Listar" class="button" name="ordem" value="Listar"><center>

                
                </body>
                </html>
