package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.AtividadeDTO;
import java.sql.SQLException;
import java.util.List;


public interface IAtividadeDAO {
    
    public void inserirAtividade(AtividadeDTO produto) throws SQLException;
    public void atualizarAtividade(AtividadeDTO produto) throws SQLException;
    public List<AtividadeDTO> listarAtividades() throws SQLException;
    
}
