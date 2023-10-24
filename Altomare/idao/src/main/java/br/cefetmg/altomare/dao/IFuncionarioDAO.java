package br.cefetmg.altomare.dao;

import br.cefetmg.altomare.dto.FuncionarioDTO;
import br.cefetmg.altomare.dao.exception.Exception;
import java.util.ArrayList;


public interface IFuncionarioDAO {
     long inserir(Funcionario funcionario) throws Exception;
     boolean atualizar(Funcionario funcionario) throws Exception;
     boolean deletar(Funcionario funcionario) throws Exception;
     ArrayList<Funcionario> listar() throws Exception;
     Funcionario consultarPorId(String id) throws Exception;
     Funcionario consultarUsuarioSenha(String cpf, String senha) throws Exception;
}
