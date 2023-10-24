
package br.cefetmg.altomare.dao.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class Conexao {
    
    public Connection conectaBD(){
        Connection conexao = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/altomare?user=root&password=";
            conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO" + e.getMessage());
        }
     
        return conexao;
    }
}
