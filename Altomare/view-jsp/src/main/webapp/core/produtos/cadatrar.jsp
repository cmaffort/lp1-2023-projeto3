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
        <title>Cadastrar Produtos</title>
          <link rel="stylesheet" type="text/css" href="css/style.css">
 
         

    </head>
    <body>
           
    <center><h3>Cadastro de Produtos</h3> </center>
        
            <div id="produto-form">
                <form name="CadastrarProduto" method="post">
                    
                    <div>
                        <label>Nome do produto: <input type="text" placeholder="Nome do produto:" name="NAMEProd" required></label>
                        <br>
                        <label>Preço de compra: <input type="text" placeholder="Preço:" name="PreçProd" required></label>
                         <br>
                        <label>Data de entrada: <input type="text" placeholder="Data de entrada:" name="DATEPro" required></label>
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
              
                            
                        
                         <br> <div ...>
                        <input type="button" class="button" name="ordem" value="Cadastrar" onclick="...">
                        
                    </div>
                </form>
            </div>
        
    </body>
</html>
