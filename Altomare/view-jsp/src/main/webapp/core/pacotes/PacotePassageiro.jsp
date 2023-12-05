<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@ page import="br.cefetmg.altomare.model.dto.PacoteDTO" %>
<%@ page import="br.cefetmg.altomare.model.dao.PacoteDAO" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalhes do Pacote</title>
    <%@include file="../../../headerPassageiro.jsp" %>
    <link rel="stylesheet" href="../../css/estilos-Passageiro-Pacote.css">
    
</head>
<body>

<div class="container">
    <header>
        <img src="../../imagens/bedroom.jpg" alt="Destino do Pacote">
    </header>

    <div class="details">
        <h1> Informações</h1>

        <div class="section">
            <h2> Quarto:</h2>
            <p>Nome do Pacote: Nome do Pacote Aqui</p>
            <p>Suíte: 14 Garden Villa </p>
        </div>
    </div>

        

        <div class="section">
            <h2>Informações Pessoais</h2>
            <p>Nome do Contratante: ${pacote.nomeContratante}</p>
            <p>CPF do Contratante: ${pacote.cpfContratante}</p>
            <p>Telefone do Contratante: ${pacote.telefoneContratante}</p>
        </div>

        <div class="section">
            <h2>Outras Informações</h2>
            <p>Destino do Cruzeiro: ${pacote.destino}</p>
            <p>Data de Partida: ${pacote.dataPartida}</p>
            <p>Duração do Cruzeiro: ${pacote.duracaoCruzeiro}</p>
        </div>
    
        <div class="section">
          
   <div class="section">
    <h2>O que está Incluso</h2>
    <div class="classe">
        Classe: A
        <br>* 3 refeições

        <script>
            if (a) {
                document.write("<br>* Atividade x");
            }
            if (b) {
                document.write("<br>* Atividade y");
            }
            if (c) {
                document.write("<br>* Atividade z");
            }
        </script>
    </div>
    <button type="button" class="room-service-btn" onclick="solicitarServicoQuarto()">Solicitar serviço de quarto</button>
</div>

   

         
<script>
    function solicitarServicoQuarto() {
            alert('Serviço de quarto solicitado com sucesso!');
    }
</script>

</body>
</html>
