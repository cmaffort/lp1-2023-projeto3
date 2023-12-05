package br.cefetmg.altomare.model.dao;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.SegurancaDTO;
import java.util.ArrayList;

public interface ISegurancaDAO {
    public boolean Inserir(SegurancaDTO seguranca)throws PersistenciaException;
    public boolean Deletar(String nome)throws PersistenciaException;
    public ArrayList< SegurancaDTO> listarTodos() throws PersistenciaException;
}
