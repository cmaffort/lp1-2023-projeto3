<%-- 
    Document   : cadastroPassageiro
    Created on : 16 de out. de 2023, 10:25:17
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Funcionário</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="estilos.css">
        <link rel="icon" href="imagens/leme.png" type="image/webp">
    </head>
    <body>
         <header id="headerUsuario">
             <h1 id="altoMareUsuarios">AltoMare </h1>
            <h2 id="embarcacoesUsuarios">Embarcações</h2>
            <img id="lemeUsuarios" src="imagens/leme.png" alt="alt"/>
           <div id="linha"></div>
        </header>
        <div id="barraDeTarefas">
            <p>.....</p>
        </div>
         <h1 id="titulo">Cadastrar Passageiro</h1>
         <form name="Cadastropassageiro" id="cadastroFunc" method="post" action="inserirPassageiro">
            <main>
                    
            <div id='setor-admissao'>
                <p>PARTIDA/CHEGADA</p>
                <p> <input type='text' name='partidaChegada' placeholder="digite o nome completo" required></p>
                <p>DURAÇÃO</p>
                <p><input type='text' name='duracao' placeholder="digite o nome completo" required></p>
                <p>DATAS</p>
                <p><input type='text' name='datas' placeholder="digite o nome completo" required></p>
                  
            </div>
            <div id="barra1"></div>
            <div id='nome-telefone'>
                <p> Nome: <input type='text' name='nome' placeholder="digite o nome completo" required></p>
               <p>Nascimento: <input type='date' name='dataNascimento' value='' required></p>
                 Sexo:
                 <select name="sexo" required>
                     <option value="">Escolher</option>
                     <option value="masculino">Maculino</option>
                     <option value="feminino">Feminino</option>
                     <option value="naoInformado">Prefiro não informar</option>
                 </select>
                 <p>CPF: <input type='text' name='cpf'  data-ls-module="charCounter" maxlength="14" placeholder="ex: xxx.xxx.xxx-xx" required></p>
                <p>RG: <input type='text' name='rg'  data-ls-module="charCounter" maxlength="13" required></p>
                 <p>
                 Estado Civil:
                 <select name="estadoCivil" required>
                     <option value="">Escolher</option>
                     <option value="casado">Casado</option>
                     <option value="solteiro">Solteiro</option>
                     <option value="divorciado">Divorciado</option>
                     <option value="viuvo">Viúvo</option>
                 </select>
                  </p>
                   <p>
                 Email: <input type='email' name='email' value='' required>
               </p>
                 <p>
                 Telefone: <input type='tel' name='telefone'  placeholder="ex: (xx) xxxxx-xxxx" required>
               </p>
               </div>
               <div id="barra2"></div>
                           <div id="foto-botao">
                          <p>Foto: <input type="image" name="foto" required> </p>
                          <p><input type='text' name='nome' placeholder="classe" required></p>
                          <p><input type='text' name='nome' placeholder="tipo de quarto" required></p>
                          <p><input type='text' name='nome' placeholder="tamanho do quarto" required></p>
                          <p><input type='text' name='nome' placeholder="capacidade" required></p>
                          <p><input type='submi
                              ' id='Cadastrar'> 
                         </div>
            </main>
        </form>
    </body>
