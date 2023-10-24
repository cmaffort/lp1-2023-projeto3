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
       
        <div id="container">
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