/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.SaudeDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface ISaudeDAO {
        public void salvarProntuario(SaudeDTO prontuario) throws SQLException, ClassNotFoundException;
        public ArrayList<SaudeDTO> listarProntuarios() throws SQLException;

    
}
