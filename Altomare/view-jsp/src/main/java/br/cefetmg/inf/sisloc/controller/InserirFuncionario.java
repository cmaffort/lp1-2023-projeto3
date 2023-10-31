package br.cefetmg.inf.sisloc.controller;



import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import br.cefetmg.altomare.model.dao.IFuncionarioDAO;
import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.ManterFuncionario;
import java.util.List;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet(urlPatterns = {"/InserirFuncionario"})

public abstract class InserirFuncionario extends HttpServlet implements IFuncionarioDAO{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String jsp;
        try{
            IManterFuncionario manterFuncionario = new ManterFuncionario();
            List<FuncionarioDTO> listFuncionario = manterFuncionario.pesquisarTodos();
            
            if(listFuncionario != null){
                request.setAttribute("listFuncionario", listFuncionario);
                jsp = "/inserirFuncionario.html";
            }else{
                String erro = "Não há registros do funcionário.";
                request.setAttribute("erro", erro);
                jsp = "/erro.jsp";
            }
            RequestDispatcher rd = request.getRequestDispatcher(jsp);
            rd.forward(request, response);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            out.close();
        }
       
    }
}
