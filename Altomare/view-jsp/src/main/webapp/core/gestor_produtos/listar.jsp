
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produtos Disponíveis</title>
       <link rel="stylesheet" href="../../css/produtos.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
        <%@include file="../../headerprodutos.jsp" %>
        
        <%@ page import="br.cefetmg.altomare.model.dto.ProdutoDTO" %>
        <%@ page import="br.cefetmg.altomare.model.dao.ProdutoDAO" %>

    </head>
    <body>
        <head>
        <ul>
            <li style="list-style: none">
                <img src="">
                <input type="button" class="button" name="ordem" value="Cadastro" onclick="window.location=('cadastrar.jsp')">

            </li>
        
             <li style="list-style: none">
                <img alt="" src="">
                <input type="button" class="button" name="ordem" value="Listagem" onclick="window.location=('listar.jsp')">

            </li>
           
            <li style="list-style: none">                <img alt="" src="">
                <input type="button" class="button" name="ordem" value="Exclusão" onclick="window.location=('excluir.jsp')">

            </li>
        </ul>
 
    </head>
        <h1>Produtos Disponíveis</h1>
        <form  action="../../ProdutoServlet"  method="POST">


            <%
                ArrayList<ProdutoDTO> produtos = new ArrayList<>();
                try{
                   ProdutoDAO produtoDAO = new ProdutoDAO();
                   produtos = produtoDAO.listarProdutos();
                }catch(Exception e){
                  out.print(e);
                }
                
               for(ProdutoDTO produto : produtos){
               
            %>

            <div class="contract-box">
                <div class="lpnome">ID: <%=produto.getId()%></div>
                <div class="lpnome"><%=produto.getNome()%></div>
                <div class="lppreco">Preço de Compra: R$ <%=produto.getPreco()%></div>
                
                
                <div class="lptipo">Tipo:<%=produto.getTipo()%></div>
                <div class="lpestado"><%=produto.getEstado()%></div>

            </div>
            <%}%>


    </body>
</html>
