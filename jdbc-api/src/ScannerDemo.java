import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// ?known as place holders, their index starts from 1.
		String sql = "insert into customer values(?,?,?)";
		Scanner scan  = new Scanner(System.in);

		try {
			Connection conn = JdbcFactory.getConnection();
			// pre-compile statement created with query
			PreparedStatement stmt = conn.prepareStatement(sql);
			// Replacing place holders with values
			
			stmt.setInt(1, scan.nextInt());
			stmt.setString(2, scan.next());
			stmt.setString(3, scan.next());
			
			stmt.executeUpdate();
			
			System.out.println("Record inserted");
		} catch (SQLException e) {
			System.out.println("Record not inserted due to...");
			e.printStackTrace();
		}

	}
}
