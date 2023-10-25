package br.cefetmg.altomare.dao;

import br.cefetmg.altomare.dao.exception.IException;
import br.cefetmg.altomare.dto.FuncionarioDTO;
import java.util.ArrayList;


public interface IFuncionarioDAO {
     long inserir(Funcionario funcionario) throws IException;
     boolean atualizar(Funcionario funcionario) throws IException;
     boolean deletar(Funcionario funcionario) throws IException;
     ArrayList<Funcionario> listar() throws IException;
     Funcionario consultarPorId(String id) throws IException;
     Funcionario consultarUsuarioSenha(String cpf, String senha) throws IException;
}
