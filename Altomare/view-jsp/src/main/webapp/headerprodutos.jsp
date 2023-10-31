<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>AltoMare</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet" href="css/estilos-header.css">
        <link rel="icon" href="imagens/leme.png" type="image/webp">
    </head>

    <header id="header-main">
        <div id="header-upper">
            <img src="imagens\leme.png" id="leme">
            <div>
                <h1>AltoMare </h1>
                <h2>EMBARCAÇÕES</h2>
            </div>
            <div>
                <img src="imagens\user-icon.png" id="user-icon">
                <p>USER</p>
            </div>
        </div>
        <div id="linha"></div>
        <div id="burger"><p>☰</p></div>
        <ul>
            <li>
                <img src="">
                <input type="button" class="button" name="ordem" value="Cadastro" onclick="window.location=('cadastrar.jsp')">
            </li>
            <li>
                <img src="">
                <input type="button" class="button" name="ordem" value="Edição" onclick="window.location=('alterar.jsp')"> 
            </li>
            
            <li>
                <img src="">
                <input type="button" class="button" name="ordem" value="Listagem" onclick="window.location=('listar.jsp')">

            </li>
            <li>
                <img src="">
                <input type="button" class="button" name="ordem" value="Exclusão" onclick="window.location=('excluir.jsp')">

            </li>

    </header>

    <script src="js/jsheader.js"></script>
</html>
