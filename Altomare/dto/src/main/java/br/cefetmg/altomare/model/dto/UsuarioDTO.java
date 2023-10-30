
package br.cefetmg.altomare.model.dto;


public class UsuarioDTO {
   private long cpf;
   private long rg;
   private String nome;
   private String dataNascimento;
   private String email;
   private String senha;
   private long telefone;
   private String sexo;
   private String estadoCivil;
   private String passaporte;
   private long cep;
   
   
   public UsuarioDTO(long cpf, long rg, String nome, String dataNascimento,String email, String senha,long telefone, String sexo, String estadoCivil, String passaporte, long cep){
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
      this.cep = cep;
    
    }
   
   public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf){
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
    
     public long getCep() {
        return cep;
    }

    public void setCep(long endereco){
        this.cep = cep;
    }
}
