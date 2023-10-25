package br.cefetmg.altomare.model.service;

import br.cefetmg.altomare.dto.FuncionaroDTO;
import br.cefetmg.altomare.model.exception.NException;
import br.cefetmg.altomare.dao.exception.Exception;
impoert java.util.list;

public interface IManterFuncionario {
    public long cadastrar(FuncionarioDTO funcioinario) throws Exception;
    public boolean alterar(FuncionarioDTO funcioinario) throws Exception;
    public boolean excluir(FuncionarioDTO funcioinario) throws Exception;
    public List<FuncionarioDTO> PesquisarTodos() throws Exception;
    public Funcionario pesquisarPorId(String id) throws Exception;
    public long getFuncionarioLogin(String cpf, String senha) throws Exception;
}
