/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dto;

/**
 *
 * @author letic
 */
public class InscricaoDTO {
    private String atividade;
    private String usuario;
    
    public InscricaoDTO(String atividade, String usuario) {
        this.atividade = atividade;
        this.usuario = usuario;
    }
    
    public String getAtividade() {
        return atividade;
    }
    
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}