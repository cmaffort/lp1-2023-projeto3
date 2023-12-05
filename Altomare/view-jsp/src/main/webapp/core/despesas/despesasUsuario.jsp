<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despesas</title>
        <link rel="icon" href="../../imagens/leme.png" type="image/png">
        <link rel="stylesheet" href="../../css/estilos-despesas.css">
    </head>
    <body>
        <%@ include file="../headers/headerPassageiro.jsp" %>
        <%@ page import="br.cefetmg.altomare.model.dto.*" %>
        <%@ page import="br.cefetmg.altomare.model.service.*" %>
        <%@ page import="java.util.*" %>

        <%
            GetDespesasToView despesasUsuarioLogado = new GetDespesasToView();
            ArrayList<DespesaDTO> arr = despesasUsuarioLogado.getDespesas();
        %>
       
        <div id="container">
            <div id="get-dados-conta">
                <% 
                    for (DespesaDTO despesa: arr) { %>
                    
                    <p class="conteudo-passado"><% out.println(despesa.getValor() + "*" + despesa.getTipo() + "*" + despesa.getDescricao() + "*" + despesa.getDataOcorrencia()); 
                    %></p>
                    
                <%}%>
            </div>
            <div id="filtros">
                <nav>
                  Filtros  
                </nav>
                    <form id="article-filtros">
                        <div id="filtros-escolha">
                            <section>
                                <h4>Período de dias:</h4>
                                <div><input type="number" name="dia1" id="dia1"> <span>à</span> <input type="number" name="dia2" id="dia2"></div>
                            </section>
                            <section>
                                <h4>Tipo de despesas:</h4>
                                <div id="tipo-despesas">
                                    <div>
                                        <input type="checkbox" value="alimento" name="tipo" id="alimento" checked> Despesas de Produtos  
                                    </div>
                                    <div>
                                        <input type="checkbox" value="atividade" name="tipo" id="atracao" checked> Despesas de Atrações
                                    </div>
                                </div>
                            </section>
                        </div>
                        <div id="filtrar">Filtrar</div>
                    </form>
            </div>
            <div id="disposicao-despesas">
                <nav>
                    Timeline dos Gastos
                </nav>
                <article id="article-despesas">
                    <div id="container-barra">
                        <div id="barra-timeline"></div>
                    </div>
                </article>
            </div>
        </div>
            
        <footer>
            <p>Despesas Totais: <%= despesasUsuarioLogado.getContaUsuario().getTotal()%></p>
            <a href="../pagamentos/pagamentos.jsp"><div>PAGAR</div></a>
        </footer>
        
        <script src="../../js/js-despesas.js"></script>
    </body>
   
</html>