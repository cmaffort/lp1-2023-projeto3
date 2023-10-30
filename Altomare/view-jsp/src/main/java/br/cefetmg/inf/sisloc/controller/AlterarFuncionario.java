package br.cefetmg.inf.sisloc.controller;

import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.ManterFuncionario;
import jakarta.servlet.http.HttpServletRequest;



public class AlterarFuncionario{
    
    public static String execute(HttpServletRequest request){
        String jsp;
        
        try{
            Long cpfFuncionario = Long.parseLong(request.getParameter("cpfFuncionario"));
            IManterFuncionario manterFuncionario = new ManterFuncionario();
            FuncionarioDTO funcionario = manterFuncionario.pesquisarPorId(cpfFuncionario);
            if(funcionario != null){
                request.setAttribute("funcionario", funcionario);
                jsp = "/alterarFuncionario.jsp";
            }else{
                String erro =  "Ocorreu um erro ao alterar o funcionário.";
                request.setAttribute("erro", erro);
                jsp = "/erro.jsp";
            }
        }catch(Exception e){
           e.printStackTrace();
           jsp = "";
        }
        return jsp;
    }
}
