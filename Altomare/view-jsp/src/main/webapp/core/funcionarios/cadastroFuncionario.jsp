

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Funcionário</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="../../css/estilosFuncionario.css">
        <link rel="stylesheet" href="../../css/estilos-header.css">
        <link rel="icon" href="../../imagens/leme.png" type="image/png">
        <%@include file="../headers/headerGerente.jsp" %>        

    </head>
    <body>
        <h1 id="titulo">Inserir Funcionário</h1>
        <form action="../../Fachada" method="POST" id="cadastroFunc" encytype="multpart/form-data" >

            <main>
                <div id='setor-admissao'>

                    <p><label  for="setor" style="font-family: 'Alegreya SC';">Setor:</label></p>
                    <p>   
                        <input type='text' onChange="handleFile(this.files)" name='setor' id="setor" data-ls-module="charCounter" maxlength="13" required> 
                    </p>
                    <p>
                        <label for="turno" style="font-family: 'Alegreya SC';">Turno:</label>
                    </p>
                    <p>
                        <input type='text' onChange="handleFile(this.files)" name='turno' id="turno" data-ls-module="charCounter" maxlength="13" required> 
                    </p>
                    <p>
                        <label for="dataAdmissao" style="font-family: 'Alegreya SC';">  Data de Admissão:</label>
                    </p>
                    <p>
                        <input type="text" onChange="handleFile(this.files)" name="dataAdmissao" id="dataAdmissao" value="" required> 
                    </p>


                </div>
                <div class="traco"></div>
                <div id="nome-telefone">
                    <p>
                        <label class="mover" for="nomeFuncionario" style="font-family: 'Alegreya SC';">Nome:</label>
                        <input type='text' id="nomeFuncionario" name='nomeFuncionario' placeholder="digite o nome completo" onChange="handleFile(this.files)" required>
                        <label class="mov" for="dataNascimentoFuncionario" style="font-family: 'Alegreya SC';">Nascimento:</label>
                        <input  onChange="handleFile(this.files)" type='text' id="dataNascimentoFuncionario"  name='dataNascimentoFuncionario' value='' required>

                    </p>
                    <p>
                        <label class="mover" for="cpfFuncionario" style="font-family: 'Alegreya SC';">CPF:</label>
                        <input onChange="handleFile(this.files)" type='text' name='cpf' id="cpfFuncionario"  data-ls-module="charCounter" maxlength="14" placeholder="ex: xxx.xxx.xxx-xx" required>          
                        <label class="mov" for="civilFuncionario" style="font-family: 'Alegreya SC';">Estado Civil:</label>
                        <input type='text' onChange="handleFile(this.files)" name='estadoCivilFuncionario' id="civilFuncionario" data-ls-module="charCounter" maxlength="13" required> 
                    </p>
                    <p>
                        <label class="mover" for="rgFuncionario" style="font-family: 'Alegreya SC';">RG:</label>
                        <input type='text' onChange="handleFile(this.files)" name='rgFuncionario' id="rgFuncionario" data-ls-module="charCounter" maxlength="13" required>   
                        <label class="mov" for="sexoFuncionario" style="font-family: 'Alegreya SC';">Sexo:</label>
                        <input type='text' onChange="handleFile(this.files)" name='sexoFuncionario' id="sexoFuncionario" data-ls-module="charCounter" maxlength="13" required> 

                    </p>
                    <p>                
                        <label class="mover" for="emailFuncionario" style="font-family: 'Alegreya SC';"> Email: </label>
                        <input type='email' onChange="handleFile(this.files)" id="emailFuncionario" name='emailFuncionario' value='' required>
                        <label class="mov" for="telefoneFuncionario" style="font-family: 'Alegreya SC';">Telefone: </label>
                        <input type='tel' onChange="handleFile(this.files)" id="telefoneFuncionario" name='telefoneFuncionario'  placeholder="ex: (xx) xxxxx-xxxx" required> 
                    </p>
                </div>
                <div class="traco"></div>
                <div id="foto-botao">
                    <div class="max-width"> 
                        <div>
                            <img id="imgPhotoFuncionario" src="../../imagens/camera.png" alt="selecione uma imagem"/>
                        </div>
                    </div>
                    <input type="file" id="fotoFuncionario" name="foto" accept="image/*" >
                    <p>
                        <button id="botaoArquivosFuncionario" >PREENCHER CAMPOS</button>
                        <input type="file"  id="arquivoFuncionario"  accept="text/*">
                    </p>
                    <p><button type='submit' name="acao" value="CadastrarFuncionario" id='botaoCadastrarFuncionario'>CADASTRAR</button></p>

                </div>

            </main>
        </form>
        <footer>
            <button id="voltar">VOLTAR</button>
        </footer>
        <script src="../../js/scriptFuncionario.js"></script>
        <script src="../../js/jsheader.js"></script>
    </body>
</html>
