    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dto;

import java.util.List;

/**
 *
 * @author User
 */
public class Produto {

    private static void remove(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean contains(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String nome;
    private String tipo;
    private double preco;
    private String estado;
    private List<Produto> Produto;

    public Produto(String nome, double preco, String tipo, String estado) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.estado = estado;

    }

    public List<Produto> getTipo() {
        return this.Produto;
    }
    
!!!!!!!!
    public void setTipo(tipo) {
        if (!Produto.contains(tipo)) {
            this.Produto.add(tipo);
        }
    }

    public void removerTipo(String tipo) {
        Produto.remove(tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public void  setEstado(String estado) {
        this.estado = estado;
       

    }
    public String getEstado() {
        return estado;
    }

   
}
