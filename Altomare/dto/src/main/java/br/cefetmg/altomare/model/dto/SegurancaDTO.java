
package br.cefetmg.altomare.model.dto;


public class SegurancaDTO {
    public String especificacao;
    public String nome;
    
    public SegurancaDTO(String nome, String espec){
        this.especificacao = espec;
        this.nome = nome;
    }   
    
    public SegurancaDTO(){
        this.especificacao = "";
        this.nome = "";
    }
    
    public String getEspecificacao(){
        return especificacao;
    }
    public void setEspecificacao(String espec){
        this.especificacao = espec;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
