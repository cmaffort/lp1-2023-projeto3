
<%@page import="br.cefetmg.altomare.model.dao.PassageiroDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dto.PassageiroDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>AltoMare</title>
        <meta charset="UTF-8">
        <link rel="stylesheet"  href="../../css/estilos-Passageiro.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="../../imagens/leme.png" type="image/webp">
    </head>
    <body>
        <header id="header-main">
        <div id="header-upper">
            <img src="../../imagens\leme.png" id="leme">
            <div>
                <h1 id="altoMare">AltoMare</h1>
                <h2 id="embarcacoes">EMBARCAÇÕES</h2>
            </div>
            <div>
                <img src="../../imagens\user-icon.png" id="user-icon">
                <p style="font-family: 'Alegreya SC';">GERENTE</p>
            </div>
        </div>
        <div id="linha"></div>
        <div id="burger"><p>☰</p></div>
        <ul>
            <li>
                <img src="../../imagens/funcionarios.png" style="height: 70px;">
                <p>Funcionários</p>
            </li>
            <li>
                <img src="../../imagens/passageiros.png" style="height: 70px;">
                <p>Passageiros</p> 
            </li>
            <li>
                <img src="../../imagens/pacotes.png" style="height: 70px;">
                <p>Pacotes</p>             
            </li>
            <li>
                <img src="../../imagens/iconeSeguranca.png" style="height: 70px;">
                <p>Segurança</p>
            </li>
            <li>
                <img src="../../imagens/cronograma.png" style="height: 70px;">
                <p>Conograma</p>
            </li>
   
        </ul>
    </header>
        <div id="barra">
        <p id="TextoPas">Passageiros</p>
        <input id="in" onkeyup="pesquisa()" type="text"
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
                   <img class="image" src="imagens/user-icon.png" alt="article">
                   <div class="informacoes">
                       <h2 id="nomeFunc"><%=passageiro.getNome()%></h2>
                   </div>
                   <div>
            <%}%>
        </div>
        <script src="../../js/script.js"></script>
            <script src="../../js/js-header.js"></script>
            <script src="../../js/pesquisa.js"></script>
    </body>
</html>