/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.cefetmg.altomare.idao;

import br.cefetmg.altomare.dto.InscricaoDTO;

/**
 *
 * @author letic
 */
public interface IInscricaoDAO {
    void inserirInscricao(InscricaoDTO inscricao);
    void cancelarInscricao(InscricaoDTO inscricao);
}