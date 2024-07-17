package JdbcJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdvanceJava {

	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/advancejava";
		String username = "root";
		String password = "root";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Success...!");

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
