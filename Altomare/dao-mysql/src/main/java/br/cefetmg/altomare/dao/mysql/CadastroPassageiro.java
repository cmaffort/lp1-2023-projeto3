/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dao.mysql;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import br.cefetmg.altomare.dao-mysql.ConexaoDB;
import java.sql.Connection;
import br.cefetmg.altomare.dao-mysql.DadosForms;

/**
 *
 * @author KEHILARY
 */
@WebServlet(urlPatterns = {"/InserirPassageiro"})
public class CadastroPassageiro extends HttpServlet import IPassageiro{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
            String pacote = request.getParamenter("pacote");
            long despesa = 0;
            String senha = gerarSenha();
            
            InserirDadosPassageiro(pacote, despesa, cpf,  rg, nome, dataNascimento, email, senha,  telefone, sexo, civil, medico);
            
            
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroPassageiroBD</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroPassageiroBD at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
