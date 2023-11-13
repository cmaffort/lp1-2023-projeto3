
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
   
    <form  action="ProdutoServlet"  method="POST">
    <main id="listagemProdutos">
        <section id="container-lista-produto">
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
                <article class="unidadeListaProd" onclick="window.location='/ProdutoServlet?act=Listar&id=${produto.id}'">
                    <section class="cont-esq">
                        <div class="lpnome"><%=produto.getNome()%></div>
                        <div class="lppreco">Preço: R$ <%=produto.getPreco()%></div>
                    </section>
                    <section class="cont-dir">
                        <div class="lptipo"><%=produto.getTipo()%></div>
                        <div class="lpestado"><%=produto.getEstado()%></div>
                    </section>
                </article>
             <%}%>
                         <input type="submit" name="acao" value="Listar" class="button" name="ordem" value="Listar">
                         </form>
        </section>
    </main>
</body>
</html>
