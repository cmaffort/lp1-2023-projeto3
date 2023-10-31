
package br.cefetmg.inf.altomare.controller;

import jakarta.servlet.http.HttpServletRequest;
import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.ManterFuncionario;

public class GravarInsercaoFuncionario {
    
    public static String execute(HttpServletRequest request){
        String jsp;
        try{
            String nome = request.getParameter("nomeFuncionario");
            String email = request.getParameter("emailFuncionario");
            String senha = request.getParameter("senhaFuncionario");
            
            FuncionarioDTO funcionario = new FuncionarioDTO();
            funcionario.setNome(nome);
            funcionario.setEmail(email);
            funcionario.setSenha(senha);
            
            IManterFuncionario manterFuncionario = new ManterFuncionario();
            Long funcionarioCpf =  manterFuncionario.cadastrar(funcionario);
            
            if(funcionarioCpf != null){
                jsp = ListarFuncionario.execute(request);
            }else{
                String erro = "Ocorreu um erro ao gravar esse registro.";
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
