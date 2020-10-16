package connectionDb;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	Connection  con=null;
	String dbURL = "jdbc:mysql://localhost/university?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String username = "root";
	String password = "";
	public Connection getConnect() {           
		 try { 
			   con = DriverManager.getConnection(dbURL, username, password);
			 if (con != null) {
			    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
