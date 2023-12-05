<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Contrato de Cruzeiro - Formulário</title>
        <link rel="stylesheet" href="../../../css/produtos.css">
        <link rel="stylesheet" href="../../../css/estilos-header.css">
        <link rel="icon" href="../../../imagens/leme.png" type="image/webp">



    </head>
    <header id="header-main">
        <div id="header-upper">

            <img src="../../../imagens\leme.png" id="leme">

            <div>
                <h1 id="altoMare">AltoMare </h1>
                <h2 id="embarcacoes">EMBARCAÇÕES</h2>
            </div>
            <div>

                <img src="../../../imagens\user-icon.png" id="user-icon">
                <p style="font-family: 'Alegreya SC'; padding-left: vw;">GERENTE</p>

            </div>
        </div>
        <div id="linha"></div>
        <div id="burger"><p>☰</p></div>
        <ul>
            <li>
                <a href="../../../core/funcionarios/cadastroFuncionario.jsp" style="color: white;text-decoration: none">
                    <img src="../../../imagens/funcionarios.png" style="height: 35px;padding-top: 1.5cm;">
                    <p>Funcionários</p>
                </a>
            </li>
            <li>
                <a href="../../../core/passageiro/Cadastro.jsp" style="color: white;text-decoration: none">
                    <img src="../../../imagens/passageiros.png" style="height: 35px;padding-top: 1.5cm;">
                    <p>Passageiros</p> 
                </a>
            </li>
            <li>
                <a href="../../../core/pacotes/contratos/GerarContratos.jsp" style="color: white;text-decoration: none">
                    <img src="../../../imagens/pacotes.png" style="height: 35px;padding-top: 1.5cm;">
                    <p>Pacotes</p>  
                </a>
            </li>
            <li>
                <a href="" style="color: white;text-decoration: none">
                    <img src="../../../imagens/iconeSeguranca.png" style="height: 35px;padding-top: 1.5cm;">
                    <p>Segurança</p>
                </a>
            </li>
            <li>
                <a href=".jsp" style="color: white;text-decoration: none">
                    <img src="../../../imagens/cronograma.png" style="height: 35px;padding-top: 1.5cm;">
                    <p>Conograma</p>
                </a>
            </li>
            <li>
                <a href="cadastrar.jsp" style="color: white;text-decoration: none">
                    <img src="../../../imagens/" style="height: 35px;padding-top: 1.5cm;">
                    <p>Produtos</p>
                    <a>

                        </li>

                        </ul>

                        <br>


                        <br>


                        </header>
                        <body>

                            <h1>Contrato de Cruzeiro - Cadastro de Pacotes</h1>

                            <form action="../../../ContratoServlet" method="post">
                                <label for="nomeContratante">Nome do Contratante:</label>
                                <input type="text" id="nomeContratante" name="nomeContratante" required><br>

                                <label for="nomeContratante">CPF do contratante:</label>
                                <input type="number" id="cpfContratante" name="cpfContratante" required><br>


                                <label for="telefoneContratante">Telefone do Contratante:</label>
                                <input type="number" id="telefoneContratante" name="telefoneContratante" required><br>



                                <label for="destino">Destino do Cruzeiro:</label>
                                <input type="text" id="destino" name="destino" required><br>

                                <label for="dataPartida">Data de Partida:</label>
                                <input type="date" id="dataPartida" name="dataPartida" required><br>

                                <label for="duracaoCruzeiro">Duração do Cruzeiro (dias):</label>
                                <input type="text" id="duracaoCruzeiro" name="duracaoCruzeiro" required><br>
                                

                                <label for="duracaoCruzeiro">Classe :</label>
                                <input type="text" id="classe" name="classe" required><br>
                                
                                <label for="duracaoCruzeiro">Tipo de cabine:</label>
                                <input type="text" id="tipoCabine" name="tipoCabine" required><br>
                                



                                <input type="submit" value="Enviar">
                                <a href="../../../core/pacotes/contratos/ListarContratos.jsp" style="color: black;text-decoration: none">Ver Contratos</a>
                            </form>

                        </body>
                        </html>
