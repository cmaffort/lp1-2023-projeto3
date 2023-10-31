package br.cefetmg.altomare.model.dao;
import br.cefetmg.altomare.dao.connection.ConexaoDB;
import java.sql.PreparedStatement;
import java.security.SecureRandom;
import java.sql.Connection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import br.cefetmg.altomare.model.dto.PassageiroDTO;
import java.sql.*;

public class PassageiroDAO implements IPassageiroDAO{
    
   Connection conexao;
    
    public PassageiroDAO () throws SQLException, ClassNotFoundException {
        conexao = ConexaoDB.inicializaDB();        
    }
    
    @Override
       public boolean InserirDadosPassageiro(PassageiroDTO pass) {
           
         String sql = "INSERT INTO Passageiro(Pacote, Despesa, CPF, RG, Nome, DataNasc, Email, Senha, Telefone, Sexo, Civil, DadosMedicos) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
         pass.senha = gerarSenha();
         try {
             
             try (PreparedStatement in = conexao.prepareStatement(sql)) {
                 in.setString(1, pass.getPacote());
                 in.setInt(2, pass.getDespesa());
                 
                 Long cpf = pass.getCpf();
                 String cpfStr = cpf.toString();
                 in.setString(3, cpfStr);
                 
                 Long rg = pass.getRg();
                 String rgStr = rg.toString();
                 in.setString(3, rgStr);
                 
                 in.setString(5, pass.getNome());
                 in.setString(6, pass.getDataNascimento());
                 in.setString(7, pass.getEmail());
                 in.setString(8, pass.getSenha());
                 
                 Long telefone = pass.getTelefone();
                 String telefoneStr = telefone.toString();
                 in.setString(3, telefoneStr);
                 
                 in.setString(10, pass.getSexo());
                 in.setString(11, pass.getCivil());
                 in.setString(12, pass.getDadosMedicos());
                 in.execute();
                
             }
                return true;
         }
         catch (SQLException u) {    
                throw new RuntimeException(u);    
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
    public PassageiroDTO ExibirCliente(String cpf){
        
        return null;
        
    }
    
    @Override
    public void delete(String Cpf)throws SQLException{
        String sql = "DELETE FROM passageiro WHERE CPF = ?";
        try(PreparedStatement in = conexao.prepareStatement(sql)){
            in.setString(3, Cpf);
            in.executeUpdate();
            
        }
        
    }
    
    @Override
    public PassageiroDTO ProcurarPassageiro(String cpf) {
        return new PassageiroDTO();
    }
}
   /* @Override
    public Passageiro ProcurarPassageiro(String Cpf) {
        String sql = "SELECT * FROM passageiro WHERE Cpf = ?";
        Passageiro pass = null;
        try(PreparedStatement in = conexao.prepareStatement(sql)){
            in.setString(3, Cpf);
            ResultSet result = in.executeQuery();
            if(result.next()){
                in.getString("getPacote");
                 in.getString("getDespesa");
                 in.getString("Cpf");
                 in.getString("Rg");
                 in.getString("Nome");
                 in.getString("DataNascimento");
                 in.getString("Email");
                 in.getString("Senha");
                 in.getString("Telefone");
                 in.getString("Sexo");
                 in.getString("Civil");
                 in.getString("DadosMedicos");
                 pass = new Passageiro(pacote, cpf,  rg, nome, dataNascimento, email, senha,  telefone, sexo, civil, medico);
                 return pass;
            }
        } catch (SQLException ex) {
           Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
     
}
*/
