import java.sql.*;
import java.sql.PreparedStatement;
import factory.ConnectionFactory;
import br.cefetmg.altomare.idao.IPassageiro;
import br.cefetmg.altomare.dao.mysql.ConexaoDB;
import java.sql.Connection;


public class PassageiroDAO import IPassageiro{
    protected static InserirDadosPassageiro(Pacote pacote, Despesas despesa, String cpf, long rg, String nome, String dataNascimento, String email, String senha, long telefone, String sexo, String civil){
        Passageiro pass = new Passageiro(pacote, despesa, cpf,  rg, nome, dataNascimento, email, senha,  telefone, sexo, civil);
        
         Connection conexao = ConexaoDB.inicializaDB();
        
         String sql = "INSERT INTO Passageiro(Pacote, Despesa, CPF, RG, Nome, DataNasc, Email, Senha, Telefone, Sexo, Civil) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
         
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
                
                in.execute();   
                in.close();
         }
         catch (SQLException u) {    
                throw new RuntimeException(u);    
            }    
    }
    
}
