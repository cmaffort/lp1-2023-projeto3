<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contrato de Cruzeiro - Formulário</title>
        <link rel="stylesheet" href="../../css/produtos.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
                <link rel="icon" href="../../imagens/leme.png" type="image/webp">
     <%@include file="../headers/headerGerente.jsp" %>   
     

</head>
<body>

    <h1>Contrato de Cruzeiro - Cadastro de Pacotes</h1>

    <form action="../../ContratoServlet" method="post">
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
        <br>

       
     

        <input type="submit" value="Enviar">
        <a href="../../core/pacotes/contratos/ListarContratos.jsp" style="color: black;text-decoration: none">Ver Contratos</a>
    </form>

</body>
</html>
