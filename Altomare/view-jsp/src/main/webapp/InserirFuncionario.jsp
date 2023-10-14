<%-- 
    Document   : InserirFuncionario
    Created on : 11 de out. de 2023, 21:02:24
    Author     : Eliane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Funcionário</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos.css">
        <link rel="icon" href="imagens/leme.png" type="image/webp">
    </head>
    <body>
         <header id="headerUsuario">
             <h1 id="altoMareUsuarios">Alto Mare </h1>
            <h2 id="embarcacoesUsuarios">Embarcações</h2>
            <img id="lemeUsuarios" src="imagens/leme.png" alt="alt"/>
           <div id="linha"></div>
        </header>
        <div id="barraDeTarefas">
            <p>.....</p>
        </div>
        <h1>Inserir Funcionário</h1>
        <form name="formInsereFuncionario" method="post">
                <input type='hidden' name='table' value='funcionario'>
                <input type='hidden' name='acao' value='gravar'>
                <table>
                    <tr>
                        <td>
                            Nome:
                        </td>
                        <td>
                            <input type='text' name='nome' placeholder="digite o nome completo">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Setor:
                        </td>
                        <td>
                            <select name="setor">
                                <option value="">Escolher</option>
                                <option value="gerencia">Gerencia</option>
                                <option value="limpeza">Limpeza</option>
                                <option value="segurança">Segurança</option>
                                <option value="saude">Saúde</option>
                                <option value="inspecao">Inspeção de Atividades</option>
                                <option value="entrega">Entrega</option>
                                <option value="restaurante">Restaurante</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Sexo:
                        </td>
                        <td>
                            <select name="sexo">
                                <option value="">Escolher</option>
                                <option value="masculino">Maculino</option>
                                <option value="feminino">Feminino</option>
                                <option value="naoInformado">Prefiro não informar</option>
                            </select>
                        </td>
                    </tr>
                     <tr>
                        <td>
                            Estado Civil:
                        </td>
                        <td>
                            <select name="estadoCivil">
                                <option value="">Escolher</option>
                                <option value="casado">Casado</option>
                                <option value="solteiro">Solteiro</option>
                                <option value="divorciado">Divorciado</option>
                                <option value="viuvo">Viúvo</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Turno:
                        </td>
                        <td>
                            <select name="turno">
                                <option value="">Escolher</option>
                                <option value="manha">Manhã</option>
                                <option value="tarde">Tarde</option>
                                <option value="noite">Noite</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Data de Admissão:                               
                        </td> 
                        <td>
                            <input type="date" name="dataAdmissao" value=""> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Carga Horária:
                        </td>
                        <td>
                           <input type="time" name="cargaHoraria">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            CPF:
                        </td>
                        <td>
                            <input type='text' name='cpf'  data-ls-module="charCounter" maxlength="14" placeholder="ex: xxx.xxx.xxx-xx">
                        </td>
                    </tr>
                    <tr>
                        <td>
                           RG:
                        </td>
                        <td>
                            <input type='text' name='rg'  data-ls-module="charCounter" maxlength="13" >
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Data de Nascimento:
                        </td>
                        <td>
                            <input type='date' name='dataNascimento' value=''>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Email:
                        </td>
                        <td>
                            <input type='email' name='email' value=''>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Telefone:
                        </td>
                        <td>
                            <input type='tel' name='telefone'  placeholder="ex: (xx) xxxxx-xxxx">
                        </td>
                    </tr>
                    <tr>
                        <td colspan='2' aling='center'>
                            <input type='button' onclick="GravarAlterarTabela(document.frmInserirCliente)" value='Gravar'>&nbsp;
                            <input type='reset' value='Redefinir'>
                            <a href='/locadora/servletweb?acao=ListarCliente'>Listar Clientes</a><br>
                        </td>
                    </tr>
                </table> 
        </form>
    </body>