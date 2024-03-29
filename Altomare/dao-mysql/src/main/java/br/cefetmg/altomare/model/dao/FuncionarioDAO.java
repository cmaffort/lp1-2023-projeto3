package br.cefetmg.altomare.model.dao;

import br.cefetmg.altomare.model.dto.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FuncionarioDAO implements IFuncionarioDAO {

    Connection connection;

    public FuncionarioDAO() throws SQLException, ClassNotFoundException {
        this.connection = ConexaoDB.inicializaDB();
    }

    @Override
    public void inserir(FuncionarioDTO funcionario) throws PersistenciaException {
        String sql = "INSERT INTO funcionarios (Nome, DatNasc, CPF, RG, Sexo, Email, EstadoCivil, Turno, Setor, DataAdmissao, Telefone, Foto, Senha) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        funcionario.setSenha(gerarSenha());
        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getDataNascimento());
            statement.setString(3, funcionario.getCpf());
            statement.setString(4, funcionario.getRg());
            statement.setString(5, funcionario.getSexo());
            statement.setString(6, funcionario.getEmail());
            statement.setString(7, funcionario.getEstadoCivil());
            statement.setString(8, funcionario.getTurno());
            statement.setString(9, funcionario.getSetor());
            statement.setString(10, funcionario.getDataAdmissao());
            statement.setString(11, funcionario.getTelefone());
            statement.setString(12, funcionario.getFoto());
            statement.setString(13, funcionario.getSenha());
            statement.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
    }
    
     @Override
    public String gerarSenha(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        return IntStream.range(0, 8)
                .map(i -> random.nextInt(chars.length()))
                .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
                .collect(Collectors.joining());
    }

    @Override
    public boolean atualizar(FuncionarioDTO funcionario) throws PersistenciaException {
        String sql = "UPDATE funcionarios SET nome = ?, DatNasc = ?, CPF = ?, RG = ?, Sexo = ?, Email = ?, EstadoCivil = ?, Turno = ?, Setor = ?, DataAdmissao = ?, Telefone = ?, Foto = ?, Senha = ? WHERE CPF = ?";
        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getDataNascimento());
            statement.setString(3, funcionario.getCpf());
            statement.setString(4, funcionario.getRg());
            statement.setString(5, funcionario.getSexo());
            statement.setString(6, funcionario.getEmail());
            statement.setString(7, funcionario.getEstadoCivil());
            statement.setString(8, funcionario.getTurno());
            statement.setString(9, funcionario.getSetor());
            statement.setString(10, funcionario.getDataAdmissao());
            statement.setString(11, funcionario.getTelefone());
            statement.setString(12, funcionario.getFoto());
            statement.setString(13, funcionario.getSenha());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
        return consultarPorId(funcionario.getCpf()) != null;
    }

    @Override
    public boolean delete(FuncionarioDTO funcionario) throws PersistenciaException {
        String sql = "DELETE FROM funcionarios WHERE CPF = ?";
        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(3, funcionario.getCpf());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public ArrayList<FuncionarioDTO> listarTodos() throws PersistenciaException {
        ArrayList<FuncionarioDTO> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios";
        try ( PreparedStatement statement = connection.prepareStatement(sql);  ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                FuncionarioDTO funcionario = new FuncionarioDTO();
                funcionario.setNome(resultSet.getString("Nome"));
                funcionario.setDataNascimento(resultSet.getString("DatNasc"));
                funcionario.setCpf(resultSet.getString("CPF"));
                funcionario.setRg(resultSet.getString("RG"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setEmail(resultSet.getString("Email"));
                funcionario.setEstadoCivil(resultSet.getString("EstadoCivil"));
                funcionario.setTurno(resultSet.getString("Turno"));
                funcionario.setSetor(resultSet.getString("Setor"));
                funcionario.setDataAdmissao(resultSet.getString("DataAdmissao"));
                funcionario.setTelefone(resultSet.getString("Telefone"));
                funcionario.setSenha(resultSet.getString("Senha"));
                funcionarios.add(funcionario);
            }

        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
        return funcionarios;
    }

    @Override
    public FuncionarioDTO consultarPorId(String cpf) throws PersistenciaException {
        FuncionarioDTO funcionario =  new FuncionarioDTO();
        String sql = "SELECT * FROM funcionarios WHERE CPF = ?";
        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(3, cpf);
                statement.execute();
                ResultSet resultSet = statement.executeQuery();
               if(resultSet.next()){
                funcionario.setNome(resultSet.getString("Nome"));
                funcionario.setDataNascimento(resultSet.getString("DatNasc"));
                funcionario.setCpf(resultSet.getString("CPF"));
                funcionario.setRg(resultSet.getString("RG"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setEmail(resultSet.getString("Email"));
                funcionario.setEstadoCivil(resultSet.getString("EstadoCivil"));
                funcionario.setTurno(resultSet.getString("Turno"));
                funcionario.setSetor(resultSet.getString("Setor"));
                funcionario.setDataAdmissao(resultSet.getString("DataAdmissao"));
                funcionario.setTelefone(resultSet.getString("Telefone"));
                funcionario.setSenha(resultSet.getString("Senha"));
               }
        } catch (SQLException u) {    
            throw new RuntimeException(u);    
        }
        return funcionario;
    }

    @Override
    public FuncionarioDTO consultarPorUsuarioSenha(String cpf, String senha) throws PersistenciaException {
        FuncionarioDTO funcionario = new FuncionarioDTO();
        String sql = "SELECT * FROM funcionarios WHERE CPF = ? AND Senha = ?";
        try ( PreparedStatement statement = connection.prepareStatement(sql);  ResultSet resultSet = statement.executeQuery()) {
            statement.setString(3, funcionario.getCpf());
            statement.setString(13, funcionario.getSenha());
            funcionario.setNome(resultSet.getString("Nome"));
            funcionario.setDataNascimento(resultSet.getString("DatNasc"));
            funcionario.setCpf(resultSet.getString("CPF"));
            funcionario.setRg(resultSet.getString("RG"));
            funcionario.setSexo(resultSet.getString("Sexo"));
            funcionario.setEmail(resultSet.getString("Email"));
            funcionario.setEstadoCivil(resultSet.getString("EstadoCivil"));
            funcionario.setTurno(resultSet.getString("Turno"));
            funcionario.setSetor(resultSet.getString("Setor"));
            funcionario.setDataAdmissao(resultSet.getString("DataAdmissao"));
            funcionario.setTelefone(resultSet.getString("Telefone"));
            funcionario.setSenha(resultSet.getString("Senha"));
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
        return funcionario;
    }

}
