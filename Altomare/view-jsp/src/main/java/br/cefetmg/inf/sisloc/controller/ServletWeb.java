package br.cefetmg.inf.sisloc.controller;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletWeb extends HttpServlet {
    private String jsp = "";
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String acao = request.getParameter("acao");
        
        if(acao.equals("Logar"))
            jsp = Login.execute(request);
        else if (acao.equals("ListarFuncionarios"))
            jsp = ListarFuncionario.execute(request);
        else if (acao.equals("AlterarFuncionario"))
            jsp = AlterarFuncionario.execute(request);
        else if (acao.equals("GravarAlteracaoFuncionario"))
            jsp = GravarAlteracaoFuncionario.execute(request);
        else if (acao.equals("GravarInsercaoFuncionario"))
            jsp = GravarInsercaoFuncionario.execute(request);
        else if (acao.equals("ExcluirFuncionario"))
            jsp = ExcluirFuncionario.execute(request);
        

        //Redirecionando pagina
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        rd.forward(request, response);
    }    
}
