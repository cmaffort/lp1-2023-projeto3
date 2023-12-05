
<%@page import="br.cefetmg.altomare.model.dao.FuncionarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dto.FuncionarioDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=0, max-scale=1.0">
        <link rel="stylesheet"  href="../../css/estilos-header.css">
        <link rel="stylesheet"  href="../../css/estilosFuncionario.css">
        <link rel="icon" href="../../imagens/leme.png" type="image/webp">
        <%@include file="../headers/headerGerente.jsp" %>
        <title>Escalar Funcionários</title>
    </head>
    <body>
          
        <h1 id="titulo">Escalar Funcionários</h1>

           <div class="row">
                <div id="cardastrar">
                <h2>Cadastrar</h2>
                <img id="mais" src="../../imagens/botao-adicionar.png" alt="article">
            </div>

            <%
               ArrayList<FuncionarioDTO> funcionarios = new ArrayList<>();
               try{
                  FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
                  funcionarios = funcionarioDAO.listarTodos();
                }catch(Exception e){
                   out.print(e);
                }
                
               for(FuncionarioDTO funcionario : funcionarios){
              %>
               <div class="card red">
                   <img id="image" src="imagens/user-icon.png" alt="article">
                   <div class="informacoes">
                        <a  href="../funcionarios/visualizarFuncionario.jsp?cpf=<%=funcionario.getCpf()%>"  style="color: black;text-decoration: none">
                       <h2 id="nomeFunc"><%=funcionario.getNome()%></h2>
                       <p id="nomeFunc"><%=funcionario.getCpf()%></p>
                       </a>
                   </div>
                   </div>
            <%}%>
        </div>
            <script src="../../js/scriptFuncionario.js"></script>
         <script src="../../js/jsheader.js"></script>
        
    </body>
</html>
