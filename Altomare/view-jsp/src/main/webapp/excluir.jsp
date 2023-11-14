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

        
        <h2>Exclusão por Nome</h2>
        <form action="ProdutoServlet" method="post">
        <label>Nome do produto: <input type="text" placeholder="NOME" name="Nome" required></label>
        <input type="submit" name="acao" value="ExcluirNome"    >
        </form>
        
        <h2>Exclusão por Id</h2>
        <form action="ProdutoServlet" method="post">
        <label>ID do produto: <input type="text" placeholder="Id" name="Id" required></label>
        <input type="submit" name="acao" value="ExcluirId"   >


        </form>
    </body>
</html>
