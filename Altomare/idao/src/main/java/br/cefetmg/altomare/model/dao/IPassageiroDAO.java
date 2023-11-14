package br.cefetmg.altomare.model.dao;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import java.util.ArrayList;

public interface IPassageiroDAO{
    public boolean InserirDadosPassageiro(PassageiroDTO passageiro)throws PersistenciaException;
    public String gerarSenha();
    public void delete(String Cpf)throws PersistenciaException;
    public PassageiroDTO ProcurarPassageiro(String Cpf)throws PersistenciaException;
    public ArrayList<PassageiroDTO> listarTodos() throws PersistenciaException;
}
