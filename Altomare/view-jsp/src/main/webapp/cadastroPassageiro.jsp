

<%@page contentType="text/html" pageEncoding="UTF-8"%>




<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Passageiro</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="css/estilos.css">
        <link rel="stylesheet" href="css/estilos-header.css">
        <link rel="icon" href="imagens/leme.png" type="image/webp">
    </head>
    <body>
         <header id="header-main">
        <div id="header-upper">
            <img src="imagens\leme.png" id="leme">
            <div>
                <h1>AltoMare </h1>
                <h2>EMBARCAÇÕES</h2>
            </div>
            <div>
                <img src="imagens\user-icon.png" id="user-icon">
                <p>GERENTE</p>
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
                <img src="imagens/passageiros.webp" style="height: 70px;">
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
         <h1 id="titulo">Cadastrar Passageiro</h1>
         <form name="CadastroPassageiro"  action="CadastroPassageiro" id="cadastroPas" method="post">
            <main>
        
                
                    <div id='nome-telefone'>
                           <p>
                               Nome:
                               <input type='text' id="nome"  name='nome' placeholder="Nome" onChange="handleFile(this.files)" required>
                                Data de Nascimento: <input type='text' id="dataNascimento" name='dataNascimento' value='' placeholder="Data de nascimento" required>
                          </p>
                          
                          <p>
                            Sexo: <input type='text' name='sexo' id="sexo" value='' placeholder="Sexo" required>
                             Estado Civil: <input type='text' name='civil' id="civil" value='' placeholder="Estado Civil" required>
                          </p>
                            <p>
                             CPF: <input type='text' name='cpf' id="cpf" data-ls-module="charCounter" maxlength="14" placeholder="CPF" required>
                             RG: <input type='text' name='rg' id="rg" data-ls-module="charCounter" placeholder=RG" maxlength="13" required>
                            </p>
                              <p>
                            Email: <input type='email' name='email' id="email" value='' placeholder="Email" required>
                            Telefone: <input type='tel' name='telefone' id="telefone" placeholder="Telefone" required>
                          </p>
                          <p>
                              Pacote: <input type='text' name='pacote' id="pacote" placeholder="Pacote" required>
                          </p>
                          <p> 
                              Dados medicos: <input type="file"  id="dadosmedico" name="daods" accept="text/*"><!-- comment --></p>
                          
                          </div>
                         <div id="traco"></div>
                           <div id="foto-botao">
                               <div class="max-width">
                                   <div class="imageContainer">
                                       <img id="imgPhoto" src="imagens/camera.png" alt="selecione uma imagem"/>
                                   </div>
                               </div>
                              <p>
                               <button id="bot">Preencher Campos</button>
                               <input type="file"  id="arq" name="arquivo" accept="text/*">
                           </p>
                               
                              <input type="file" id="foto" name="foto" accept="image/*" required>
                               <p><input type='submit' value="CADASTRAR" id='enviar'></p>
                         </div>
            </main>
            <script src="js/script.js"></script>
            <script src="js/js-header.js"></script>
        </form>
    </body>

