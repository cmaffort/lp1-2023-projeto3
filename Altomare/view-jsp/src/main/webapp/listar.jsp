
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Produtos Disponíveis</title>
    <link rel="stylesheet" href="css/produtos.css">
    <link rel="stylesheet" href="css/estilos-header.css">
    <%@include file="headerprodutos.jsp" %>
    <%@ page import="br.cefetmg.altomare.model.dto.ProdutoDTO" %>
    <%@ page import="br.cefetmg.altomare.model.dao.ProdutoDAO" %>

</head>
<body>
   <h1>Produtos Cadastrados</h1>
    <form  action="ProdutoServlet"  method="POST">
   
        
            <%
                ArrayList<ProdutoDTO> produtos = new ArrayList<>();
                try{
                   ProdutoDAO produtoDAO = new ProdutoDAO();
                   produtos = produtoDAO.listarProdutos();
                }catch(Exception e){
                  out.print(e);
                }
                
               for(ProdutoDTO produto : produtos){
               
            %>
            
           <div class="contract-box">
                    
                        <div class="lpnome"><%=produto.getNome()%></div>
                        <div class="lppreco">Preço: R$ <%=produto.getPreco()%></div>
                       
                        <div class="lptipo">Tipo:<%=produto.getTipo()%></div>
                        <div class="lpestado"><%=produto.getEstado()%></div>
                   
           </div>
             <%}%>
                        
        
</body>
</html>
