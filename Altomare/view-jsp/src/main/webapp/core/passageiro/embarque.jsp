
<%@page import="br.cefetmg.altomare.model.dao.PassageiroDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dto.PassageiroDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Passageiros | Pacote | AltoMare</title>
        <meta charset="UTF-8">
        <link rel="stylesheet"  href="../../css/estilos-Passageiro.css">
        <link rel="stylesheet"  href="../../css/novo.css">
         <link rel="stylesheet" href="../../css/estilos-header.css">
        <%@include file="../headers/headerGerente.jsp" %>
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
            <div class="cartao" style="background-color: gray;">

                   <img id="image" src="<%=passageiro.getFoto()%>" alt="article">
                   <div class="informacoes">
                       <h2><%=passageiro.getNome()%></h2>
                       <p><%=passageiro.getCpf()%></p>
                   </div>
                   <button>PACOTE</button>
                 </div>
            <%}%>
        </div>
        <script src="../../js/script.js"></script>
            <script src="js/js-header.js"></script>
            
    </body>
</html>
