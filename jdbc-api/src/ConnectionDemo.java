import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/shashank";

		DriverManager.registerDriver(new Driver());
		Connection conn = JdbcFactory.getConnection();
		System.out.println("Connection succesful!");

		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB name " + meta.getDatabaseProductName());
		System.out.println("DB Version " + meta.getDatabaseProductVersion());
		System.out.println("Driver name " + meta.getDriverName());
		System.out.println("Driver version " + meta.getDriverVersion());
	}
}
