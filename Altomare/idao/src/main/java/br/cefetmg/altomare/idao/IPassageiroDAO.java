
package br.cefetmg.altomare.idao;
import br.cefetmg.altomare.dto.Passageiro;



public interface IPassageiroDAO {
    void InserirDadosPassageiro(Pacote pacote, Despesas despesa, String cpf, long rg, String nome, String dataNascimento, String email, String senha, long telefone, String sexo, String civil, String dadosMedicos);
    Passageiro ExibirCliente(String cpf);
    Passageiro Procurar(String cpf);
    public String gerarSenha();
}
