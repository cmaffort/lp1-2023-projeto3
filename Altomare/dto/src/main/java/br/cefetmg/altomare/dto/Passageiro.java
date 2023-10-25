package br.cefetmg.altomare.dto;


public class Passageiro extends Usuario{

    private Pacote pacote;
    private Despesas despesa;
            
    public Passageiros(Pacote pacote, Despesas despesa, String cpf, long rg, String nome, String dataNascimento, String email, String senha, long telefone, String sexo, String estadoCivil){
        super(cpf, rg, nome, dataNascimento, email, senha, telefone, sexo, estadoCivil);
         this.pacote = pacote;
         this.despesa = despesa;
    }
}