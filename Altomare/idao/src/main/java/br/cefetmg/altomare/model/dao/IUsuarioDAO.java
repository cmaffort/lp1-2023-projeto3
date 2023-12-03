
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.UsuarioDTO;
import java.sql.SQLException;


public interface IUsuarioDAO {
     UsuarioDTO consultarPorId(String cpf) throws PersistenciaException, SQLException, ClassNotFoundException;
}
