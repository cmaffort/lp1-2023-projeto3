
package br.cefetmg.inf.altomare.controller;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import java.sql.Connection;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import br.cefetmg.altomare.model.dao.IPassageiroDAO;
import br.cefetmg.altomare.model.dao.PassageiroDAO;
import br.cefetmg.altomare.model.dto.ContaUsuarioDTO;
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
                    long cpfLong = Long.parseLong(cpf);
                    String rg = request.getParameter("rg");
                    long rgLong = Long.parseLong(rg);
                    String civil = request.getParameter("civil");
                    String email = request.getParameter("email");
                    String telefone = request.getParameter("telefone");
                    long telefoneLong = Long.parseLong(telefone);
                    String medico = request.getParameter("medico");
                    //String foto = request.getParameter("foto");
                    String passaporte = request.getParameter("passaporte");
                    String cep = request.getParameter("cep");
                    long cepLong = Long.parseLong(cep);
                    String senha = "";
            
                    PassageiroDTO passageiro = new PassageiroDTO (new ContaUsuarioDTO(), cpfLong, nome, dataNascimento, email, senha, sexo, civil, medico, rgLong, telefoneLong, passaporte, cepLong);
                   
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
