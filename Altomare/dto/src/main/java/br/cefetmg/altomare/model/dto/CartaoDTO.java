package br.cefetmg.altomare.model.dto;

import java.util.*;

public class CartaoDTO {
    private String titular;
    private Date vencimento;
    private Integer cvv;
    private Long numero;
    
    public CartaoDTO(String titular, Date vencimento, Integer cvv, Long numero) {
        this.titular = titular;
        this.vencimento = vencimento;
        this.cvv = cvv;
        this.numero = numero;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String newTitular) {
        this.titular = newTitular;
    }
    
    public Date getVencimento() {
        return this.vencimento;
    }
    
    public void setVencimento(Date newVencimento) {
        this.vencimento = newVencimento;
    }
    
    public Integer getCvv() {
        return this.cvv;
    }
    
    public void setCvv(Integer newCvv) {
        this.cvv = newCvv;
    }
    
    public Long getNumero() {
        return this.numero;
    }
    
    public void setNumero(Long newNumero) {
        this.numero = newNumero;
    }
}
