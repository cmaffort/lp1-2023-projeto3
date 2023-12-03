
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.dao.connection.ConexaoDB;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import br.cefetmg.altomare.model.dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;

public class UsuarioDAO implements IUsuarioDAO{
    Connection connection;

    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        this.connection = ConexaoDB.inicializaDB();
    }

    @Override
    public UsuarioDTO consultarPorId(String cpf) throws PersistenciaException, SQLException, ClassNotFoundException {
        UsuarioDTO usuario = new UsuarioDTO();
        try{
           IPassageiroDAO passageiro = new PassageiroDAO();
           IFuncionarioDAO funcionario = new FuncionarioDAO();
           if(passageiro.ProcurarPassageiro(cpf) == null){
             usuario = funcionario.consultarPorId(cpf);
           }else{
               usuario = passageiro.ProcurarPassageiro(cpf);
           }
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }

        return usuario;
    }

}
