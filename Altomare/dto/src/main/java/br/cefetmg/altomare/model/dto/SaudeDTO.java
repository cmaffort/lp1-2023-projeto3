/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.model.dto;

/**
 *
 * @author User
 */
public class SaudeDTO {
    
    
    
    private String name;
    private String cabine;
    private String genero;
    private String telefone;
    private String Observacao;
    private String datanas;
    private Integer Id;
    private String medicamento;

    
    
     public SaudeDTO(String name, String cabine, String genero, String telefone, String Observacao, String datanas, Integer id,String medicamento) {
        this.name = name;
        this.cabine = cabine;
        this.genero = genero;
        this.telefone = telefone;
        this.Observacao = Observacao;
        this.datanas = datanas;
        this.Id = id;
        this.medicamento = medicamento; 
    }

    public SaudeDTO() {
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
    
    public String getMedicamento() {
        return medicamento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getId() {
        return Id;
    }

    public void setCabine(String cabine) {
        this.cabine = cabine;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    public void setDatanas(String datanas) {
        this.datanas = datanas;
    }

    public String getName() {
        return name;
    }

    public String getCabine() {
        return cabine;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getObservacao() {
        return Observacao;
    }

    public String getDatanas() {
        return datanas;
    }

   
    
    
    
}
