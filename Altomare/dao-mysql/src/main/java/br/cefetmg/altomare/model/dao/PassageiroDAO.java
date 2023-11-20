package br.cefetmg.altomare.model.dao;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import br.cefetmg.altomare.model.dao.exception.PersistenciaException;
import java.sql.PreparedStatement;
import java.security.SecureRandom;
import java.sql.Connection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import java.sql.*;
import java.util.ArrayList;

public class PassageiroDAO implements IPassageiroDAO{
    
   Connection conexao;
    
    public PassageiroDAO () throws SQLException, ClassNotFoundException {
        conexao = ConexaoDB.inicializaDB();        
    }
    
    @Override
        public boolean InserirDadosPassageiro(PassageiroDTO pass)throws PersistenciaException {
           
            String sql = "INSERT INTO Passageiro(CPF, RG, Nome, DataNasc, Email, Senha, Telefone, Sexo, Civil, DadosMedicos, Foto) VALUES(?,?,?,?,?,?,?,?,?, ?,?)";
            pass.setSenha(gerarSenha());
         
            try (PreparedStatement in = conexao.prepareStatement(sql)) {
               
                in.setString(1, pass.getCpf());
                in.setString(2, pass.getRg());
                in.setString(3, pass.getNome());
                in.setString(4, pass.getDataNascimento());
                in.setString(5, pass.getEmail());
                in.setString(6, pass.getSenha());
                in.setString(7, pass.getTelefone());         
                in.setString(8, pass.getSexo());
                in.setString(9, pass.getEstadoCivil());
                in.setString(10, pass.getDadosMedicos());
                in.setString(11, pass.getFoto());
                
                in.execute();
                in.close(); 
             } 
            catch (SQLException ex) {
                throw new PersistenciaException(ex.getMessage());
            }  
            return true;
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
    public boolean delete(String Cpf)throws PersistenciaException{
        String sql = "DELETE FROM passageiro WHERE CPF = ?";
        try(PreparedStatement in = conexao.prepareStatement(sql)){
            in.setString(1, Cpf);
            in.executeUpdate();
            in.close();
        }
       catch (SQLException ex) {
                throw new PersistenciaException(ex.getMessage());
            }
        return true;
    }
    
    @Override
    public PassageiroDTO ProcurarPassageiro(String cpf) throws PersistenciaException{
        PassageiroDTO pass = new PassageiroDTO();
        String sql = "SELECT * FROM passageiro WHERE CPF = ?";

        try ( PreparedStatement in = conexao.prepareStatement(sql);  ResultSet resultSet = in.executeQuery()){
            pass.setCpf(resultSet.getString("CPF"));
                pass.setRg(resultSet.getString("RG"));
                pass.setNome(resultSet.getString("Nome"));
                pass.setDataNascimento(resultSet.getString("DataNasc"));
                pass.setEmail(resultSet.getString("Email"));
                pass.setSenha(resultSet.getString("Senha"));
                pass.setTelefone(resultSet.getString("Telefone"));
                pass.setSexo(resultSet.getString("Sexo"));
                pass.setEstadoCivil(resultSet.getString("Civil"));
                pass.setDadosMedicos(resultSet.getString("DadosMedicos"));
                
                in.close();
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }

        return pass;
    }
    
    @Override
    public ArrayList<PassageiroDTO> listarTodos() throws PersistenciaException {
        ArrayList<PassageiroDTO> passageiro = new ArrayList<>();
        String sql = "SELECT * FROM passageiro";
        try ( PreparedStatement in = conexao.prepareStatement(sql);  ResultSet resultSet = in.executeQuery()) {
            while (resultSet.next()) {
                PassageiroDTO pass = new PassageiroDTO();
                pass.setCpf(resultSet.getString("CPF"));
                pass.setRg(resultSet.getString("RG"));
                pass.setNome(resultSet.getString("Nome"));
                pass.setDataNascimento(resultSet.getString("DataNasc"));
                pass.setEmail(resultSet.getString("Email"));
                pass.setSenha(resultSet.getString("Senha"));
                pass.setTelefone(resultSet.getString("Telefone"));
                pass.setSexo(resultSet.getString("Sexo"));
                pass.setEstadoCivil(resultSet.getString("Civil"));
                pass.setDadosMedicos(resultSet.getString("DadosMedicos"));
                
                passageiro.add(pass);
               // in.close();
               // resultSet.close();
            }

        } 
        catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
        return passageiro;
    }
    
     @Override
    public PassageiroDTO consultarPorUsuarioSenha(String cpf, String senha) throws PersistenciaException {
        PassageiroDTO pass = new PassageiroDTO();
        String sql = "SELECT * FROM passageiro WHERE CPF = ? AND Senha = ?";
        try ( PreparedStatement statement = conexao.prepareStatement(sql);  ResultSet resultSet = statement.executeQuery()) {
                pass.setCpf(resultSet.getString("CPF"));
                pass.setRg(resultSet.getString("RG"));
                pass.setNome(resultSet.getString("Nome"));
                pass.setDataNascimento(resultSet.getString("DataNasc"));
                pass.setEmail(resultSet.getString("Email"));
                pass.setSenha(resultSet.getString("Senha"));
                pass.setTelefone(resultSet.getString("Telefone"));
                pass.setSexo(resultSet.getString("Sexo"));
                pass.setEstadoCivil(resultSet.getString("Civil"));
                pass.setDadosMedicos(resultSet.getString("DadosMedicos"));
        } catch (SQLException ex) {
            throw new PersistenciaException(ex.getMessage());
        }
        return pass;
    }
}
 
   

