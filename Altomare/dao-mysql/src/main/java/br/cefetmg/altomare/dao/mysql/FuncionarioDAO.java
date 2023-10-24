/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dao.mysql;

import br.cefetmg.altomare.dto.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
        private Connection connection;

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirFuncionario(FuncionarioDTO funcionario) throws SQLException {
        String sql = "INSERT INTO produtos (nome, DataNasc, CPF, RG, Sexo, Email, EstadoCivil, Turno, Setor, DataAdmissao, Telefone, Passaporte, id ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getDataNascimento());
            statement.setString(3, funcionario.getCpf());
            statement.setString(4, funcionario.getRg());
            statement.setString(4, funcionario.getSexo());
            statement.setString(4, funcionario.getEmail());
            statement.setString(4, funcionario.getEstadoCivil());
            statement.setString(4, funcionario.getTurno());
            statement.setString(4, funcionario.getSetor());
            statement.setString(4, funcionario.getDataAdmissao());
            statement.setString(4, funcionario.getTelefone());
            statement.setString(4, funcionario.getPassaporte());
            statement.setString(4, funcionario.getId());
            statement.executeUpdate();
        }
    }

    public void atualizarFuncionario(FuncionarioDTO funcionario) throws SQLException {
        String sql = "UPDATE produtos SET nome = ?, DataNasc = ?, CPF = ?, RG = ?, Sexo = ? , Email = ?, EstadoCivil = ?, Turno = ? , Setor = ?, DataAdmissao = ?, Telefone = ? , Passaporte = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getDataNascimento());
            statement.setString(3, funcionario.getCpf());
            statement.setString(4, funcionario.getRg());
            statement.setString(5,  funcionario.getSexo());
            statement.setString(5,  funcionario.getEmail());
            statement.setString(5,  funcionario.getEstadoCivil());
            statement.setString(5,  funcionario.getTurno());
            statement.setString(5,  funcionario.getSetor());
            statement.setString(5,  funcionario.getDataAdmissao());
            statement.setString(5,  funcionario.getTelefone());
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

    public List<FuncionarioDTO> listarProdutos() throws SQLException {
        List<FuncionarioDTO> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                FuncionarioDTO funcionario;
                funcionario.setNome(resultSet.getString("Nome"));
                funcionario.setDataNascimento(resultSet.getString("DataNasc"));
                funcionario.setCpf(resultSet.getString("CPF"));
                funcionario.setRg(resultSet.getDouble("RG"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setEmail(resultSet.getString("Email"));
                funcionario.setEstadoCivil(resultSet.getString("EstadoCivil"));
                funcionario.setTurno(resultSet.getString("Turno"));
                funcionario.setSetor(resultSet.getString("Setor"));
                funcionario.setDataAdmissao(resultSet.getString("DataAdmissao"));
                funcionario.setTelefone(resultSet.getString("Telefone"));
                funcionario.setPassaporte(resultSet.getString("Passaporte"));
                funcionario.add(funcionario);
            }
        }
        return funcionarios;
    }
    
    
    FuncionarioDTO consultarPorId(String id) throws SQLException{
        FuncionarioDTO funcionario = new FuncionarioDTO();
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            FuncionarioDTO funcionario = new FuncionarioDTO();
                funcionario.setNome(resultSet.getString("Nome"));
                funcionario.setDataNascimento(resultSet.getString("DataNasc"));
                funcionario.setCpf(resultSet.getString("CPF"));
                funcionario.setRg(resultSet.getDouble("RG"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setEmail(resultSet.getString("Email"));
                funcionario.setEstadoCivil(resultSet.getString("EstadoCivil"));
                funcionario.setTurno(resultSet.getString("Turno"));
                funcionario.setSetor(resultSet.getString("Setor"));
                funcionario.setDataAdmissao(resultSet.getString("DataAdmissao"));
                funcionario.setTelefone(resultSet.getString("Telefone"));
                funcionario.setPassaporte(resultSet.getString("Passaporte"));
                funcionario.add(funcionario);
        }
    }
    return funcionario;
}


