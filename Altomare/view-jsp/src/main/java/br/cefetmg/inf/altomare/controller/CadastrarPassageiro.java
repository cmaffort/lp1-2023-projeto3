
package br.cefetmg.inf.altomare.controller;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import br.cefetmg.altomare.model.dao.PassageiroDAO;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import jakarta.servlet.http.Part;
import java.io.File;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet(urlPatterns = {"/CadastrarPassageiro"})
public class CadastrarPassageiro extends HttpServlet{

    public static String execute(HttpServletRequest request) throws PersistenciaException, NegocioException {
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
                    String photo = request.getParameter("foto");
                    //String fileName = Paths.get(photo.getSubmittedFileName()).getFileName().toString();
                    String senha = "";
                   // String caminho = null;
                    
                   /* File diretorio = new File("imagensPassageiro");
                    if(! diretorio.exists()){
                        diretorio.mkdir();
                        File foto = new File(diretorio, fileName);
                        caminho = foto.getAbsolutePath();
                    }*/
            
                    PassageiroDTO passageiro = new PassageiroDTO (new ContaUsuarioDTO(), cpf, nome, dataNascimento, email, senha, sexo, civil, medico, rg, telefone, photo);
                   
                    PassageiroDAO pass = new PassageiroDAO();
                    pass.InserirDadosPassageiro(passageiro);
          
                   jsp = "core/passageiro/ExibePassageiro.jsp";
                  
             } catch(PersistenciaException | ClassNotFoundException | SQLException e) {
              request.setAttribute("tperror", "cadastroPassageiro");
              request.setAttribute("error", "Não foi possível realizar o cadastro, tente novamente");
        } 
               return jsp;
    }
}
