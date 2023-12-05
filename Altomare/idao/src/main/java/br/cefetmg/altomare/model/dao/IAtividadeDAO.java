package br.cefetmg.altomare.model.dao;


import br.cefetmg.altomare.model.dto.AtividadeDTO;
import java.util.List;


public interface IAtividadeDAO {
    void inserirAtividade(AtividadeDTO atividade);
    void atualizarAtividade(AtividadeDTO atividade);
    boolean lotado(AtividadeDTO atividade);
    List<AtividadeDTO> listarAtividades();
    List<AtividadeDTO> listarAtividadesVisiveis();
}
