
package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.cefetmg.altomare.dao.connection.ConexaoDB;

public class FuncionarioDAO {
    Connection connection;
    
    public FuncionarioDAO() throws SQLException,  ClassNotFoundException{
        this.connection = ConexaoDB.inicializaDB();
    }

    
    public void  inserir(FuncionarioDTO funcionario) throws SQLException{
        String sql = "INSERT INTO funcionarios (Nome, DataNas, CPF, RG, Sexo, Email, EstadoCivil, Turno, Setor, DataAdmissao, Telefone, Passaporte, CEP) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getDataNascimento());
            statement.setLong(3, funcionario.getCpf());
            statement.setLong(4, funcionario.getRg());
            statement.setString(5, funcionario.getSexo());
            statement.setString(6, funcionario.getEmail());
            statement.setString(7, funcionario.getEstadoCivil());
            statement.setString(8, funcionario.getTurno());
            statement.setString(9, funcionario.getSetor());
            statement.setString(10, funcionario.getDataAdmissao());
            statement.setLong(11, funcionario.getTelefone());
            statement.setString(12, funcionario.getPassaporte());
            statement.setLong(13, funcionario.getCep());
            statement.executeUpdate();
        }
    }
    
    public void atualizar(FuncionarioDTO funcionario) throws SQLException{
        String sql = "UPDATE funcionarios SET nome = ?, DataNas = ?, CPF = ?, RG = ?, Sexo = ?, Email = ?, EstadoCivil = ?, Turno = ?, Setor = ?, DataAdmissao = ?, Telefone = ?, Passaporte = ?, CEP = ? WHERE CPF = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getDataNascimento());
            statement.setLong(3, funcionario.getCpf());
            statement.setLong(4, funcionario.getRg());
            statement.setString(5, funcionario.getSexo());
            statement.setString(6, funcionario.getEmail());
            statement.setString(7, funcionario.getEstadoCivil());
            statement.setString(8, funcionario.getTurno());
            statement.setString(9, funcionario.getSetor());
            statement.setString(10, funcionario.getDataAdmissao());
            statement.setLong(11, funcionario.getTelefone());
            statement.setString(12, funcionario.getPassaporte());
            statement.setLong(13, funcionario.getCep());
            statement.executeUpdate();
        }
    }
    
    public void delete(long funcionarioCpf) throws SQLException{
        String sql = "DELETE FROM funcionarios WHERE CPF = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setLong(3, funcionarioCpf);
            statement.executeUpdate();
        }
    }
    
    
    public ArrayList<FuncionarioDTO> listarTodos() throws SQLException{
        ArrayList<FuncionarioDTO> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios";
        try(PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()){
            while(resultSet.next()){
                FuncionarioDTO funcionario = new FuncionarioDTO();
                funcionario.setNome(resultSet.getString("Nome"));
                funcionario.setDataNascimento(resultSet.getString("DataNasc"));
                funcionario.setCpf(resultSet.getLong("CPF"));
                funcionario.setRg(resultSet.getLong("RG"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setEmail(resultSet.getString("Email"));
                funcionario.setEstadoCivil(resultSet.getString("EstadoCivil"));
                funcionario.setTurno(resultSet.getString("Turno"));
                funcionario.setSetor(resultSet.getString("Setor"));
                funcionario.setDataAdmissao(resultSet.getString("DataAdmissao"));
                funcionario.setTelefone(resultSet.getLong("Telefone"));
                funcionario.setPassaporte(resultSet.getString("Passaporte"));
                funcionario.setCep(resultSet.getLong("CEP"));
                funcionarios.add(funcionario);
            }
            return funcionarios;
        }
    }
    
    public FuncionarioDTO consultarPorId(long cpf) throws SQLException{
         FuncionarioDTO funcionario = new FuncionarioDTO();
         String sql = "SELECT * FROM funcionarios WHERE CPF = ?";
             
          try(PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()){  
                funcionario.setNome(resultSet.getString("Nome"));
                funcionario.setDataNascimento(resultSet.getString("DataNasc"));
                funcionario.setCpf(resultSet.getLong("CPF"));
                funcionario.setRg(resultSet.getLong("RG"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setEmail(resultSet.getString("Email"));
                funcionario.setEstadoCivil(resultSet.getString("EstadoCivil"));
                funcionario.setTurno(resultSet.getString("Turno"));
                funcionario.setSetor(resultSet.getString("Setor"));
                funcionario.setDataAdmissao(resultSet.getString("DataAdmissao"));
                funcionario.setTelefone(resultSet.getLong("Telefone"));
                funcionario.setPassaporte(resultSet.getString("Passaporte"));
                funcionario.setCep(resultSet.getLong("CEP"));
         }
          return funcionario;
      }
    
    public FuncionarioDTO consultarPorUsuarioSenha(String cpf, String senha) throws SQLException{
        FuncionarioDTO funcionario = new FuncionarioDTO();
        String sql = "SELECT * FROM funcionarios WHERE Nome = ? AND Senha = ?";
         try(PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()){  
                funcionario.setNome(resultSet.getString("Nome"));
                funcionario.setDataNascimento(resultSet.getString("DataNasc"));
                funcionario.setCpf(resultSet.getLong("CPF"));
                funcionario.setRg(resultSet.getLong("RG"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setEmail(resultSet.getString("Email"));
                funcionario.setEstadoCivil(resultSet.getString("EstadoCivil"));
                funcionario.setTurno(resultSet.getString("Turno"));
                funcionario.setSetor(resultSet.getString("Setor"));
                funcionario.setDataAdmissao(resultSet.getString("DataAdmissao"));
                funcionario.setTelefone(resultSet.getLong("Telefone"));
                funcionario.setPassaporte(resultSet.getString("Passaporte"));
                funcionario.setCep(resultSet.getLong("CEP"));
         }
          return funcionario;
    }
}
