/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dto;

/**
 *
 * @author Aluno
 */
public class Usuario {
   private Long cpf;
   private Long rg;
   private String nome;
   private String dataNascimento;
   private String email;
   private String senha;
   private Long telefone;
   private String sexo;
   private String estadoCivil;
   private String passaporte;
   private String endereço;
   
   
   public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf){
        this.cpf = cpf;
    }
    
     public Long getRg() {
        return rg;
    }

    public void setRg(Long rg){
        this.rg = rg;
    }
    
     public String getNome() {
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

}
