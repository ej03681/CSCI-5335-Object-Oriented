import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectSQL {
public static void main(String[] args) throws SQLException {
	String host = "jdbc:mysql://localhost/";
	String uName = "sql9260341";
	String uPass = "ZeatkF5MU1";
	
	ResultSet resultSet = null;
	try (Connection connection = DriverManager.getConnection(host, uName, uPass); 
	Statement statement = connection.createStatement();) {

        // Create and execute a SELECT SQL statement.
        String selectSql = "SELECT * FROM `ATM Accounts` WHERE id=1000001";
        resultSet = statement.executeQuery(selectSql);

        // Print results from select statement
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
        }
	}
	catch (SQLException e) {
        e.printStackTrace();
    }
}
}
