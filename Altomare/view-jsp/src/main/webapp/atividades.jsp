<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="br.cefetmg.altomare.dto.AtividadeDTO"%>
<%@page import="br.cefetmg.altomare.dao.mysql.Conexao"%>
<%@page import="br.cefetmg.altomare.dao.mysql.AtividadeDAO"%>

<%
    Conexao conexao = new Conexao();
    AtividadeDAO atividadeDAO = new AtividadeDAO(conexao.conectaBD());

    List<AtividadeDTO> atividades = atividadeDAO.listarAtividadesVisiveis();
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atividades</title>
    </head>
    <body>
        <table>
            <caption>
                Atividades
            </caption>
            <thead>
                <tr>
                    <th>Atividade</th>
                    <th>Data</th>
                    <th>Início</th>
                    <th>Término</th>
                    <th>Local</th>
                    <th>Descrição</th>
                </tr>
            </thead>
            <tbody>
<%
    for (AtividadeDTO atividade : atividades) {
        if (atividadeDAO.lotado(atividade))
            continue;
%>
                <tr>
                    <td><%=atividade.getNome()%></td>
                    <td><%=atividade.getData()%></td>
                    <td><%=atividade.getHoraInicio()%></td>
                    <td><%=atividade.getHoraTermino()%></td>
                    <td><%=atividade.getLocal()%></td>
                    <td><%=atividade.getDescricao()%></td>
                </tr>
<%
    }
%>
            </tbody>
        </table>

        <form action="CadastrarInscricaoServlet" method="get">
            <label>Atividade:</label>
            <input type="text" name="atividade">

            <input type="submit" name="cadastrar" value="Se increver">
        </form>
    </body>
</html>
