

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link rel="stylesheet" href="../../css/estilosCardapio.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
        <link rel="icon" href="../../imagens/leme.png" type="image/png">
        <title>Cadastro Item Cardápio</title>
    </head>
    <body>
        <%@include file="../../outroHeader.jsp" %>
        <h1 id="titulo">Cadastrar item do cardápio</h1>
        <form id="cadastroFunc" method="post" action="../../Fachada" >
            <div id="main">
                <div id="imagemItem">
            <div class="max-width"> 
                <div>
                    <img id="imgPhotoFuncionario" src="../../imagens/camera.png" alt="selecione uma imagem"/>
                </div>
             </div>
                    <button type="submit" value="CadastrarItem" id="cadastrarItem" name="acao">CADASTRAR</button>
                </div>
             <input type="file" id="fotoFuncionario" name="foto" accept="image/*" >
             <div id="campos">
            <p>Nome:<input type="text" id="nomeItem" name="nomeItem" required></p>
            <p>Preço:<input type="text" id="precoItem" name="precoItem" required></p>
            <p>Descrição:<input type="text" id="descricaoItem" name="descricaoItem" required></p>
             </div>
            </div>
        </form>
         <script src="../../js/js-cardapio.js"></script>
    </body>
</html>
