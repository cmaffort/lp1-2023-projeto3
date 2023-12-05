<%@page import="br.cefetmg.altomare.model.dao.SegurancaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dto.SegurancaDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Segurança Passageiro | AltoMare</title>
        <meta charset="UTF-8">

        <link rel="stylesheet"  href="../../css/estilos-Passageiro.css">
        <link rel="stylesheet"  href="../../css/novo.css">
         <link rel="stylesheet" href="../../css/estilos-header.css">
         <%@include file="../headers/headerPassageiro.jsp" %>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="imagens/leme.png" type="image/webp">
    </head>
    <body>
    
        <div id="barra">
        <p id="TextoPas">Segurança</p>

        </div>
        <div class="row">
            <%
               ArrayList<SegurancaDTO> segurancas = new ArrayList<>();
               try{
                  SegurancaDAO segDAO = new SegurancaDAO();
                  segurancas = segDAO.listarTodos();
                }catch(Exception e){
                   out.print(e);
                }
                
               for(SegurancaDTO seg : segurancas){
                if(seg.getNome().equals(seg.getNome()) ){
                   
            %>
               <div class="cartao" style="background-color: gray">

                   <img id="image" src="../../imagens/user-icon.png" alt="article">
                   <div class="informacoes">
                       <h2><%=seg.getNome()%></h2>
                       <p><%=seg.getEspecificacao()%></p>
                   </div>
                 </div>
            <%}}%>
        </div>
 
        <script src="../../js/js-header.js"></script>
        <script src="../../js/listacao.js"></script>    

    </body>
</html>
