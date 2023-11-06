<%-- 
    Document   : pagamentos
    Created on : 6 de nov. de 2023, 07:54:13
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Altomare</title>
        <link rel="stylesheet" href="../../css/pagamentos.css">
    </head>
    <body>
        <%@ include file="../../headerPassageiro.jsp" %>
        
        <div id="container">
            <section id="formas-pagamento">
                <h2>Formas de Pagamento</h2>
                <div id="opcoes-pagamento">
                    <div class="pagamento-individual">
                        <img src="../../imagens/leme.png">
                        <p>Cartão de crédito</p>
                    </div>
                    <div class="pagamento-individual">
                        <img src="../../imagens/leme.png">
                        <p>Cartão de débito</p>
                    </div>
                    <div class="pagamento-individual">
                        <img src="../../imagens/leme.png">
                        <p>Pix</p>
                    </div>
                </div>
            </section>
            <section id="pagamento-cartao">
                <div id="escolha-cartoes">
                    <h2>Cartão de </h2>
                    <div id="cartoes">
                       <div id="botao-adicionar">Adicionar Cartão</div> 
                    </div>
                </div>
            </section>
        </div>
        
        <footer>
            <a href="../despesas/despesasUsuario.jsp"> <div>VOLTAR</div></a>
        </footer>
    </body>
</html>
