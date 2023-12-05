
<%@page import="br.cefetmg.altomare.model.dao.PassageiroDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dto.PassageiroDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Embarque/Desembarque | AltoMare</title>
        <meta charset="UTF-8">
        <link rel="stylesheet"  href="css/estilos-Passageiro.css">
        <link rel="stylesheet"  href="css/listarFunPAs.css">
         <link rel="stylesheet" href="css/estilos-header.css">
        <%@include file="../headers/outroHeader.jsp" %>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="../../imagens/leme.png" type="image/webp">

              

    </head>
    <body>
    
        <div id="barra">
        <p id="TextoPas">Passageiros</p>
        <input id="in"  type="text"
                name="barra" placeholder="ProcurarPassageiro" style="width: 400px;">
        </div>
        <div class="row">
            <%
               ArrayList<PassageiroDTO> passageiros = new ArrayList<>();
               try{
                  PassageiroDAO passageiroDAO = new PassageiroDAO();
                  passageiros = passageiroDAO.listarTodos();
                }catch(Exception e){
                   out.print(e);
                }
                
               for(PassageiroDTO passageiro : passageiros){
            %>
               <div class="card red">
                   <img id="image" src="imagens/user-icon.png" alt="article">
                   <div class="informacoes">
                       <h2><%=passageiro.getNome()%></h2>
                       <p><%=passageiro.getCpf()%></p>
                   </div>
                   <button onclick="changeColor()">EMBARCADO</button>
                 </div>
            <%}%>
        </div>
        <script src="js/script.js"></script>
        <script src="js/js-header.js"></script>
        <script src="js/novo.js"></script>    
    </body>
</html>

