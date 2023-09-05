import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {

		String sql1 = "insert into customer values(134, 'Loyina', 'Games')";
		String sql2 = "update customer set domain  = 'Sports' where cust_id = 121";
		String sql3 = "delete from customer where cust_id = 212";
		
		Connection conn = null;
		
		try {			
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			//Adding batch of sql queries to a statement
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);

			conn.setAutoCommit(false); //setting auto commit off
			stmt.executeBatch();	//executing batch of queries at once

			conn.commit(); // committing the changes
			System.out.println("Transaction completed...");
		} catch (SQLException e) {
			System.out.println("Transaction failed due to...");
			try {
				conn.rollback();    // rollback transaction on exception
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			e.printStackTrace();
		}

	}

}
