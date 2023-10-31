<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cadastro de Atividade</title>
    </head>
    <body>
        <%@ include file="headerGerente.jsp" %>
        <h1>Cadastro de Nova Atividade</h1>
        <form action="CadastrarAtividadeServlet" method="post">
            <label>Data:</label>
            <input type="text" name="data" required><br>

            <label>Hora de Início:</label>
            <input type="text" name="horaInicio" required><br>

            <label>Hora de Término:</label>
            <input type="text" name="horaTermino" required><br>

            <label>Local:</label>
            <input type="text" name="local" required><br>

            <label>Limite de Ocupação:</label>
            <input type="number" name="limiteOcupacao" required><br>

            <label>Responsável:</label>
            <input type="text" name="responsavel" required><br>
            
            <label>Descrição</label>
            <input type="text" name="descricao" required><br>

            <input type="submit" name="cadastrar" value="Cadastrar">
        </form>
    </body>
</html>