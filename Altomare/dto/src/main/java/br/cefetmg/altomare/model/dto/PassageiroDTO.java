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

    public PassageiroDTO(ContaUsuarioDTO contaUsuarioDTO, long cpfLong, String nome, String dataNascimento, String email, String senha, String sexo, String civil, String medico, long rgLong, long telefoneLong, String passaporte, long cepLong) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  public String getDadosMedicos() {
        return this.dadosMedicos;                                          
}
  public void setDadosMedicos(String dadoNovo){
        this.dadosMedicos = dadoNovo;
}


}
