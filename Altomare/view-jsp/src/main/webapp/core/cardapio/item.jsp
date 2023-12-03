

<%@page import="br.cefetmg.altomare.dao.connection.ConexaoDB"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dao.ICardapioDAO"%>
<%@page import="br.cefetmg.altomare.model.dao.CardapioDAO"%>
<%@page import="br.cefetmg.altomare.model.dto.CardapioDTO"%>
<%@page import="br.cefetmg.altomare.model.service.IManterCardapio"%>
<%@page import="br.cefetmg.altomare.model.service.ManterCardapio"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href='https://fonts.googleapis.com/css?family=Dancing Script' rel='stylesheet'>
        <link href='https://fonts.googleapis.com/css?family=Bebas Neue' rel='stylesheet'>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <link rel="stylesheet" href="../../css/estilosCardapio.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
        <link rel="icon" href="../../imagens/leme.png" type="image/png">
        <title>Cardápio</title>
    </head>
    <body>
        <%@include file="../../outroHeader.jsp" %>
        <%
            String item = request.getParameter("item");
        %>
            <div id="tudo">
                <div id="inf">
                <div id="imagem"><img id="imgItem"  src="../../imagens/salmao.png" alt="alt"/></div>
                   <div id="nome-descricao">
                    <h1 id="nomeProduto"><%=item%></h1>
                   <p id="descricao"><%%></p>
                   </div>
                </div>
                <div id="preco"><p>Preço:</p></div>
            </div>
        <footer><button id="voltar"> VOLTAR</button><h1 id="total">TOTAL:<%%></h1></footer>
        <script src="../../js/scriptFuncionario.js"></script>
    </body>
</html>
