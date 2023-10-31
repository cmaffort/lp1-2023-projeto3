<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exclusão de produtos</title>
         <link rel="stylesheet" type="text/css" href="css/produtos.css">
        <%@include file="headerprodutos.jsp" %>
 
    </head>
    
    <body>
        <h1>Exclusão de produtos</h1>
        <h2>Exclusão por Id<h2>
        <form action="ProdutoServlet" method="post">
        <label>ID do produto: <input type="number" placeholder="ID" name="produtoId" required></label>
        <input type="submit" name="acao" value="Excluir"  name="ordem" value="Excluir" >


    </body>
</html>
