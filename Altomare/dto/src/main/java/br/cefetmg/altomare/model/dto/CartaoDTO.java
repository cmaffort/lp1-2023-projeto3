package br.cefetmg.altomare.model.dto;

import java.util.*;
import java.text.*;

public class CartaoDTO {
    private Long idCartao;
    private String titular;
    private String vencimento;
    private String tipo;
    private Integer cvv;
    private Long numero;
    private Long idRelacionaConta;
    
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    
    public CartaoDTO() {
    
    }
    
    /*public CartaoDTO(String titular, Date vencimento, String tipo, Integer cvv, Long numero, Long idConta) {
        this.titular = titular;
        this.vencimento = dateFormat.format(vencimento);
        this.tipo = tipo;
        this.cvv = cvv;
        this.numero = numero;
        this.idRelacionaConta = idConta;
    }*/
    
    public CartaoDTO(String titular, String vencimento, String tipo, Integer cvv, Long numero, Long idConta) {
        this.titular = titular;
        this.vencimento = vencimento;
        this.tipo = tipo;
        this.cvv = cvv;
        this.numero = numero;
        this.idRelacionaConta = idConta;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String newTitular) {
        this.titular = newTitular;
    }
    
    public String getVencimento() {
        return this.vencimento;
    }
    
    public void setVencimento(String newVencimento) {
        this.vencimento = newVencimento;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    public long getIdCartao() {
        return idCartao;
    }
    
    public void setIdCartao(long novoId) {
        idCartao = novoId;
    }
    
    public long getIdConta() {
        return idRelacionaConta;
    }
    
    public void setIdConta(long novoId) {
        idRelacionaConta = novoId;
    }
}
