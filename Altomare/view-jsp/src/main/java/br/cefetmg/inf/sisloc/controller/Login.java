
package br.cefetmg.inf.sisloc.controller;

import br.cefetmg.altomare.model.dto.Funcionario;
import br.cefetmg.altomare.model.service.IManterFuncionario;
import br.cefetmg.altomare.model.service.ManterFuncionario;
import br.cefetmg.altomare.model.dto.Passageiro;
import br.cefetmg.altomare.model.service.IManterPassageiro;
import br.cefetmg.altomare.model.service.ManterPasssageiro;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class Login {
    
    @SuppressWarnings("static-access")
    public static String execute(HttpServletRequest request){
        String jsp = "";
        
        try{
            String user = request.getParameter("cpfUsuario");
            String senha = request.getParameter("senhaUsuario");
            
            IManterFuncionario manterFuncionario = new ManterFuncionario();
            Funcionario funcionario = manterFuncionario.getUserLogin(user, senha);
            
             if(funcinario != null){
                request.getSession().setAttribute("cpfFuncionario", funcionario.getCpf());
                if(funcionario.getSetor().equals("gerencia"))
                    jsp = "/setores.jsp";
                if(funcionario.getSetor().equals("limpeza"))     
                    jsp = "/agenteLimpezaManutencao.jsp";
                if(funcionario.getSetor().equals("saude"))     
                    jsp = "/Medico.jsp";
                if(funcionario.getSetor().equals("inpecao"))     
                    jsp = "/inspetor.jsp";
                if(funcionario.getSetor().equals("entregaQuartos"))     
                    jsp = "/garconQuartos.jsp";
                if(funcionario.getSetor().equals("entregaRestaurante"))     
                    jsp = "/garconRestaurante.jsp";
                if(funcionario.getSetor().equals("restaurante"))     
                    jsp = "/cozinheiro.jsp";
            }else{
                IManterPassageiro manterPassageiro = new ManterPassageiro();
                Passageiro passageiro = manterPassageiro.getUserLogin(user, senha);
                
                if(passageiro == null){
                    String erro = "Usuário não encontrado.";
                    request.setAttribute("erro", erro);
                    jsp = "/erro.jsp";
                }
                else{
                    jsp = "/reserva.jsp";
                }
             }
           
        }catch(Exception e){
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
    
    public static void validarSessao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Long cpfFuncionario = (long) request.getSession().getAttribute("cpfFuncionario");
        String jsp = "";
        
        if(cpfFuncionario == null){
            jsp = "/login-index.jsp";
            //Redirecionando pagina
            RequestDispatcher rd = request.getRequestDispatcher(jsp);
            rd.forward(request, response);
        }
    }
}
