
package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.IFuncionarioDAO;
import br.cefetmg.altomare.model.dao.FuncionarioDAO;
import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.exception.NegocioException;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import java.sql.SQLException;
import java.util.List;

public class ManterFuncionario implements IManterFuncionario{
    final IFuncionarioDAO funcionarioDAO;
    
    public ManterFuncionario() throws SQLException, ClassNotFoundException {
        funcionarioDAO = new FuncionarioDAO();
    }
     @Override
     public long cadastrar(FuncionarioDTO funcionario) throws PersistenciaException, NegocioException{
         
         
         if((funcionario.getNome() == null) || (funcionario.getNome().isEmpty()))
              throw new NegocioException("Por favor informe o nome do funcionário.");
         
          if((funcionario.getCpf() == null) || (funcionario.getCpf().isEmpty()))
             throw new NegocioException("Por favor informe o CPF do funcionário.");
         
          if((funcionario.getRg() == null) || (funcionario.getRg().isEmpty()))
             throw new NegocioException("Por favor informe o RG do funcionário.");
         
         if((funcionario.getDataNascimento() == null) || (funcionario.getDataNascimento().isEmpty()))
             throw new NegocioException("Por favor informe a data de nascimento do funcionário.");
         
         if((funcionario.getEmail() == null) || (funcionario.getEmail().isEmpty()))
             throw new NegocioException("Por favor informe o e-mail do funcionário.");
         
        if((funcionario.getTelefone() == null) || (funcionario.getTelefone().isEmpty()))
             throw new NegocioException("Por favor informe um telefone do funcionário.");
         
        if((funcionario.getSexo() == null) || (funcionario.getSexo().isEmpty()))
             throw new NegocioException("Por favor informe o sexo do funcionário.");
         
        if((funcionario.getEstadoCivil() == null) || (funcionario.getEstadoCivil().isEmpty()))
             throw new NegocioException("Por favor informe o estado civil do funcionário.");
        if((funcionario.getSetor() == null) || (funcionario.getSetor().isEmpty()))
             throw new NegocioException("Por favor informe o setor do funcionário.");
        
        if((funcionario.getDataAdmissao() == null) || (funcionario.getDataAdmissao().isEmpty()))
             throw new NegocioException("Por favor informe a data de admissão do funcionário.");
         
        if((funcionario.getTurno() == null) || (funcionario.getTurno().isEmpty()))
             throw new NegocioException("Por favor informe o turno do funcionário.");
         
         funcionarioDAO.inserir(funcionario);
         return 1;
         
     }
     
     @Override
     public boolean alterar(FuncionarioDTO funcionario) throws PersistenciaException, NegocioException{
         if((funcionario.getNome() == null) || funcionario.getNome().isEmpty())
               throw new NegocioException("Obrigatório infomar o nome.");
           if((funcionario.getCpf() == null) || (funcionario.getCpf().isEmpty()))
             throw new NegocioException("Por favor informe o CPF do funcionário.");
         
          if((funcionario.getRg() == null) || (funcionario.getRg().isEmpty()))
             throw new NegocioException("Por favor informe o RG do funcionário.");
         
         if((funcionario.getDataNascimento() == null) || (funcionario.getDataNascimento().isEmpty()))
             throw new NegocioException("Por favor informe a data de nascimento do funcionário.");
         
         if((funcionario.getEmail() == null) || (funcionario.getEmail().isEmpty()))
             throw new NegocioException("Por favor informe o e-mail do funcionário.");
         
        if((funcionario.getTelefone() == null) || (funcionario.getTelefone().isEmpty()))
             throw new NegocioException("Por favor informe um telefone do funcionário.");
         
        if((funcionario.getSexo() == null) || (funcionario.getSexo().isEmpty()))
             throw new NegocioException("Por favor informe o sexo do funcionário.");
         
        if((funcionario.getEstadoCivil() == null) || (funcionario.getEstadoCivil().isEmpty()))
             throw new NegocioException("Por favor informe o estado civil do funcionário.");
         
        if((funcionario.getSetor() == null) || (funcionario.getSetor().isEmpty()))
             throw new NegocioException("Por favor informe o setor do funcionário.");
        
        if((funcionario.getDataAdmissao() == null) || (funcionario.getDataAdmissao().isEmpty()))
             throw new NegocioException("Por favor informe a data de admissão do funcionário.");
         
        if((funcionario.getTurno() == null) || (funcionario.getTurno().isEmpty()))
             throw new NegocioException("Por favor informe o turno do funcionário.");
     
        funcionarioDAO.atualizar(funcionario);
        return true;
     }
     
     @Override
     public boolean excluir(FuncionarioDTO funcionario) throws PersistenciaException, NegocioException{
         
         boolean result = funcionarioDAO.delete(funcionario);
         return result;
     }
     
     @Override
     public List<FuncionarioDTO> pesquisarTodos() throws PersistenciaException{
         List<FuncionarioDTO> result = funcionarioDAO.listarTodos();
         return result;
     }
     
     public FuncionarioDTO pesquisarPorId(String cpf) throws PersistenciaException{
         FuncionarioDTO result = funcionarioDAO.consultarPorId(cpf);
         return result;
     }
     
     @Override
     public FuncionarioDTO getUserLogin(String cpf, String senha) throws PersistenciaException, NegocioException{
         FuncionarioDTO result = funcionarioDAO.consultarPorUsuarioSenha(cpf, senha);
         return result;
     }

    @Override
    public FuncionarioDTO pesquisarPorId(long cpf) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
       
