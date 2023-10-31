
package br.cefetmg.inf.altomare.controller;

import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.ManterFuncionario;
import jakarta.servlet.http.HttpServletRequest;

public class GravarAlteracaoFuncionario {
    
    public static String execute(HttpServletRequest request){
       String jsp; 
       
       try{
          Long cpfFuncionario = Long.parseLong(request.getParameter("cpfFuncionario"));
          String nome = request.getParameter("nomeFuncionario");
          String email = request.getParameter("emailFuncionario");
          String senha = request.getParameter("senhaFuncionario");
          
          FuncionarioDTO funcionario = new FuncionarioDTO();
          funcionario.setCpf(cpfFuncionario);
          funcionario.setNome(nome);
          funcionario.setEmail(email);
          funcionario.setSenha(senha);
          
          IManterFuncionario manterFuncionario = new ManterFuncionario();
          boolean updated = manterFuncionario.alterar(funcionario);
          
          if(updated == true){
             jsp = ListarFuncionario.execute(request);
          }else{
              String erro = "Ocorreu um erro ao gravar a alteração do funcionário.";
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
