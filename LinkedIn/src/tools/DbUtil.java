package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static DbUtil instance = new DbUtil();
	
	private DbUtil(){}
	
	public static DbUtil getInstance(){
		return instance;
	}
	// jdbc:mysql://localhost:3307/student_manage
	public Connection getConnection(){
		//jdbc:mysql://47.95.204.223:3306/linkedin
		String url="jdbc:mysql://47.95.204.223:3306/linkedin";
		String username="root";
		String password="lhsl842215791";	
		//String password="lhsl842215791";
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void closeConnection(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
