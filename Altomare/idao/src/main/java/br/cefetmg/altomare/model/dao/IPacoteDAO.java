/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.PacoteDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface IPacoteDAO {
     public void inserirPacote(PacoteDTO pacote) throws SQLException; 
    public PacoteDTO obterPacotePorCPF(String cpf) throws SQLException;
    public ArrayList<PacoteDTO> listarPacotes() throws SQLException ;

}
