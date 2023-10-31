package br.cefetmg.altomare.model.dao;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import java.sql.SQLException;

public interface IPassageiroDAO{
    public boolean InserirDadosPassageiro(Passageiro passageiro);
    public Passageiro ExibirCliente(String cpf);
    public String gerarSenha();
    public void delete(String Cpf)throws SQLException;
    public Passageiro ProcurarPassageiro(String Cpf);
}
