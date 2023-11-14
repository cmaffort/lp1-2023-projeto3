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
           <link rel="stylesheet" href="../../css/produtos.css">
    <link rel="stylesheet" href="../../css/estilos-header.css">
        <%@include file="../../headerprodutos.jsp" %>
 
         

    </head>
    <body>
        
           
    <center><h3>Cadastro de Produtos</h3> </center>
        
           
                <form  action="../../ProdutoServlet"  method="POST">
                    
                    
                        <label>Nome do produto: <input type="text" placeholder="Nome do produto:" name="NAMEProd" required></label>
                        <br>
                        <label>Preço de compra: <input type="text" placeholder="Preço:" name="PrecProd" required></label>
                        
                         <br>
                        <label>Quantidade: <input type="number" placeholder="Quantidade" name="QuantProd" ></label>
                        <label>Data de entrada: <input type="date" placeholder="Data de entrada:" name="DATEPro" ></label>
                         <br>
                        <label>Tipo de produto: <select id="tipoProduto" name="tipoProduto">
                                 <option value="none"></option>
                                <option value="Alimentício">Alimentício</option>
                                <option value="Médico">Médico</option>
                                <option value="Bebidas">Bebidas</option>
                                <option value="Limpeza">Limpeza</option>
                               </select>
                            
                         <br>
                         <br>
                            <label>Estado: 
                            <select id="EstadPro" name="EstadPro">
                                 <option value="none"></option>
                                <option value="Esgotado">Esgotado</option>
                                <option value="Disponível">Disponível</option>
                                
                               </select>
              
                            
                        
                         <br> 
                         <br>
            <input type="submit" name="acao" value="Cadastrar" class="button" name="ordem" value="Cadastrar">
                        
                        
                    
                </form>
            
        
    </body>
</html>