<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@ page import="br.cefetmg.altomare.model.dto.PacoteDTO" %>
<%@ page import="br.cefetmg.altomare.model.dao.PacoteDAO" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contratos</title>
        <link rel="stylesheet" href="../../../css/produtos.css">
        <link rel="stylesheet" href="../../../css/estilos-header.css">
         <link rel="icon" href="../../../imagens/leme.png" type="image/webp">

   
    </head>
    <header id="header-main">
        <div id="header-upper">

            <img src="../../../imagens\leme.png" id="leme">

            <div>
                <h1 id="altoMare">AltoMare </h1>
                <h2 id="embarcacoes">EMBARCAÇÕES</h2>
            </div>
            <div>

                <img src="../../../imagens\user-icon.png" id="user-icon">
                <p style="font-family: 'Alegreya SC'; padding-left: vw;">GERENTE</p>

            </div>
        </div>
        <div id="linha"></div>
        <div id="burger"><p>☰</p></div>
        <ul>
            <li>
                <a href="../../../core/funcionarios/cadastroFuncionario.jsp" style="color: white;text-decoration: none">
                <img src="../../../imagens/funcionarios.png" style="height: 35px;padding-top: 1.5cm;">
                <p>Funcionários</p>
                </a>
            </li>
            <li>
                <a href="../../../core/passageiro/Cadastro.jsp" style="color: white;text-decoration: none">
                <img src="../../../imagens/passageiros.png" style="height: 35px;padding-top: 1.5cm;">
                <p>Passageiros</p> 
                </a>
            </li>
            <li>
                <a href="../../../core/pacotes/contratos/GerarContratos.jsp" style="color: white;text-decoration: none">
                <img src="../../../imagens/pacotes.png" style="height: 35px;padding-top: 1.5cm;">
                <p>Pacotes</p>  
                </a>
            </li>
            <li>
                <a href="" style="color: white;text-decoration: none">
                <img src="../../../imagens/iconeSeguranca.png" style="height: 35px;padding-top: 1.5cm;">
                <p>Segurança</p>
                </a>
            </li>
            <li>
                <a href=".jsp" style="color: white;text-decoration: none">
                <img src="../../../imagens/cronograma.png" style="height: 35px;padding-top: 1.5cm;">
                <p>Conograma</p>
                </a>
            </li>
            <li>
                <a href="../../../core/gestor_produtos/cadastrar.jsp" style="color: white;text-decoration: none">
                <img src="../../../imagens/" style="height: 35px;padding-top: 1.5cm;">
                <p>Produtos</p>
                <a>
                
            </li>
   
        </ul>
    
        <br>
    

        <br>
    
        
        </header>
    <body>

        <h1>Contratos Gerados</h1>
        <form action="../../../../BaixarPdf" method="post" style="">
            <a href="../../../core/pacotes/contratos/GerarContratos.jsp" style="color: black;text-decoration: none;padding-left: 4.75cmS">Voltar</a>  
            <br>

            <%
                ArrayList<PacoteDTO> pacotes = new ArrayList<>();
                try {
                    PacoteDAO pacoteDAO = new PacoteDAO();
                    pacotes = pacoteDAO.listarPacotes(); 
                } catch (Exception e) {
                    out.print(e);
                }

                for (PacoteDTO pacote : pacotes) {
            %>
            <div class="contract-box">
                <section class="cont-esq">
                    <div ><%=pacote.getNomeContratante()%></div>
                    <div >Destino: <%=pacote.getDestino()%></div>
                </section>
                <section class="cont-dir">
                    <div >Data Partida: <%=pacote.getDataPartida()%></div>
                    <div >Duração: <%=pacote.getDuracaoCruzeiro()%> dias</div>
                    <a href="../../../../BaixarPdf?cpf=<%=pacote.getCpfContratante()%>" target="_blank" class="download-link">Baixar Contrato</a>
                </section>
            </div>
            <% }%>
        </form>

    </body>
</html>
