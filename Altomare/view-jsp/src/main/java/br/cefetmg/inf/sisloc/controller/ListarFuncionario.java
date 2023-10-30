package br.cefetmg.inf.sisloc.controller;

import jakarta.servlet.http.HttpServletRequest;
import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.ManterFuncionario;
import java.util.List;

public class ListarFuncionario {
    
    public static String execute(HttpServletRequest request){
        String jsp;
        try{
            IManterFuncionario manterFuncionario = new ManterFuncionario();
            List<FuncionarioDTO> listFuncionario = manterFuncionario.pesquisarTodos();
            if(listFuncionario != null){
                request.setAttribute("listFuncionario", listFuncionario);
                jsp = "/listarFuncionario.jsp";
            }else{
                String erro = "Não há registros.";
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
