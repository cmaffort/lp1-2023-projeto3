
package br.cefetmg.altomare.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public static Connection inicializaDB() throws ClassNotFoundException, SQLException{
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost3306/altomare?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        String dbName = "jdbc:mysql://localhost:3306/altomare?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        String dbUserName = "root";
        String dbPassword = "";
        
        Class.forName(dbDriver);
        Connection conexao = DriverManager.getConnection(dbURL + dbName + dbUserName + dbPassword);
        
        return conexao;
    }
}
