import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import java.sql.Connection;
import br.cefetmg.altomare.model.dto.Passageiro;
import br.dao.InterfacePassageiro;
import br.cefetmg.altomare.model.dao.PassageiroDAO;
import java.sql.SQLException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.MultipartConfig;


@WebServlet(urlPatterns = {"/CadastroPassageiro"})
public class CadastroPassageiro extends HttpServlet{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out = response.getWriter();
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
                    String pacote = request.getParameter("pacote");
                    //String foto = request.getParameter("foto");
                    String senha = "";
            
                    Passageiro passageiro = new Passageiro(pacote, cpf,  rg, nome, dataNascimento, email, senha,  telefone, sexo, civil, medico);
                   
                    PassageiroDAO pass = new PassageiroDAO();
                    pass.InserirDadosPassageiro(passageiro);
          
                   String jsp = "ExibePassageiro.jsp";
                   RequestDispatcher rd = request.getRequestDispatcher(jsp);
                    rd.forward(request, response);

                    } finally {
                    out.close();
                }
             }


}
