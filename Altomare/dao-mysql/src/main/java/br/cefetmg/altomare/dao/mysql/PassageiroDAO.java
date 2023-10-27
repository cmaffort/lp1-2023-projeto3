import java.sql.*;
import java.sql.PreparedStatement;
import factory.ConnectionFactory;
import br.cefetmg.altomare.idao.IPassageiro;
import br.cefetmg.altomare.dao.mysql.ConexaoDB;
import java.security.SecureRandom;
import java.sql.Connection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class PassageiroDAO import IPassageiro{
    
    protected static void InserirDadosPassageiro(Pacote pacote, Despesas despesa, String cpf, long rg, String nome, String dataNascimento, String email, String senha, long telefone, String sexo, String civil, String dadosMedicos){
        Passageiro pass = new Passageiro(pacote, despesa, cpf,  rg, nome, dataNascimento, email, senha,  telefone, sexo, civil, dadosMedicos);
        
         Connection conexao = ConexaoDB.inicializaDB();
        
         String sql = "INSERT INTO Passageiro(Pacote, Despesa, CPF, RG, Nome, DataNasc, Email, Senha, Telefone, Sexo, Civil, DadosMedicos) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
         
         try{
                PreparedStatement in = conexao.prepareStatement(sql); 
                in.setString(1, pass.pacote);
                in.setString(2, pass.despesa);
                in.setString(3, pass.getCpf);
                in.setString(4, pass.getRg);
                in.setString(5, pass.getNome);
                in.setString(6, pass.getDataNascimento);
                in.setString(7, pass.getEmail);
                in.setString(8, pass.getSenha);
                in.setString(9, pass.geTelefone);
                in.setString(10, pass.getSexo);
                in.setString(11, pass.getCivil);
                in.setString(12, pass.getDadosMedicos);
                
                
                in.execute();   
                in.close();
         }
         catch (SQLException u) {    
                throw new RuntimeException(u);    
            }    
    }
    
    public String gerarSenha(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        return IntStream.range(0, 8)
                .map(i -> random.nextInt(chars.length()))
                .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
                .collect(Collectors.joining());
    }
}
