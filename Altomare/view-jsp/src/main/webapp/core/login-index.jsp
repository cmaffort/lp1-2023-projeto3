
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>AltoMare</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet" href="../css/estilosFuncionario.css">
        <link rel="icon" href="../imagens/leme.png" type="image/webp">
        <%@include file="headers/headerLogin.jsp" %>
    </head>
    <body>
        <FORM id="login" name="login" action="Fachada" method="POST">
            <h1>LOGIN</h1>
            <p>Usuário: <input class="campos" type="text" name="cpfUsuario" required></p>
            <p>Senha: <input  class="campos" type="password" name="senhaUsuario" required></p>
            <input id="botao" type="submit" name="acao" value="Login">
        </FORM>
         <script src="../js/scriptFuncionario.js"></script>
         <script src="../js/jsheader.js"></script>
    </body> 
</html>

