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
    <link rel="icon" href="../../imagens/leme.png" type="image/png">
     <%@include file="../headers/headerPassageiro.jsp" %>

    
</head>
<body>

    <div class="container">
        <h1>Detalhes do Pacote</h1>
        

        <p>Nome do Pacote: Nome do Pacote Aqui</p>
        <p>Destino: Destino Aqui</p>
        <p>Data de Partida: 01 de Janeiro de 2023</p>
        <p>Duração: 7 dias</p>
        <p>Suíte: 14 Garden Villa </p>
        
        <div class="classe">
            Classe:A
            * 3 refeições
            *atividade x,y,z
            *
        </div>
        <input type="submit" name="Quarto" value="Solicitar serviço de quarto">
    </div>



       <%-- <form action="../../ObterPacotePorCpf" method="post">
            <input type="text" id="cpf" name="cpf">

            <%
                // Verifica se a lista de pacotes está disponível na solicitação
                ArrayList<PacoteDTO> pacotes = (ArrayList<PacoteDTO>) request.getAttribute("pacotes");

                if (pacotes != null && !pacotes.isEmpty()) {
                    for (PacoteDTO pacote : pacotes) {
            %>
                        <p>Nome do Contratante: ${pacote.nomeContratante}</p>
                        <p>CPF do Contratante: ${pacote.cpfContratante}</p>
                        <p>Telefone do Contratante: ${pacote.telefoneContratante}</p>
                        <p>Destino do Cruzeiro: ${pacote.destino}</p>
                        <p>Data de Partida: ${pacote.dataPartida}</p>
                        <p>Duração do Cruzeiro: ${pacote.duracaoCruzeiro}</p>
            <%
                    }
                } else {
            %>
                    <p>Nenhum pacote encontrado.</p>
            <%
                }
            %>

            <input type="submit" name="acao" value="Listar" class="button" >
        </form>--%>
    </body>
</html>
