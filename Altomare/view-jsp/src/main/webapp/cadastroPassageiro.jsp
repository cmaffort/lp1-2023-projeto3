

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
                <img src="">
                <p>Reserva</p>
            </li>
            <li>
                <img src="">
                <p>Alimentação</p> 
            </li>
            <li>
                <img src="">
                <p>Atividades</p>             
            </li>
            <li>
                <img src="">
                <p>Segurança</p>
            </li>
            <li>
                <img src="">
                <p>Saúde</p>
            </li>
            <li>
                <img src="">
                <p>Despesas</p>
            </li>
        </ul>
    </header>
         <h1 id="titulo">Cadastrar Passageiro</h1>
         <form name="CadastroPassageiro"  action="CadastroPassageiroDB" id="cadastroFunc" method="post">
            <main>
         <div id='setor-admissao'>
          
                       <p>
                            PARTIDA / CHEGADA:
                       </p>
                       <p>
                           <input type='text' id="parChe"  name='parChe' placeholder="PARTIDA / CHEGADA" required>
                       </p>
                            <p>
                            DURAÇÃO:
                            </p>
                            <p>
                                <input type='text' id="duracao"  name='duracao' placeholder="Duração da viagem" required>
                            </p>
                          <p>
                            DATAS: 
                          </p>
                          <p>
                            <input type="text" name="datas" id="datas" value="" placeholder="Datas da viagem" required> 
                          </p>
                           <p>
                               <button id="bot">Enviar Arquivo</button>
                               <input type="file"  id="arq" name="arquivo" accept="text/*">
                           </p>
                  
                  </div>
                <div id="traco"></div>
                    <div id='nome-telefone'>
                           <p>
                               Nome:
                               <input type='text' id="nome"  name='nome' placeholder="digite o nome completo" onChange="handleFile(this.files)" required>
                          </p>
                          <p>
                            Data de Nascimento: <input type='text' id="dataNascimento" name='dataNascimento' value='' required>
                          </p>
                          <p>
                            Sexo: <input type='text' name='sexo' id="sexo" value='' required>
                          </p>
                            <p>
                             CPF: <input type='text' name='cpf' id="cpf" data-ls-module="charCounter" maxlength="14" placeholder="ex: xxx.xxx.xxx-xx" required>
                            </p>
                            <p>
                             RG: <input type='text' name='rg' id="rg" data-ls-module="charCounter" maxlength="13" required>
                           </p>
                    
                            <p>
                            Estado Civil: <input type='text' name='civil' id="civil" value='' required>
                             </p>
                              <p>
                            Email: <input type='email' name='email' id="email" value='' required>
                          </p>
                            <p>
                            Telefone: <input type='tel' name='telefone' id="telefone" placeholder="ex: (xx) xxxxx-xxxx" required>
                          </p>
                          <p>
                              Dados Médicos: <input type='text' name='medico' id="medico" placeholder="Dados médicos" required>
                          </p>
                          </div>
                         <div id="traco"></div>
                           <div id="foto-botao">
                               <div class="max-width">
                                   <div class="imageContainer">
                                       <img id="imgPhoto" src="imagens/camera.png" alt="selecione uma imagem"/>
                                   </div>
                               </div>
                               <p><input type='text' name='pacote' id="pacote" placeholder="pacote" value='' required></p>
                               
                              <input type="file" id="foto" name="foto" accept="image/*" required>
                              <p><input type='submit' value="ADICIONAR" id='enviar'></p>
                         </div>
            </main>
            <script src="js/script.js"></script>
            <script src="js/js-header.js"></script>
        </form>
    </body>