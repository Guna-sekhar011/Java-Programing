package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Day3 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/advancejava";
		String user = "root";
		String password = "root";
		String sql = "update `emp` set `salary` = `salary`+56000";
		String query = "select `salary` from emp";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class loaded successfully..");
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established..");
			
			Statement statement = con.createStatement();
			int i = statement.executeUpdate(sql);
			System.out.println(i);
			
			ResultSet res = statement.executeQuery(query);
			while(res.next()) {
			System.out.println(res.getInt(1));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
