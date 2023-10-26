
package br.cefetmg.altomare.dao.mysql;

import br.cefetmg.altomare.dto.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;


public class FuncionarioDAO {
     final Connection connection;

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirFuncionario(FuncionarioDTO funcionario) throws SQLException {
        String sql = "INSERT INTO produtos (nome, DataNasc, CPF, RG, Sexo, Email, EstadoCivil, Turno, Setor, DataAdmissao, Telefone, Passaporte, id ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getDataNascimento());
            statement.setString(3, funcionario.getCpf());
            statement.setLong(4, funcionario.getRg());
            statement.setString(4, funcionario.getSexo());
            statement.setString(4, funcionario.getEmail());
            statement.setString(4, funcionario.getEstadoCivil());
            statement.setString(4, funcionario.getTurno());
            statement.setString(4, funcionario.getSetor());
            statement.setString(4, funcionario.getDataAdmissao());
            statement.setLong(4, funcionario.getTelefone());
            statement.setString(4, funcionario.getPassaporte());
            statement.executeUpdate();
        }
    }

    public void atualizarFuncionario(FuncionarioDTO funcionario) throws SQLException {
        String sql = "UPDATE produtos SET nome = ?, DataNasc = ?, CPF = ?, RG = ?, Sexo = ? , Email = ?, EstadoCivil = ?, Turno = ? , Setor = ?, DataAdmissao = ?, Telefone = ? , Passaporte = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getDataNascimento());
            statement.setString(3, funcionario.getCpf());
            statement.setLong(4, funcionario.getRg());
            statement.setString(5,  funcionario.getSexo());
            statement.setString(5,  funcionario.getEmail());
            statement.setString(5,  funcionario.getEstadoCivil());
            statement.setString(5,  funcionario.getTurno());
            statement.setString(5,  funcionario.getSetor());
            statement.setString(5,  funcionario.getDataAdmissao());
            statement.setLong(5,  funcionario.getTelefone());
            statement.setString(5,  funcionario.getPassaporte());
            
            
            statement.executeUpdate();
        }
    }

    public void excluirFuncionario(int funcionarioId) throws SQLException {
        String sql = "DELETE FROM produtos WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, funcionarioId);
            statement.executeUpdate();
        }
    }
}

  
    
 


