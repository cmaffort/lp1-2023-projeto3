<%-- 
    Document   : inserirFuncionario
    Created on : 4 de nov. de 2023, 14:41:26
    Author     : Eliane
--%>

<%@page import="br.cefetmg.altomare.model.dao.IFuncionarioDAO"%>
<%@page import="br.cefetmg.altomare.model.dao.FuncionarioDAO"%>
<%@page import="br.cefetmg.altomare.model.dto.FuncionarioDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
      try{
       FuncionarioDTO funcionario = new FuncionarioDTO();
       funcionario.setNome(request.getParameter("nomeFuncionanrio"));
        
      FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
      funcionarioDAO.inserir(funcionario);
        }catch(Exception e){
        }
    %>
    </body>
</html>
