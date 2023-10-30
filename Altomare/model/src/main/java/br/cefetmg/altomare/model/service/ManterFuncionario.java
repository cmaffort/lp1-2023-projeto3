
package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.model.dao.IFuncionarioDAO;
import br.cefetmg.altomare.model.dao.FuncionarioDAO;
import br.cefetmg.altomare.model.dto.Funcionario;
import br.cefetmg.altomare.service.IManterFuncionario;
import br.cefetmg.altomare.model.exception.NegocioException;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import java.util.List;

public class ManterFuncionario implements IManterFuncionario{
     private IFuncionarioDAO funcionarioDAO;
     
     public ManterFuncionario(){
         funcionarioDAO = new FuncionarioDAO();
     }

     @Override
     public long cadastrar(Funcionario funcionario) throws PersistenciaException, NegocioException{
         
         
         if((funcionario.getNome() == null) || (funcionario.getNome().isEmpty()))
              throw new NegocioException("Por favor informe o nome do funcionário.");
         
         if((Long.toString(funcionario.getCpf()).isEmpty()))
             throw new NegocioException("Por favor informe o CPF do funcionário.");
         
         if((Long.toString(funcionario.getRg()).isEmpty()))
             throw new NegocioException("Por favor informe o RG do funcionário.");
         
         if((funcionario.getDataNascimento() == null) || (funcionario.getDataNascimento().isEmpty()))
             throw new NegocioException("Por favor informe a data de nascimento do funcionário.");
         
         if((funcionario.getEmail() == null) || (funcionario.getEmail().isEmpty()))
             throw new NegocioException("Por favor informe o e-mail do funcionário.");
         
       if((Long.toString(funcionario.getTelefone()).isEmpty()))
             throw new NegocioException("Por favor informe um telefone do funcionário.");
         
        if((funcionario.getSexo() == null) || (funcionario.getSexo().isEmpty()))
             throw new NegocioException("Por favor informe o sexo do funcionário.");
         
        if((funcionario.getEstadoCivil() == null) || (funcionario.getEstadoCivil().isEmpty()))
             throw new NegocioException("Por favor informe o estado civil do funcionário.");
         
        if((funcionario.getPassaporte() == null) || (funcionario.getPassaporte().isEmpty()))
             throw new NegocioException("Por favor informe o passaporte do funcionário.");
         
        if((Long.toString(funcionario.getCep()).isEmpty()))
             throw new NegocioException("Por favor informe o CEP do funcionário.");
         
        if((funcionario.getPassaporte() == null) || (funcionario.getPassaporte().isEmpty()))
             throw new NegocioException("Por favor informe o passaporte do funcionário.");
         
        if((funcionario.getSetor() == null) || (funcionario.getSetor().isEmpty()))
             throw new NegocioException("Por favor informe o setor do funcionário.");
        
        if((funcionario.getDataAdmissao() == null) || (funcionario.getDataAdmissao().isEmpty()))
             throw new NegocioException("Por favor informe a data de admissão do funcionário.");
         
        if((funcionario.getTurno() == null) || (funcionario.getTurno().isEmpty()))
             throw new NegocioException("Por favor informe o turno do funcionário.");
         
         long result = funcionarioDAO.inserir(funcionario);
         return result;
         
     }
     
     @Override
     public boolean alterar(Funcionario funcionario) throws PersistenciaException, NegocioException{
         if((funcionario.getNome() == null) || funcionario.getNome().isEmpty())
               throw new NegocioException("Obrigatório infomar o nome.");
          if((Long.toString(funcionario.getCpf()).isEmpty()))
             throw new NegocioException("Por favor informe o CPF do funcionário.");
         
         if((Long.toString(funcionario.getRg()).isEmpty()))
             throw new NegocioException("Por favor informe o RG do funcionário.");
         
         if((funcionario.getDataNascimento() == null) || (funcionario.getDataNascimento().isEmpty()))
             throw new NegocioException("Por favor informe a data de nascimento do funcionário.");
         
         if((funcionario.getEmail() == null) || (funcionario.getEmail().isEmpty()))
             throw new NegocioException("Por favor informe o e-mail do funcionário.");
         
       if((Long.toString(funcionario.getTelefone()).isEmpty()))
             throw new NegocioException("Por favor informe um telefone do funcionário.");
         
        if((funcionario.getSexo() == null) || (funcionario.getSexo().isEmpty()))
             throw new NegocioException("Por favor informe o sexo do funcionário.");
         
        if((funcionario.getEstadoCivil() == null) || (funcionario.getEstadoCivil().isEmpty()))
             throw new NegocioException("Por favor informe o estado civil do funcionário.");
         
        if((funcionario.getPassaporte() == null) || (funcionario.getPassaporte().isEmpty()))
             throw new NegocioException("Por favor informe o passaporte do funcionário.");
         
        if((Long.toString(funcionario.getCep()).isEmpty()))
             throw new NegocioException("Por favor informe o CEP do funcionário.");
         
        if((funcionario.getPassaporte() == null) || (funcionario.getPassaporte().isEmpty()))
             throw new NegocioException("Por favor informe o passaporte do funcionário.");
         
        if((funcionario.getSetor() == null) || (funcionario.getSetor().isEmpty()))
             throw new NegocioException("Por favor informe o setor do funcionário.");
        
        if((funcionario.getDataAdmissao() == null) || (funcionario.getDataAdmissao().isEmpty()))
             throw new NegocioException("Por favor informe a data de admissão do funcionário.");
         
        if((funcionario.getTurno() == null) || (funcionario.getTurno().isEmpty()))
             throw new NegocioException("Por favor informe o turno do funcionário.");
     
        boolean result = funcionarioDAO.atualizar(funcionario);
        return result;
     }
     
     @Override
     public boolean excluir(Funcionario funcionario) throws PersistenciaException, NegocioException{
         
         boolean result = funcionarioDAO.delete(funcionario);
         return result;
     }
     
     @Override
     public List<Funcionario> pesquisarTodos() throws PersistenciaException{
         List<Funcionario> result = funcionarioDAO.listarTodos();
         return result;
     }
     
     @Override
     public Funcionario pesquisarPorId(long cpf) throws PersistenciaException{
         Funcionario result = funcionarioDAO.consultarPorId(cpf);
         return result;
     }
     
     @Override
     public Funcionario getUserLogin(String cpf, String senha) throws PersistenciaException, NegocioException{
         Funcionario result = funcionarioDAO.consultarPorUsuarioSenha(cpf, senha);
         return result;
     }
}
       
