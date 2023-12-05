<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@ page import="br.cefetmg.altomare.model.dto.PacoteDTO" %>
<%@ page import="br.cefetmg.altomare.model.dao.PacoteDAO" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contratos</title>
        <link rel="stylesheet" href="../../css/produtos.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
         <link rel="icon" href="../../imagens/leme.png" type="image/webp">
    </head>
    <body>
        <%@ include file="../headers/headerGerente.jsp" %>
        <h1>Contratos Gerados</h1>
        <form action="../../BaixarPdf" method="post" style="">
            <a href="../../core/pacotes/contratos/GerarContratos.jsp" style="color: black;text-decoration: none;padding-left: 4.75cmS">Voltar</a>  
            <br>

            <%
                ArrayList<PacoteDTO> pacotes = new ArrayList<>();
                try {
                    PacoteDAO pacoteDAO = new PacoteDAO();
                    pacotes = pacoteDAO.listarPacotes(); 
                } catch (Exception e) {
                    out.print(e);
                }

                for (PacoteDTO pacote : pacotes) {
            %>
            <div class="contract-box">
                <section class="cont-esq">
                    <div ><%=pacote.getNomeContratante()%></div>
                    <div >Destino: <%=pacote.getDestino()%></div>
                </section>
                <section class="cont-dir">
                    <div >Data Partida: <%=pacote.getDataPartida()%></div>
                    <div >Duração: <%=pacote.getDuracaoCruzeiro()%> dias</div>
                    <a href="../../../../BaixarPdf?cpf=<%=pacote.getCpfContratante()%>" target="_blank" class="download-link">Baixar Contrato</a>
                </section>
            </div>
            <% }%>
        </form>

    </body>
</html>
