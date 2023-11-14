
package br.cefetmg.altomare.model.dto;


public class UsuarioDTO {
   private String cpf;
   private String rg;
   private String nome;
   private String dataNascimento;
   private String email;
   private String senha;
   private String telefone;
   private String sexo;
   private String estadoCivil;
   private String foto;
   
   public UsuarioDTO() {
       
   }
   
   public UsuarioDTO(String cpf, String rg, String nome, String dataNascimento,String email, String senha,String telefone, String sexo, String estadoCivil, String foto){
      this.cpf = cpf;
      this.rg = rg;
      this.nome = nome;
      this.dataNascimento = dataNascimento;
      this.email = email;
      this.senha = senha;
      this.telefone = telefone;
      this.sexo = sexo;
      this.estadoCivil = estadoCivil;
      this.foto = foto;
    }
   
   public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
     public String getRg() {
        return rg;
    }

    public void setRg(String rg){
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
    
     public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone){
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
    
    public String getFoto(){
        return foto;
    }
    public void setFoto(String foto){
        this.foto = foto;
    }
}
