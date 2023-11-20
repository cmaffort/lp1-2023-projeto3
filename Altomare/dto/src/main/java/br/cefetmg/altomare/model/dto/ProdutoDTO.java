package br.cefetmg.altomare.model.dto;

import java.util.Date;

public class ProdutoDTO {
    private Integer Id;
    private String nome;
    private String tipo;
    private double preco;
    private String estado;
    private Integer quantidade;
    private String data;
    

    public ProdutoDTO() {
    }

    public ProdutoDTO(String nome, double preco, String tipo, String estado, Integer Id,Integer quantidade,String data) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.estado = estado;
        this.Id = Id;
        this.quantidade = quantidade;
        this.data = data;
        
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    
}
