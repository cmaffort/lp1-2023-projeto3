<%-- 
    Document   : listarFuncionarios
    Created on : 29 de out. de 2023, 17:04:14
    Author     : Eliane
--%>

<%@page import="br.cefetmg.altomare.model.dao.FuncionarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dto.FuncionarioDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="../../css/estilos-header.css">
        <link rel="stylesheet"  href="../../css/estilosFuncionario.css">
        <link rel="icon" href="../../imagens/leme.png" type="image/webp">
        <%@include file="../../headerprodutos.jsp" %>
        <title>Escalar Funcionários</title>
    </head>
    <body>
          
        <h1 id="titulo">Escalar Funcionários</h1>
        <div class="row">
            <%
               ArrayList<FuncionarioDTO> funcionarios = new ArrayList<>();
               try{
                  FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
                  funcionarios = funcionarioDAO.listarTodos();
                }catch(Exception e){
                   out.print(e);
                }
                
               for(FuncionarioDTO funcionario : funcionarios){
            %>
               <div class="card red">
                   <img class="image" src="imagens/user-icon.png" alt="article">
                   <div class="informacoes">
                       <h2 id="nomeFunc"><%=funcionario.getNome()%></h2>
                   </div>
                   <div>
            <%}%>
        </div>
            <script src="../../js/scriptFuncionario.js"></script>
         <script src="../../js/jsheader.js"></script>
        
    </body>
</html>
