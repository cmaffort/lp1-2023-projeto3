
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Passageiro</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="css/estilos-Passageiro.css">
        <link rel="stylesheet" href="css/estilos-header.css">
        <link rel="icon" href="imagens/leme.png" type="image/webp">
    </head>
    <body>
         <header id="header-main">
        <div id="header-upper">
            <img src="imagens\leme.png" id="leme">
            <div>
                <h1 id="altoMare">AltoMare </h1>
                <h2 id="embarcacoes">EMBARCAÇÕES</h2>
            </div>
            <div>
                <img src="imagens\user-icon.png" id="user-icon">
                <p style="font-family: 'Alegreya SC';">GERENTE</p>
            </div>
        </div>
        <div id="linha"></div>
        <div id="burger"><p>☰</p></div>
        <ul>
            <li>
                <img src="imagens/funcionarios.png" style="height: 70px;">
                <p>Funcionários</p>
            </li>
            <li>
                <img src="imagens/passageiros.png" style="height: 70px;">
                <p>Passageiros</p> 
            </li>
            <li>
                <img src="imagens/pacotes.png" style="height: 70px;">
                <p>Pacotes</p>             
            </li>
            <li>
                <img src="imagens/iconeSeguranca.png" style="height: 70px;">
                <p>Segurança</p>
            </li>
            <li>
                <img src="imagens/cronograma.png" style="height: 70px;">
                <p>Conograma</p>
            </li>
        </ul>
    </header>
    <p style="font-family: 200px;">Passageiros</p>
    <div id="divBusca">
        <input type="text" id="txtBusca" placeholder="Buscar..."/>
        <img src="search3.png" id="btnBusca" alt="Buscar"/>
      </div>
    </body>
</html>
