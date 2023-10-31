<%-- 
    Document   : cadatrar
    Created on : 09 de out. de 2023, 23:37:26
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produtos</title>
          <link rel="stylesheet" type="text/css" href="css/produtos.css">
        <%@include file="headerprodutos.jsp" %>
 
         

    </head>
    <body>
        
           
    <center><h3>Cadastro de Produtos</h3> </center>
        
           
                <form name="CadastrarProduto" action="../../ProdutoServlet" method="post">
                    
                    
                        <label>Nome do produto: <input type="text" placeholder="Nome do produto:" name="NAMEProd" required></label>
                        <br>
                        <label>Preço de compra: <input type="text" placeholder="Preço:" name="PrecProd" required></label>
                        
                         <br>
                        <label>Quantidade: <input type="number" placeholder="Quantidade" name="QuantProd" required></label>
                        <label>Data de entrada: <input type="date" placeholder="Data de entrada:" name="DATEPro" required></label>
                         <br>
                        <label>Tipo de produto: <select id="tipoProduto" name="tipoProduto">
                                 <option value="none"></option>
                                <option value="Alimento">Alimento</option>
                                <option value="Médicos">Médicos</option>
                                <option value="Bebidas">Bebidas</option>
                               </select>
                            
                         <br>
                         <br>
                            <label>Estado: <input type="text" placeholder="Estado:" name="EstadPro" required></label>    
              
                            
                        
                         <br> 
            <input type="submit" name="acao" value="Cadastrar" class="button" name="ordem" value="Cadastrar">
                        
                        
                    
                </form>
            
        
    </body>
</html>
