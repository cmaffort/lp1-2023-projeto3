
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Cadastrar Segurança | AltoMare</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="../../css/estilos-Passageiro.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
        <link rel="icon" href="../../imagens/leme.png" type="image/webp">
        <%@include file="../headers/headerGerente.jsp" %>
    </head>
    <body>
        
         <h1 id="titulo">Segurança</h1>

         <form name="CadastrarSeguranca"   action="../../Fachada" id="cadastroFunc" enctype="multipart/form-data" method="POST">

            <main>
                    <div id='nome-telefone'>
                        <p>
                        <label class="mover" for="nome" style="font-family: 'Alegreya SC';"></label>
                               <input type='text' id="tema"  name='tema' placeholder="Tema" required style="width:370px; height:30px; ;color: white;background-color: rgb(5, 50, 112);">
                        </p>
                        <p>
                        <label class="mover" style="font-family: 'Alegreya SC';" for="sexo"></label>  
                           <input type='text' name='sobre' id="sexo"  placeholder="Sobre..." required style="width:800px; height: 200px;">                 
                        </p>
                          </div>
                         <div id="traco"></div>
                           <div id="foto-botao">
                               <div class="max-width">
                                   <div class="imageContainer">
                                       <img id="imgPhoto" src="../../imagens/camera.png" alt="selecione uma imagem"/>
                                   </div>
                               </div>
                               
                              <input type="file" id="foto" name="foto" accept="image/*" >
                               <p><button type='submit' name="acao" value="CadastrarSeguranca" id='enviar'>CADASTRAR</button></p>
                         </div>
                         
            </main>
            <script src="../../js/js-header.js"></script>
             <script src="../../js/uploadImagem.js"></script>
        </form>
         <footer>
               <button id="voltar">VOLTAR</button>
                        </footer>
    </body>


    