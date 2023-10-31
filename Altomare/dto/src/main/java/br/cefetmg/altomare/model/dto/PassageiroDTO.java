package br.cefetmg.altomare.model.dto;

public class PassageiroDTO extends UsuarioDTO{

    //public Pacote pacote;
    public ContaUsuarioDTO contaUsuario;
    public String dadosMedicos;
    public String senha;
            
    public PassageiroDTO(/*Pacote pacote,*/ ContaUsuarioDTO contaUsuario, long cpf, String nome, String dataNascimento, String email, String senha, String sexo, String estadoCivil, String dadosMedicos, long rg, long telefone, String passaporte, long cep){
        super(cpf, rg, nome, dataNascimento, email, senha, telefone, sexo, estadoCivil, passaporte, cep); //falta passaporte e cep
        // this.pacote = pacote;
         this.contaUsuario = contaUsuario;
        this.dadosMedicos = dadosMedicos;
    }

    public PassageiroDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  public String getDadosMedicos() {
        return this.dadosMedicos;                                          
}
  public void setDadosMedicos(String dadoNovo){
        this.dadosMedicos = dadoNovo;
}

    public int getDespesa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPacote() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCivil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
