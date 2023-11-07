
package br.cefetmg.altomare.dao.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public static Connection inicializaDB() throws ClassNotFoundException, SQLException{
        String dbDriver = "com.mysql.cj.jdbc.Driver";
        
        
        String dbName = "jdbc:mysql://localhost:3306/altomare";
        String dbUserName = "root";
        String dbPassword = "";
        
        Class.forName(dbDriver);
        Connection conexao = DriverManager.getConnection(dbName , dbUserName , dbPassword);
        
        return conexao;
    }
}
