
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.ArrayList" %>
<%@ page import="br.cefetmg.altomare.model.dto.PacoteDTO" %>
<%@ page import="br.cefetmg.altomare.model.dao.PacoteDAO" %>
<html>
    <head>
        <title>Exibição do Pacote</title>
        <link rel="stylesheet" href="../../../css/produtos.css">
        <link rel="stylesheet" href="../../../css/estilos-header.css">
        <%@include file="../../../headerGerente.jsp" %>
    </head>
    <body>
        <h1>Detalhes do Pacote</h1>





        <h1>Contratos Gerados</h1>
        <form action="../../../ObterPacotePorCpf" method="post">


            <input type="text" id="cpf">

            <%
                ArrayList<PacoteDTO> pacotes = new ArrayList<>();
                try {
                    PacoteDAO pacoteDAO = new PacoteDAO();
                    pacotes = pacoteDAO.ObterPacotePorCpf(cpf); 
                } catch (Exception e) {
                    out.print(e);
                }

                for (PacoteDTO pacote : pacotes) {
            %>





            <p>Nome do Contratante: ${pacote.nomeContratante}</p>
            <p>CPF do Contratante: ${pacote.cpfContratante}</p>
            <p>Telefone do Contratante: ${pacote.telefoneContratante}</p>
            <p>Destino do Cruzeiro: ${pacote.destino}</p>
            <p>Data de Partida: ${pacote.dataPartida}</p>
            <p>Duração do Cruzeiro: ${pacote.duracaoCruzeiro}</p>

            <input type="submit" name="acao" value="Listar" class="button" >
        </form>

    </body>
</html>
