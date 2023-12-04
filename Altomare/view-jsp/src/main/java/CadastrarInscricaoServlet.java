import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import br.cefetmg.altomare.dto.InscricaoDTO;
import br.cefetmg.altomare.dao.mysql.Conexao;
import br.cefetmg.altomare.dao.mysql.InscricaoDAO;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "CadastrarInscricaoServlet", urlPatterns = {"/CadastrarInscricaoServlet"})
public class CadastrarInscricaoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // recuperar os dados do formulario
        String atividade = request.getParameter("atividade");

        //recuperar usuario
        HttpSession session = request.getSession(false);
        String usuario = (String) session.getAttribute("usuario");
        
        // criar instancia da classe Atividade
        InscricaoDTO inscricao = new InscricaoDTO(atividade, usuario);
        
        // salvar a instancia criada no banco de dados
        Conexao conexao = new Conexao();
        InscricaoDAO inscricaoDAO = new InscricaoDAO(conexao.conectaBD());
        inscricaoDAO.inserirInscricao(inscricao);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
