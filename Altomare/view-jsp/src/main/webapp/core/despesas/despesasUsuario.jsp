<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despesas</title>
        <link rel="stylesheet" href="../../css/estilos-despesas.css">
    </head>
    <body>
        <%@ include file="../../headerPassageiro.jsp" %>
        <%@ page import="br.cefetmg.altomare.model.dto.*" %>
        <%@ page import="br.cefetmg.altomare.model.service.*" %>
        <%@ page import="java.util.*" %>

        <%
            /*import br.cefetmg.altomare.service.GetDespesasToView;

            GetDespesasToView getDespesas = new GetDespesasToView(Passageiro passageiro);*/
            
            ArrayList<DespesaDTO> arr = new ArrayList<>();
            arr.add(new DespesaDTO(1, 100.0, true, "produto", "Produto 1", new Date(2023, 5, 18, 10, 52, 40)));
            arr.add(new DespesaDTO(2, 200.0, true, "atração", "Produto 2", new Date(2022, 5, 10, 10, 52, 40)));
            arr.add(new DespesaDTO(3, 300.0, true, "produto", "Produto 3", new Date(2023, 6, 11, 10, 52, 40)));
            arr.add(new DespesaDTO(4, 400.0, true, "produto", "Produto 4", new Date(2023, 6, 15, 10, 52, 40)));
            arr.add(new DespesaDTO(5, 500.0, true, "atração", "Produto 5", new Date(2023, 7, 22, 10, 52, 40)));
            
            //GetDespesasToView despesasOrdenadas = new GetDespesasToView(arr);
            //despesasOrdenadas.ordenaDespesasPorData();
            
            double total = 0;
        %>
       
        <div id="container">
            <div id="get-dados-conta">
                <%  /*getDespesas.getDespesas()*/

                    for (DespesaDTO despesa: /*despesasOrdenadas*/ arr) { %>
                    
                    <p class="conteudo-passado"><% out.println(despesa.getValor() + "*" + despesa.getTipo() + "*" + despesa.getDescricao() + "*" + despesa.getDataOcorrencia()); 
                    %></p>
                    
                    <% total+= despesa.getValor(); %>
                <%}%>
            </div>
            <div id="filtros">
                <nav>
                  Filtros  
                </nav>
                    <form action="servletDespesas" method="GET" id="article-filtros">
                        <div id="filtros-escolha">
                            <section>
                                <h4>Período de dias:</h4>
                                <div><input type="number" name="dia1"> <span>à</span> <input type="number" name="dia2"></div>
                            </section>
                            <section>
                                <h4>Tipo de despesas:</h4>
                                <div id="tipo-despesas">
                                    <div>
                                        <input type="checkbox" value="alimento" name="tipo"> Despesa de Alimentação  
                                    </div>
                                    <div>
                                        <input type="checkbox" value="atividade" name="tipo"> Despesa de Atração
                                    </div>
                                </div>
                            </section>
                        </div>
                        <input type="submit" value="Filtrar" id="filtrar">
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
            <p>Despesas Totais: <%= total %></p>
        </footer>
        
        <script src="../../js/js-despesas.js"></script>
    </body>
   
</html>