<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Header</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos-header.css">
        <link rel="icon" href="${pageContext.request.contextPath}/imagens/leme.png" type="image/webp">
    </head>
    
    <header id="header-main">
        <div id="header-upper">
            <img src="${pageContext.request.contextPath}/imagens/leme.png" alt="" id="leme">
            <div>
                <h1>AltoMare </h1>
                <h2>EMBARCAÇÕES</h2>
            </div>
            <div>
                <img src="${pageContext.request.contextPath}/imagens/user-icon.png" alt="" id="user-icon">
                <p>USER</p>
            </div>
        </div>
        <div id="linha"></div>
        <div id="burger"><p>▼</p></div>
        <ul>
            <li>
                Pedidos
            </li>
            <li>
                Mesas
            </li>
        </ul>
    </header>

    <script src=""></script>
</html>
