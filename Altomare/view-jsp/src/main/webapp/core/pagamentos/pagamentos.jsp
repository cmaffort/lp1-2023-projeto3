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
                    <div class="pagamento-individual opcao-cartao" id="primeiro-cartao">
                        <img src="../../imagens/leme.png">
                        <p>Cartão de crédito</p>
                    </div>
                    <div class="pagamento-individual opcao-cartao" id="segundo-cartao">
                        <img src="../../imagens/leme.png">
                        <p>Cartão de débito</p>
                    </div>
                    <div class="pagamento-individual opcao-pix">
                        <img src="../../imagens/leme.png">
                        <p>Pix</p>
                    </div>
                </div>
            </section>
            <section id="pagamento-cartao">
                <div id="escolha-cartoes">
                    <div id="xis-tela-cartoes">×</div>
                    <h2>Cartão de </h2>
                    <div id="cartoes">
                       <div id="botao-adicionar">Adicionar Cartão</div> 
                    </div>
                </div>
            </section>
            <section id="registrando-cartao">
                <div id="xis-tela-adiciona">×</div>
                <h2>Registro de Cartão</h2>
                <form>
                    <div class="input-cartao" id="dv1">
                        <h5>Nome do titular</h5>
                        <input type="text" id="inp1"> 
                    </div>
                    <div id="venc-cvv">
                        <div class="input-cartao" id="dv2">
                            <h5>Data Vencimento</h5>
                            <input type="text" id="inp2"> 
                        </div>
                        <div class="input-cartao" id="dv3">
                            <h5>CVV</h5>
                            <input type="text" id="inp3"> 
                        </div>
                    </div>
                    <div class="input-cartao" id="dv4">
                        <h5>Número do Cartão</h5>
                        <input type="text" id="inp4"> 
                    </div>
                    <input id="confirmar-adicao-cartao" value="Registrar">
                </form>
            </section>
        </div>
        
        <footer>
            <a href="../despesas/despesasUsuario.jsp"> <div>VOLTAR</div></a>
        </footer>
        
        <script src="../../js/js-pagamentos.js"></script>
    </body>
</html>
