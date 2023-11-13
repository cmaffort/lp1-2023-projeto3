<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@ page import="br.cefetmg.altomare.model.dto.PacoteDTO" %>
<%@ page import="br.cefetmg.altomare.model.dao.PacoteDAO" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Contratos</title>
    <link rel="stylesheet" href="../../../css/produtos.css">
    <link rel="stylesheet" href="../../../css/estilos-header.css">
    <%@include file="../../../headerGerente.jsp" %>
</head>
<body>
    
    <h1>Contratos Gerados</h1>
    <form action="../../../BaixarPdf" method="post">
        <%
            ArrayList<PacoteDTO> pacotes = new ArrayList<>();
            try {
                PacoteDAO pacoteDAO = new PacoteDAO();
                pacotes = pacoteDAO.listarPacotes(); // Método para listar contratos, ajuste conforme sua implementação
            } catch (Exception e) {
                out.print(e);
            }

            for (PacoteDTO pacote : pacotes) {
        %>
            <section class="cont-esq">
                <div class="lpnome"><%=pacote.getNomeContratante()%></div>
                <div class="lppreco">Destino: <%=pacote.getDestino()%></div>
            </section>
            <section class="cont-dir">
                <div class="lptipo">Data Partida: <%=pacote.getDataPartida()%></div>
                <div class="lpestado">Duração: <%=pacote.getDuracaoCruzeiro()%> dias</div>
                <a href="DownloadPDFServlet?cpf=<%=pacote.getCpfContratante()%>" target="_blank">Baixar Contrato</a>
            </section>
        <% } %>
        
    </form>
</body>
</html>
