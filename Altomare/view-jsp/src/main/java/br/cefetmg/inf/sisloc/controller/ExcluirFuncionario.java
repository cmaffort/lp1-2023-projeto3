package br.cefetmg.inf.sisloc.controller;

import jakarta.servlet.http.HttpServletRequest;
import br.cefetmg.altomare.model.dto.Funcionario;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.ManterFuncionario;
        
public class ExcluirFuncionario {
    
    public static String execute(HttpServletRequest request){
           String jsp;
           try{
               Long funcionarioCpf = Long.parseLong(request.getParameter("cpfFuncionario"));
               IManterFuncionario manterFuncionario = new ManterFuncionario();
               Funcionario funcionario = manterFuncionario.pesquisarPorId(funcionarioCpf);
               boolean delete = manterFuncionario.excluir(funcionario);
               
               if(delete != false){
                   jsp = ListarFuncionario.execute(request);
               }else{
                   String erro = "Ocorreu um erro ao excluir o usuário.";
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
