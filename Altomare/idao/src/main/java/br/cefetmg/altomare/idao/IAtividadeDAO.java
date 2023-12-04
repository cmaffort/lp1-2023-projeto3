package br.cefetmg.altomare.idao;


import br.cefetmg.altomare.dto.AtividadeDTO;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author letic
 */
public interface IAtividadeDAO {
    void inserirAtividade(AtividadeDTO atividade);
    void atualizarAtividade(AtividadeDTO atividade);
    boolean lotado(AtividadeDTO atividade);
    List<AtividadeDTO> listarAtividades();
    List<AtividadeDTO> listarAtividadesVisiveis();
}
