package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.dto.FuncionarioDTO;
import br.cefetmg.altomare.model.exception.NException;
import br.cefetmg.altomare.dao.exception.ExceptionI;
import java.util.List;

public interface IManterFuncionario {
    public long cadastrar(FuncionarioDTO funcioinario) throws NException;
    public boolean alterar(FuncionarioDTO funcioinario) throws NException;
    public boolean excluir(FuncionarioDTO funcioinario) throws NException;
    public List<FuncionarioDTO> PesquisarTodos() throws ExceptionI;
    public FuncionarioDTO pesquisarPorId(String id) throws ExceptionI;
    public long getFuncionarioLogin(String cpf, String senha) throws ExceptionI;
}
