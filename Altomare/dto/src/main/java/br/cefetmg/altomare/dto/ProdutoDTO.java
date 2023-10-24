
package br.cefetmg.altomare.dto;

import java.util.List;

public class ProdutoDTO {

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
    private List<ProdutoDTO> Produto;

    public ProdutoDTO(String nome, double preco, String tipo, String estado) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.estado = estado;

    }

    public List<ProdutoDTO> getTipo() {
        return this.Produto;
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

     public void  setEstado(String estado) {
        this.estado = estado;
       

    }
    public String getEstado() {
        return estado;
    }

   
}
