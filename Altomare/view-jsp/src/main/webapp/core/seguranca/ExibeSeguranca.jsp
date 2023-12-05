<%@page import="br.cefetmg.altomare.model.dao.SegurancaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetmg.altomare.model.dto.SegurancaDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Segurança | AltoMare</title>
        <meta charset="UTF-8">

        <link rel="stylesheet"  href="../../css/estilos-Passageiro.css">
        <link rel="stylesheet"  href="../../css/novo.css">
         <link rel="stylesheet" href="../../css/estilos-header.css">
         <link rel="icon" href="../../imagens/leme.png" type="image/webp">
        <%@include file="../../headerprodutos.jsp" %>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
      
    </head>
    
    
        <div id="barra">
            <div style="display: flex; flex-direction: row;align-items: center;">
        <p id="TextoPas">Segurança</p>
        <a href="CadastraSeguranca.jsp"> <button style=" padding: 5%; background: rgb(5, 50, 112);color: white;border-style: outset;border-color: #0066A2;height: 50px;width: 100px;font: bold15px arial,sans-serif;text-shadow: none;">ADICIONAR</button></a>
<a href="../gestor_produtos/cadastrar.jsp"><button style=" background:rgb(5, 50, 112);color: white;border-style: outset;border-color: #0066A2;height: 50px;width: 100px;font: bold15px arial,sans-serif;text-shadow: none;">ESTOQUE</button></a>
        </div>
        </div>
        
            <%
               ArrayList<SegurancaDTO> segurancas = new ArrayList<>();
               try{
                  SegurancaDAO segDAO = new SegurancaDAO();
                  segurancas = segDAO.listarTodos();
                }catch(Exception e){
                   out.print(e);
                }
                
               for(SegurancaDTO seg : segurancas){
                if(seg.getNome().equals(seg.getNome()) ){
                   
            %>
               <div class="cartao" style="background-color: gray">

                   <img id="image" src="../../imagens/user-icon.png" alt="article">
                   <div class="informacoes">
                       <h2><%=seg.getNome()%></h2>
                       <p><%=seg.getEspecificacao()%></p>
                   </div>
                   <form action="../../Fachada" method="POST">
                       <input type="hidden" name="nome" value="<%=seg.getNome()%>">
                        <button type='submit' name="acao"  value="EditarSeguranca">EDITAR</button>                                     
                       <button type='submit' name="acao" value="ExcluirSeguranca">EXCLUIR</button>
                   </form>
                 </div>
            <%}}%>
        
 
        <script src="../../js/js-header.js"></script>
            

    
</html>
