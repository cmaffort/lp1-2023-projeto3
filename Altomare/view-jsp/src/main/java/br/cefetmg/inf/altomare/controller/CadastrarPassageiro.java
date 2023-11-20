package br.cefetmg.inf.altomare.controller;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import br.cefetmg.altomare.model.dao.PassageiroDAO;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Part;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet(urlPatterns = {"/CadastrarPassageiro"})
public class CadastrarPassageiro extends HttpServlet{

    public static String execute(HttpServletRequest request) throws PersistenciaException, NegocioException, IOException {
               String  jsp = null;
                try {
            
                    String nome = request.getParameter("nome");
                    String dataNascimento = request.getParameter("dataNascimento");
                    String sexo = request.getParameter("sexo");
                    String cpf = request.getParameter("cpf");
                    String rg = request.getParameter("rg");
                    String civil = request.getParameter("civil");
                    String email = request.getParameter("email");
                    String telefone = request.getParameter("telefone");
                    String medico = request.getParameter("medico");
                    String senha = "";
                    Part photo = request.getPart("foto");
                    String caminho = TratamentoImagem.execute(request);
            
                    PassageiroDTO passageiro = new PassageiroDTO (new ContaUsuarioDTO(), cpf, nome, dataNascimento, email, senha, sexo, civil, medico, rg, telefone, caminho);
                   
                    PassageiroDAO pass = new PassageiroDAO();
                    pass.InserirDadosPassageiro(passageiro);
          
                   jsp = "core/passageiro/ExibePassageiro.jsp";
                  
             } catch(PersistenciaException | ClassNotFoundException | SQLException e) {
              request.setAttribute("tperror", "cadastroPassageiro");
              request.setAttribute("error", "Não foi possível realizar o cadastro, tente novamente");
        } catch (ServletException ex) { 
            Logger.getLogger(CadastrarPassageiro.class.getName()).log(Level.SEVERE, null, ex);
        }
               return jsp;
    }
}
