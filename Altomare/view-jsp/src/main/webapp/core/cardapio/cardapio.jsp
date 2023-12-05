
<%@page import="java.util.List"%>
<%@page import="br.cefetmg.altomare.model.service.ManterCardapio"%>
<%@page import="br.cefetmg.altomare.model.service.IManterCardapio"%>
<%@page import="br.cefetmg.altomare.model.dto.ProdutoDTO"%>
<%@page import="br.cefetmg.altomare.model.dao.CardapioDAO"%>
<%@page import="br.cefetmg.altomare.model.dto.CardapioDTO"%>
<%@page import="br.cefetmg.altomare.model.dao.FuncionarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dto.FuncionarioDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet" href="../../css/estilosCardapio.css">
        <link rel="stylesheet" href="css/estilosCardapio.css">
         <link rel="stylesheet" href="../../css/estilos-header.css">
         <link rel="icon" href="../../imagens/leme.png" type="image/png">
        <title>Cardápio</title>
    </head>
    <body>
        <%@include file="../headers/headerGerente.jsp" %>
         <div class="row">
        <%
          ArrayList<CardapioDTO> cardapio = null;
         
                  CardapioDAO cardapioDAO = new CardapioDAO();
                  cardapio = cardapioDAO.listarTodos();
                
                
          for(CardapioDTO item : cardapio){
          
        %>
          <div id="cardItem">
              <a  href="item.jsp?item=<%=item.getNome()%>"  style="color: white;text-decoration: none">
              <img id="imgFoto" src="../../imagens/salmao.png" alt="alt"/>
            <div id="nameItem">
                <h1><%=item.getNome()%></h1>   
            </div>
          </div>
        <%}%>
        </div>
        <footer><h1 style="padding-left: 2%;">TOTAL A PAGAR:<%%></h1></footer>
    </body>
</html>
