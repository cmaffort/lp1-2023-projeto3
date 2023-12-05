<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>AltoMare</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet" href="css/estilos-header.css">
    </head>

     <header id="header-main">
        <div id="header-upper">

            <img src="../../imagens/leme.png" alt="" id="leme">

            <div>
                <h1 id="altoMare">AltoMare </h1>
                <h2 id="embarcacoes">EMBARCAÇÕES</h2>
            </div>
            <div>

                <img src="../../imagens/user-icon.png" alt="" id="user-icon">
                <p style="font-family: 'Alegreya SC'; padding-left: 5%;">GERENTE</p>

            </div>
        </div>
        <div id="linha"></div>
        <div id="burger"><p>☰</p></div>
        <ul>
            <li>
                <a href="../../core/funcionarios/listarFuncionarios.jsp" style="color: white;text-decoration: none">
                <img src="../../imagens/funcionarios.png" alt="" style="height: 35px;padding-top: 1.5cm;">
                <p>Funcionários</p>
                </a>
            </li>
            <li>
                <a href="../../core/passageiro/Cadastro.jsp" style="color: white;text-decoration: none">
                <img src="../../imagens/passageiros.png" alt="" style="height: 35px;padding-top: 1.5cm;">
                <p>Passageiros</p> 
                </a>
            </li>
            <li>
                <a href="../../core/contratos/GerarContratos.jsp" style="color: white;text-decoration: none">
                <img src="../../imagens/pacotes.png" alt="" style="height: 35px;padding-top: 1.5cm;">
                <p>Pacotes</p>  
                </a>
            </li>
            <li>
                <a href="" style="color: white;text-decoration: none">
                <img src="../../imagens/iconeSeguranca.png" alt="" style="height: 35px;padding-top: 1.5cm;">
                <p>Segurança</p>
                </a>
            </li>
            <li>
                <a href="../../core/contratos/GerarContratos.jsp" style="color: white;text-decoration: none">
                <img src="../../imagens/cronograma.png" alt="" style="height: 35px;padding-top: 1.5cm;">
                <p>Conograma</p>
                </a>
            </li>
            <li>
                <a href="../../core/produtos/cadastrar.jsp" style="color: white;text-decoration: none">
                <img src="../../imagens/produtos.png" alt="" style="height: 35px;padding-top: 1.5cm;">
                <p>Produtos</p> 
                </a>
            </li>
        </ul>
        <br>
        <br>
        
        </header>

    <script src="js/jsheader.js"></script>
</html>