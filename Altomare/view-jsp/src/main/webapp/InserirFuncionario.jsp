

<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Funcion�rio</title>
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
                <h2>EMBARCA��ES</h2>
            </div>
            <div>
                <img src="imagens\user-icon.png" id="user-icon">
                <p>USER</p>
            </div>
        </div>
        <div id="linha"></div>
        <div id="burger"><p>?</p></div>
        <ul>
            <li>
                <img src="">
                <p>Reserva</p>
            </li>
            <li>
                <img src="">
                <p>Alimenta��o</p> 
            </li>
            <li>
                <img src="">
                <p>Atividades</p>             
            </li>
            <li>
                <img src="">
                <p>Seguran�a</p>
            </li>
            <li>
                <img src="">
                <p>Sa�de</p>
            </li>
            <li>
                <img src="">
                <p>Despesas</p>
            </li>
        </ul>
    </header>
         <h1 id="titulo">Inserir Funcion�rio</h1>
        <form name="formInsereFuncionario" id="cadastroFunc" method="post">
            <main>
         <div id='setor-admissao'>
          
                       <p>
                            Setor:
                       </p>
                       <p>    <select name="setor" required >
                                <option value="">Escolher</option>
                                <option value="gerencia">Gerencia</option>
                                <option value="limpeza">Limpeza</option>
                                <option value="seguran�a">Seguran�a</option>
                                <option value="saude">Sa�de</option>
                                <option value="inspecao">Inspe��o</option>
                                <option value="entrega">Entrega</option>
                                <option value="restaurante">Restaurante</option>
                            </select>
                             </p>
                            <p>
                            Turno:
                            </p>
                            <p>
                            <select name="turno" required>
                                <option value="">Escolher</option>
                                <option value="manha">Manh�</option>
                                <option value="tarde">Tarde</option>
                                <option value="noite">Noite</option>
                            </select>
                             </p>
                          <p>
                            Data de Admiss�o: 
                          </p>
                          <p>
                            <input type="date" name="dataAdmissao" value="" required> 
                          </p>
                  
                  </div>
                <div id="traco"></div>
                    <div id='nome-telefone'>
                           <p>
                               Nome: <input type='text' name='nome' placeholder="digite o nome completo" required>
                          </p>
                          <p>
                            Data de Nascimento: <input type='date' name='dataNascimento' value='' required>
                          </p>
                          <p>
                            Sexo:
                            <select name="sexo" required>
                                <option value="">Escolher</option>
                                <option value="masculino">Maculino</option>
                                <option value="feminino">Feminino</option>
                                <option value="naoInformado">Prefiro n�o informar</option>
                            </select>
                          </p>
                            <p>
                             CPF: <input type='text' name='cpf'  data-ls-module="charCounter" maxlength="14" placeholder="ex: xxx.xxx.xxx-xx" required>
                            </p>
                            <p>
                             RG: <input type='text' name='rg'  data-ls-module="charCounter" maxlength="13" required>
                           </p>
                    
                            <p>
                            Estado Civil:
                            <select name="estadoCivil" required>
                                <option value="">Escolher</option>
                                <option value="casado">Casado</option>
                                <option value="solteiro">Solteiro</option>
                                <option value="divorciado">Divorciado</option>
                                <option value="viuvo">Vi�vo</option>
                            </select>
                             </p>
                              <p>
                            Email: <input type='email' name='email' value='' required>
                          </p>
                            <p>
                            Telefone: <input type='tel' name='telefone'  placeholder="ex: (xx) xxxxx-xxxx" required>
                          </p>
                          </div>
                         <div id="traco"></div>
                           <div id="foto-botao">
                               <div class="max-width">
                                   <div class="imageContainer">
                                       <img id="imgPhoto" src="imagens/camera.png" alt="selecione uma imagem"/>
                                   </div>
                               </div>
                              <input type="file" id="foto" name="foto" accept="image/*" required>
                              <p><input type='submit' value="ADICIONAR" id='enviar'></p>
                              <p><input type="file" value="Enviar Arquivo .txt" id="arquivoTxt"></p>
                         </div>
            </main>
            <script src="js/script.js"></script>
            <script src="js/js-header.js"></script>
        </form>
    </body>