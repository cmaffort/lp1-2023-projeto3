
package br.cefetmg.inf.sisloc.controller;

import br.cefetmg.altomare.model.dto.Funcionario;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.ManterFuncionario;
import java.util.List;
import jakarta.servlet.http.HttpServletRequest;


public class InserirFuncionario {
    
    public static String execute(HttpServletRequest request){
        String jsp;
        try{
            IManterFuncionario manterFuncionario = new ManterFuncionario();
            List<Funcionario> listFuncionario = manterFuncionario.pesquisarTodos();
            
            if(listFuncionario != null){
                request.setAttribute("listFuncionario", listFuncionario);
                jsp = "/inserirFuncionario.jsp";
            }else{
                String erro = "Não há registros do funcionário.";
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
