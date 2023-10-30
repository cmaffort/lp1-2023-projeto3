<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despesas</title>
        <link rel="stylesheet" href="css/estilos-despesas.css">
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <%@ page import="br.cefetmg.altomare.dto.*" %>
        <%@ page import="java.util.*" %>

        <%
            /*import br.cefetmg.altomare.service.GetDespesasToView;

            GetDespesasToView getDespesas = new GetDespesasToView(Passageiro passageiro);*/

            DespesaDTO arr[] = {new DespesaDTO(1, 100.0, true, "produto", "Produto 1", new Date(2023, 5, 10, 10, 52, 40)),
                                new DespesaDTO(2, 200.0, true, "atração", "Produto 2", new Date()), 
                                new DespesaDTO(3, 300.0, true, "produto", "Produto 3", new Date()), 
                                new DespesaDTO(4, 400.0, true, "produto", "Produto 4", new Date()), 
                                new DespesaDTO(5, 500.0, true, "atração", "Produto 5", new Date())};
        %>
       
        <div id="container">
            <div id="get-dados-conta">
                <%  /*getDespesas.getDespesas()*/

                    for (DespesaDTO despesa: arr) { %>
                    
                    <p class="conteudo-passado"><% out.println(despesa.getValor() + "*" + despesa.getTipo() + "*" + despesa.getDescricao() + "*" + despesa.getDataOcorrencia()); %></p>
                <%}%>
            </div>
            <div id="filtros">
                <nav>
                  Filtros  
                </nav>
                <article id="article-filtros">
                    <section>
                        <h4>Período de dias:</h4>
                        <div><input type="number"> <span>à</span> <input type="number"></div>
                    </section>
                    <section>
                        <h4>Tipo de despesas:</h4>
                        <div id="tipo-despesas">
                            <div>
                                <input type="checkbox" value="alimento"> Despesa de Alimentação  
                            </div>
                            <div>
                                <input type="checkbox" value="atividade"> Despesa de Atração
                            </div>
                        </div>
                    </section>
                </article>
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
            <p>Despesas Totais: </p>
        </footer>
        
        <script src="js/js-despesas.js"></script>
    </body>
   
</html>