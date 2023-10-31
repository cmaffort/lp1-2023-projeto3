package br.cefetmg.altomare.model.dto;


public class PassageiroDTO extends Usuario{

    public Pacote pacote;
    public Despesas despesa;
    public String dadosMedicos;
            
    public PassageiroDTO(Pacote pacote, Despesas despesa, String cpf, long rg, String nome, String dataNascimento, String email, String senha, long telefone, String sexo, String estadoCivil, String dadosMedicos){
        super(cpf, rg, nome, dataNascimento, email, senha, telefone, sexo, estadoCivil);
         this.pacote = pacote;
         this.despesa = despesa;
        this.dadosMedicos = dadosMedicos;
    }
  public String getDadosMedicos() {
        return this.dadosMedicos;                                          
}
  public void setDadosMedicos(String dadoNovo){
        this.dadosMedicos = dadoNovo;
}
}
