
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Passageiro | AltoMare</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="../../css/estilos-Passageiro.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
        <link rel="icon" href="../../imagens/leme.png" type="image/webp">
        <%@include file="../../headerprodutos.jsp" %>
    </head>
    <body>
        
         <h1 id="titulo">Cadastrar Passageiro</h1>

         <form name="CadastroPassageiro"   action="../../Fachada" id="cadastroFunc" enctype="multipart/form-data" method="POST">

            <main>
        
                
                    <div id='nome-telefone'>
                        <p>
                        <label class="mover" for="nome" style="font-family: 'Alegreya SC';">Nome:</label>
                               <input type='text' id="nome"  name='nome' placeholder="Nome" onChange="handleFile(this.files)" required>
                        <label class="mov" for="dataNascimento">Data de Nascimento:</label>
                                <input type='text' id="dataNascimento" name='dataNascimento' value='' placeholder="Data de nascimento" required>
                        </p>
                        <p>
                        <label class="mover" style="font-family: 'Alegreya SC';" for="sexo">Sexo:</label>  
                           <input type='text' name='sexo' id="sexo" value='' placeholder="Sexo" required>
                          
                        <label class="mov" for="civil">Estado Civil:</label>
                             <input type='text' name='civil' id="civil" value='' placeholder="Estado Civil" required>
                        </p>
                        <p> 
                           <label class="mover" style="font-family: 'Alegreya SC';" for="cpf">CPF:</label>
                              <input type='text' name='cpf' id="cpf" data-ls-module="charCounter" maxlength="14" placeholder="CPF" required>
                              <label class="mov" for="rg">RG</label>
                             <input type='text' name='rg' id="rg" data-ls-module="charCounter" placeholder=RG maxlength="13" required>
                        </p>
                              <p>
                                  <label class="mover" style="font-family: 'Alegreya SC';" for="email">Email:</label>
                                    <input type='email' name='email' id="email" value='' placeholder="Email" required>
                                  <label class="mov" for="telefone">Telefone:</label>
                          <input type='tel' name='telefone' id="telefone" placeholder="Telefone" required>
                          </p>
                          <p>
                              <label class="mover" style="font-family: 'Alegreya SC';" for="pacote">Pacote:</label>
                               <input type="file" name="pacote" id="dadosmedico" required>
                               
                          </p>
                          <p> 

                             Dados Medicos:<input type="text"  id="dados" name="dados" >

                          </p>
                          
                          </div>
                         <div id="traco"></div>
                           <div id="foto-botao">
                               <div class="max-width">
                                   <div class="imageContainer">
                                       <label>
                                           <img id="imgPhoto" src="../../imagens/camera.png" alt="selecione uma imagem"/>
                                           <input type="file" id="foto" name="foto" accept="image/*" >
                                       </label>
                                   </div>
                               </div>
                              <p>
                               <button id="bot">Preencher Campos</button>
                               <input type="file"  id="arq" name="arquivo" accept="text/*">
                           </p>
                               
                               <p><button type='submit' name="acao" value="CadastrarPassageiro" id='enviar'>CADASTRAR</button></p>
                         </div>
                         
            </main>
            
            <script src="../../js/script-Passageiro.js"></script>
            <script src="../../js/js-header.js"></script>
             <script src="../../js/uploadImagem.js"></script>
        </form>
         <footer>
               <button id="voltar">VOLTAR</button>
                        </footer>
    </body>

