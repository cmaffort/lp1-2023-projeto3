<%@ page import="br.cefetmg.altomare.model.dao.ProdutoDAO" %>
<%@ page import="br.cefetmg.altomare.model.dto.ProdutoDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.io.IOException" %>
<%@ page import="br.cefetmg.inf.altomare.controller.CadastroProntuario" %>

<%
    ArrayList<ProdutoDTO> produtos = new ArrayList<>();
    try {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtos = produtoDAO.listarProdutos();
    } catch (Exception e) {
        out.print(e);
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cadastro de Prontuário</title>
        <link rel="stylesheet" href="../../css/produtos.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
    </head>
    <body>

        <%
            if ("POST".equalsIgnoreCase(request.getMethod())) {
                String medicamentoIdStr = request.getParameter("medicamento");

                if (medicamentoIdStr != null && !medicamentoIdStr.isEmpty()) {
                    try {
                        int medicamentoId = Integer.parseInt(medicamentoIdStr);

                        ProdutoDAO produtoDAO = new ProdutoDAO();
                        produtoDAO.atualizarProduto(medicamentoId);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        %>

        <h1>Cadastro de Prontuário</h1>

        <form action="<%= request.getContextPath()%>/CadastroProntuario" method="post">
            <!-- Campos do formulário -->
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome" required><br>

            <label for="cabine">Cabine:</label>
            <input type="text" id="cabine" name="cabine" required><br>

            <label for="genero">Gênero:</label>
            <input type="text" id="genero" name="genero" required><br>

            <label for="telefone">Telefone:</label>
            <input type="text" id="telefone" name="telefone" required><br>

            <label for="datanas">Data de Nascimento:</label>
            <input type="text" id="datanas" name="datanas" required><br>

            <label for="medicamento">Medicamento Usado:</label>
            <select id="medicamento" name="medicamento" >
                <option value=""></option>
                <% for (ProdutoDTO produto : produtos) { %>
                <% if ("Médico".equals(produto.getTipo())) {%>
                <option value="<%= produto.getNome()%>"><%= produto.getNome()%></option>
                <% } %>
                <% }%>
            </select><br>

            <label for="observacoes">Observações:</label>
            <textarea id="observacoes" name="observacoes" rows="4" cols="50"></textarea>

            <input type="submit" value="Enviar">
        </form>

    </body>
</html>
