<%-- 
    Document   : cadastrarFuncionario
    Created on : 29 de out. de 2023, 17:03:53
    Author     : Eliane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Funcionário</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="css/estilos.css">
        <link rel="stylesheet" href="css/estilos-header.css">
        <link rel="icon" href="imagens/leme.png" type="image/webp">
        <%@include file="headerGerente.jsp" %>
    </head>
    <body>
         <h1 id="titulo">Inserir Funcionário</h1>
        <form action="" name="formInsereFuncionario" id="cadastroFunc" method="post">
            <main>
         <div id='setor-admissao'>
          
                       <p><label  for="setor" style="font-family: 'Alegreya SC';">Setor:</label></p>
                       <p>   
                       <select name="setor" onChange="handleFile(this.files)" required id="setor" >
                                <option value="">Escolher</option>
                                <option value="gerencia">Gerencia</option>
                                <option value="limpeza">Limpeza</option>
                                <option value="segurança">Segurança</option>
                                <option value="saude">Saúde</option>
                                <option value="inspecao">Inspeção</option>
                                <option value="entrega">Entrega</option>
                                <option value="restaurante">Restaurante</option>
                            </select>
                           </p>
                            <p>
                                <label for="turno" style="font-family: 'Alegreya SC';">Turno:</label>
                            </p>
                            <p>
                                <select name="turno" onChange="handleFile(this.files)" required id="turno">
                                  <option value="">Escolher</option>
                                  <option value="manha">Manhã</option>
                                  <option value="tarde">Tarde</option>
                                  <option value="noite">Noite</option>
                               </select>
                             </p>
                          <p>
                            <label for="dataAdmissao" style="font-family: 'Alegreya SC';">  Data de Admissão:</label>
                          </p>
                          <p>
                            <input type="date" onChange="handleFile(this.files)" name="dataAdmissao" id="dataAdmissao" value="" required> 
                          </p>
                         
                  
                  </div>
                <div class="traco"></div>
                <div id="nome-telefone">
                           <p>
                             <label class="mover" for="nomeFuncionario" style="font-family: 'Alegreya SC';">Nome:</label>
                             <input type='text' id="nomeFuncionario" name='nome' placeholder="digite o nome completo" onChange="handleFile(this.files)" required>
                            <label class="mov" for="dataNascimentoFuncionario" style="font-family: 'Alegreya SC';">Nascimento:</label>
                            <input  onChange="handleFile(this.files)" type='date' id="dataNascimentoFuncionario"  name='dataNascimento' value='' required>
                           
                           </p>
                            <p>
                             <label class="mover" for="cpfFuncionario" style="font-family: 'Alegreya SC';">CPF:</label>
                             <input onChange="handleFile(this.files)" type='text' name='cpf' id="cpfFuncionario"  data-ls-module="charCounter" maxlength="14" placeholder="ex: xxx.xxx.xxx-xx" required>          
                             <label class="mov" for="estadoCivilFuncionario" style="font-family: 'Alegreya SC';">Estado Civil:</label>
                              <select name="estadoCivil" onChange="handleFile(this.files)" required id="estadoCivilFuncionario">
                                <option value="">Escolher</option>
                                <option value="casado">Casado</option>
                                <option value="solteiro">Solteiro</option>
                                <option value="divorciado">Divorciado</option>
                                <option value="viuvo">Viúvo</option>
                              </select>
                            </p>
                           <p>
                               <label class="mover" for="rgFuncionario" style="font-family: 'Alegreya SC';">RG:</label>
                             <input type='text' onChange="handleFile(this.files)" name='rg' id="rgFuncionario" data-ls-module="charCounter" maxlength="13" required>   
                              <label class="mov" for="sexoFuncionario" style="font-family: 'Alegreya SC';">Sexo:</label>
                              <select name="sexo" onChange="handleFile(this.files)" required id="sexoFuncionario">
                                <option value="">Escolher</option>
                                <option value="masculino">Maculino</option>
                                <option value="feminino">Feminino</option>
                              </select>
                              
                           </p>
                           <p>                
                                 <label class="mover" for="emailFuncionario" style="font-family: 'Alegreya SC';"> Email: </label>
                                <input type='email' onChange="handleFile(this.files)" id="emailFuncionario" name='email' value='' required>
                                <label class="mov" for="telefoneFuncionario" style="font-family: 'Alegreya SC';">Telefone: </label>
                                <input type='tel' onChange="handleFile(this.files)" id="telefoneFuncionario" name='telefone'  placeholder="ex: (xx) xxxxx-xxxx" required> 
                           </p>
                           <p>     
                              <label class="mover"  for="CepFuncionario" style="font-family: Alegreya SC;">CEP: </label>
                               <input type="text" onchange="handleFile(this.files)" name='CepFuncionario' id='CepFuncionario' required> 
                               <label class="mov"  for="passaporteFuncionario" style="font-family: Alegreya SC;">Passaporte: </label>
                               <input type="text" onchange="handleFile(this.files)" name='passaporteFuncionario' id='passaporteFuncionario' required> 
                           </p>
                        </div>
                         <div class="traco"></div>
                           <div id="foto-botao">
                               <div class="max-width">
                                   <div>
                                       <img id="imgPhotoFuncionario" src="imagens/camera.png" alt="selecione uma imagem"/>
                                   </div>
                               </div>
                              <input type="file" id="fotoFuncionario" name="foto" accept="image/*" required>
                              <p><input type='submit' value="ADICIONAR FUNCIONÁRIO" id='botaoCadastrarFuncionario'></p>
                               <p>
                               <button id="botaoArquivosFuncionario">ENVIAR ARQUIVO</button>
                               <input type="file"  id="arquivoFuncionario" name="arquivoFuncionario" accept="text/*">
                           </p>
                           
                         </div>
            </main>
        </form>
          <footer>
               <button id="botaoVoltar">VOLTAR</button>
           </footer>
         <script src="js/script.js"></script>
         <script src="js/js-header.js"></script>
    </body>