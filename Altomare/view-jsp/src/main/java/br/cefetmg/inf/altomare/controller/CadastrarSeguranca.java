package br.cefetmg.inf.altomare.controller;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import br.cefetmg.altomare.model.dto.SegurancaDTO;
import br.cefetmg.altomare.model.dao.SegurancaDAO;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.exception.NegocioException;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.sql.SQLException;



@WebServlet(urlPatterns = {"/CadastrarSeguranca"})
public class CadastrarSeguranca extends HttpServlet{

    public static String execute(HttpServletRequest request) throws PersistenciaException, NegocioException, ServletException, IOException {

               String  jsp = null;
                try {
            
                    String tema = request.getParameter("tema");
                    String sobre = request.getParameter("sobre");
      
            
                    SegurancaDTO seguranca = new SegurancaDTO (tema, sobre);

                   
                    SegurancaDAO seg = new SegurancaDAO();
                    seg.Inserir(seguranca);
          
                   jsp = "core/seguranca/ExibeSeguranca.jsp";
                  
             } catch(PersistenciaException | ClassNotFoundException | SQLException e) {
                 e.printStackTrace();
        } 
               return jsp;
    }
    
}
