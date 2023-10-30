
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>AltoMare</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="icon" href="imagens/leme.png" type="image/webp">
        <%@include file="headerLogin.jsp" %>
    </head>
    <body>
        <FORM id="login" name="login" action="login.java" method="POST">
            <h1>LOGIN</h1>
            <p>Usuário: <input class="campos" type="text" name="cpfUsuario" required></p>
            <p>Senha: <input  class="campos" type="password" name="senhaUsuario" required></p>
            <input id="botao" type="submit" name="enviaLogin" value="Enviar">
        </FORM>
        
    </body> 
</html>
