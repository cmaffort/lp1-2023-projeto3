

package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.IPassageiroDAO;
import br.cefetmg.altomare.model.dao.PassageiroDAO;
import br.cefetmg.altomare.model.exception.NegocioException;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import java.sql.SQLException;
import java.util.List;

public class ManterPassageiro implements IManterPassageiro{
    final IPassageiroDAO passageiroDAO;
    
    public ManterPassageiro() throws SQLException, ClassNotFoundException {
        passageiroDAO = new PassageiroDAO();
    }
     @Override
    public long cadastrar(PassageiroDTO passageiro) throws PersistenciaException, NegocioException{
         if((passageiro.getNome() == null) || (passageiro.getNome().isEmpty()))
              throw new NegocioException("Por favor informe o nome do passageiro.");
         
          if((passageiro.getCpf() == null) || (passageiro.getCpf().isEmpty()))
             throw new NegocioException("Por favor informe o CPF do passageiro.");
         
          if((passageiro.getRg() == null) || (passageiro.getRg().isEmpty()))
             throw new NegocioException("Por favor informe o RG do passageiro.");
         
         if((passageiro.getDataNascimento() == null) || (passageiro.getDataNascimento().isEmpty()))
             throw new NegocioException("Por favor informe a data de nascimento do passageiro.");
         
         if((passageiro.getEmail() == null) || (passageiro.getEmail().isEmpty()))
             throw new NegocioException("Por favor informe o e-mail do passageiro.");
         
        if((passageiro.getTelefone() == null) || (passageiro.getTelefone().isEmpty()))
             throw new NegocioException("Por favor informe um telefone do passageiro.");
         
        if((passageiro.getSexo() == null) || (passageiro.getSexo().isEmpty()))
             throw new NegocioException("Por favor informe o sexo do passageiro.");
         
        if((passageiro.getEstadoCivil() == null) || (passageiro.getEstadoCivil().isEmpty()))
             throw new NegocioException("Por favor informe o estado civil do passageiro.");
        
        if((passageiro.getDadosMedicos()== null) || (passageiro.getDadosMedicos().isEmpty()))
             throw new NegocioException("Por favor informe os dados médicos do passageiro.");
         
         passageiroDAO.InserirDadosPassageiro(passageiro);
         return 1;
    }
    
    @Override
    public boolean alterar(PassageiroDTO passageiro) throws PersistenciaException, NegocioException{
        if((passageiro.getNome() == null) || (passageiro.getNome().isEmpty()))
              throw new NegocioException("Por favor informe o nome do passageiro.");
         
          if((passageiro.getCpf() == null) || (passageiro.getCpf().isEmpty()))
             throw new NegocioException("Por favor informe o CPF do passageiro.");
         
          if((passageiro.getRg() == null) || (passageiro.getRg().isEmpty()))
             throw new NegocioException("Por favor informe o RG do passageiro.");
         
         if((passageiro.getDataNascimento() == null) || (passageiro.getDataNascimento().isEmpty()))
             throw new NegocioException("Por favor informe a data de nascimento do passageiro.");
         
         if((passageiro.getEmail() == null) || (passageiro.getEmail().isEmpty()))
             throw new NegocioException("Por favor informe o e-mail do passageiro.");
         
        if((passageiro.getTelefone() == null) || (passageiro.getTelefone().isEmpty()))
             throw new NegocioException("Por favor informe um telefone do passageiro.");
         
        if((passageiro.getSexo() == null) || (passageiro.getSexo().isEmpty()))
             throw new NegocioException("Por favor informe o sexo do passageiro.");
         
        if((passageiro.getEstadoCivil() == null) || (passageiro.getEstadoCivil().isEmpty()))
             throw new NegocioException("Por favor informe o estado civil do passageiro.");
        
        if((passageiro.getDadosMedicos()== null) || (passageiro.getDadosMedicos().isEmpty()))
             throw new NegocioException("Por favor informe os dados médicos do passageiro.");
         
         passageiroDAO.InserirDadosPassageiro(passageiro);
         return true;
    }
    
    @Override
    public boolean excluir(PassageiroDTO passageiro) throws PersistenciaException, NegocioException{
         boolean result = passageiroDAO.delete(passageiro.getCpf());
         return result;
    }
    
    @Override
    public List<PassageiroDTO> pesquisarTodos() throws PersistenciaException{
        List<PassageiroDTO> result = passageiroDAO.listarTodos();
        return result;
    }
    
    @Override
    public PassageiroDTO pesquisarPorId(String cpf) throws PersistenciaException{
        PassageiroDTO result = passageiroDAO.ProcurarPassageiro(cpf);
         return result;
    }
    
    @Override
    public PassageiroDTO getUserLogin(String cpf, String senha) throws PersistenciaException, NegocioException{
        PassageiroDTO result = passageiroDAO.consultarPorUsuarioSenha(cpf, senha);
         return result;
    }
}

