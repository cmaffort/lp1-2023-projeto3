<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Pacientes Atendidos</title>
    <link rel="stylesheet" href="../../css/produtos.css">
    <link rel="stylesheet" href="../../css/estilos-header.css">
    <%@include file="../../headerprodutos.jsp" %>

    <%@page import="br.cefetmg.altomare.model.dao.SaudeDAO"%>
    <%@page import="br.cefetmg.altomare.model.dto.SaudeDTO"%>
</head>
<body>

  <h1>Pacientes Atendidos</h1>


    <form action="<%= request.getContextPath()%>/ListarProntuario" method="POST">
        <%
            ArrayList<SaudeDTO> prontuarios = new ArrayList<>();
            try {
                SaudeDAO prontuarioDAO = new SaudeDAO();
                prontuarios = prontuarioDAO.listarProntuarios();
            } catch (Exception e) {
                out.print(e);
            }

            for (SaudeDTO prontuario : prontuarios) {
        %>
        
        
        
        <div class="contract-box">
            <div class="lpid">ID: <%=prontuario.getId()%></div>
            <div class="lpnome"><%=prontuario.getName()%></div>
            <div class="lppreco">Preço de Compra: R$ <%=prontuario.getCabine()%></div>
            <div class="lptipo">Tipo: <%=prontuario.getGenero()%></div>
            <div class="lpestado"><%=prontuario.getDatanas()%></div>
            <div class="lpmedica"><%=prontuario.getMedicamento()%></div>
             <div class="lpmedica"><%=prontuario.getObservacao()%></div>
        </div>
        <% } %>
    </form>
</body>
</html>
