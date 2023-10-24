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
   private String cpf;
   private long rg;
   private String nome;
   private String dataNascimento;
   private String email;
   private String senha;
   private long telefone;
   private String sexo;
   private String estadoCivil;
   private String passaporte;
   private String endereco;
   
   
   public Usuario(String cpf, long rg, String nome, String dataNascimento,String email, String senha,long telefone, String sexo, String estadoCivil, String passaporte, String endereco){
      this.cpf = cpf;
      this.rg = rg;
      this.nome = nome;
      this.dataNascimento = dataNascimento;
      this.email = email;
      this.senha = senha;
      this.telefone = telefone;
      this.sexo = sexo;
      this.estadoCivil = estadoCivil;
      this.passaporte = passaporte;
      this.endereco = endereco;
    
    }
   
   public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
     public long getRg() {
        return rg;
    }

    public void setRg(long rg){
        this.rg = rg;
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
   
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    
     public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone){
        this.telefone = telefone;
    }
    
     public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
     public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
     public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte){
        this.passaporte = passaporte;
    }
    
     public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
