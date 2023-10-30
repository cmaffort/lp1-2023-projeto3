<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despesas</title>
        <link rel="stylesheet" href="css/estilos-adiciona-despesas.css">
    </head>
    <body>
        <%@ include file="header.jsp" %>

        <form id="form-passageiro">
            <div>
                <input type="text" placeholder="Pesquise um passageiro..." id="form-passageiro-digitar">
                <input type="submit" value="🔎" id="form-passageiro-enviar">
            </div>
        </form>
        
        <div id="aux">
           <form id="form-despesa">
               <div class="form-despesa-cetralizar">
                   <h1>Registro da Despesa</h1>
               </div>
               <div id="form-despesa-container">
                    <div id="form-despesa-subcontainer">
                       <div class="form-secao">
                            <h2>Valor</h2>
                            <input type="text" class="form-despesa-not-desc">
                        </div>
                        <div class="form-secao">
                            <h2>Tipo de Despesa</h2>
                            <input type="text" class="form-despesa-not-desc">
                        </div> 
                    </div>
                    <div class="form-secao">
                        <h2>Descrição (Opcional)</h2>
                        <input type="text" id="form-despesa-desc">
                    </div>
                </div>
                <div class="form-despesa-cetralizar">
                    <input type="submit" value="Enviar">
                </div>
            </form> 
        </div>
 
        <script src="js/js-adiciona-despesa.js"></script>
    </body>
   
</html>
