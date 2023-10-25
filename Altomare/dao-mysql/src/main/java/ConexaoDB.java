import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  

public class ConexaoDB {
    protected static Connection inicializaDB()
        throws SQLException, ClassNotFoundException
    {
      
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:3306/altomare?zeroDateTimeBehavior=CONVERT_TO_NULL";
  
        String dbName = "jdbc:mysql://localhost:3306/altomare?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]";
        String dbUsername = "root";
        String dbPassword = "";
  
        Class.forName(dbDriver);
        Connection conexao = DriverManager.getConnection(dbURL + dbName,dbUsername, dbPassword);
        return conexao;
    }
}