
package br.cefetmg.altomare.idao;
import br.cefetmg.altomare.dto.Passageiro;



public interface IPassageiroDAO {
    void InserirDadosPassageiro(String nome, String dataNascimento, String sexo, String cpf, String rg,String  civil, String email, String telefone, Pacote pacote, Despesas Despesa);
    Passageiro ExibirCliente(String cpf);
    Passageiro Procurar(String cpf);
}
