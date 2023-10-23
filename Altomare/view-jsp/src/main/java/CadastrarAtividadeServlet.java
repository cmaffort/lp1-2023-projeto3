import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.dto.AtividadeDTO;

public class CadastrarAtividadeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // recuperar os dados do formulario
        String nome = request.getParameter("nome");
        String data = request.getParameter("data");
        String horaInicio = request.getParameter("horaTermino");
        String horaTermino = request.getParameter("horaTermino");
        String local = request.getParameter("local");
        int limiteOcupacao = Integer.parseInt(request.getParameter("limiteOcupacao"));
        String responsavel = request.getParameter("responsavel");
        String descricao = request.getParameter("descricao");
        
        // criar instancia da classe Atividade
        AtividadeDTO atividade = new AtividadeDTO (nome, data, horaInicio, horaTermino, local, limiteOcupacao, responsavel, descricao);
        
        // salvar a instancia criada no banco de dados
        
        //response.sendRedirect("atividade-confirmacao.jsp"); //criar a pagina de redirecionamento
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
