package br.cefetmg.altomare.dao;

import br.cefetmg.altomare.dao.exception.ExceptionI;
import br.cefetmg.altomare.dto.FuncionarioDTO;
import java.util.ArrayList;


public interface IFuncionarioDAO {
     long inserirProduto(FuncionarioDTO funcionario) throws ExceptionI;
     boolean atualizarProduto(FuncionarioDTO funcionario) throws ExceptionI;
     boolean excluirProduto(FuncionarioDTO funcionario) throws ExceptionI;
     ArrayList<FuncionarioDTO> listar() throws ExceptionI;
     FuncionarioDTO consultarPorId(String id) throws ExceptionI;
     FuncionarioDTO consultarUsuarioSenha(String cpf, String senha) throws ExceptionI;
}
