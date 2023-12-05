/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.model.dto;



/**
 *
 * @author User
 */
public class PacoteDTO {
    private String nomeContratante;
    private String telefoneContratante;
    private String destino;
    private String dataPartida;
    private String duracaoCruzeiro;
    private String cpfContratante;
    private String classe;
    private String cabine;

   

    public PacoteDTO() {
       
    }

    public PacoteDTO(String nomeContratante, String cpfContratante,String telefoneContratante, String destino, String dataPartida,
                       String duracaoCruzeiro,String classe, String cabine) {
        this.nomeContratante = nomeContratante;
        this.cpfContratante= cpfContratante;
        this.telefoneContratante = telefoneContratante;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.duracaoCruzeiro = duracaoCruzeiro;
        
    }

    public String getClasse() {
        return classe;
    }

    public String getCabine() {
        return cabine;
    }

    public String getNomeContratante() {
        return nomeContratante;
    }

    public String getTelefoneContratante() {
        return telefoneContratante;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public String getDuracaoCruzeiro() {
        return duracaoCruzeiro;
    }

    public String getCpfContratante() {
        return cpfContratante;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setCabine(String cabine) {
        this.cabine = cabine;
    }

    public void setNomeContratante(String nomeContratante) {
        this.nomeContratante = nomeContratante;
    }

    public void setTelefoneContratante(String telefoneContratante) {
        this.telefoneContratante = telefoneContratante;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public void setDuracaoCruzeiro(String duracaoCruzeiro) {
        this.duracaoCruzeiro = duracaoCruzeiro;
    }

    public void setCpfContratante(String cpfContratante) {
        this.cpfContratante = cpfContratante;
    }
}
    

   
