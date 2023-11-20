package br.cefetmg.altomare.model.dto;

public class PassageiroDTO extends UsuarioDTO{

    //public Pacote pacote;
    public ContaUsuarioDTO contaUsuario;
    public String dadosMedicos;
    
            
    public PassageiroDTO(/*Pacote pacote,*/ ContaUsuarioDTO contaUsuario, String cpf, String nome, String dataNascimento, String email, String senha, String sexo, String estadoCivil, String dadosMedicos, String rg, String telefone, String foto){
        super(cpf, rg, nome, dataNascimento, email, senha, telefone, sexo, estadoCivil, foto); 
        // this.pacote = pacote;
         this.contaUsuario = contaUsuario;
        this.dadosMedicos = dadosMedicos;
    }

    public PassageiroDTO() {
        super("", "", "", "", "", "" , "", "", "", "");
        this.contaUsuario = null;
        this.dadosMedicos = "";
        
    }
  public String getDadosMedicos() {
        return this.dadosMedicos;                                          
}
  public void setDadosMedicos(String dadoNovo){
        this.dadosMedicos = dadoNovo;
}


}
