import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.DatabaseMetaData;

public class ResultDemo {

	public static void main(String[] args) {

		String sql = "select * from customer";

		try {
			Connection conn = JdbcFactory.getConnection();
			// As query is fixed, use statement
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// points before first record
			// ResultSet has next() which says to go to next record
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData meta = (ResultSetMetaData) rs.getMetaData();
			//ResultSetMetaData has table structure data like col.name, col.count etc...
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				System.out.print(meta.getColumnName(i) + "   \t");
			}
			while (rs.next()) //rs.next()->returns true if next record is present
				System.out.println(rs.getInt(1) + "\t" + rs.getString("cname") + "\t" + rs.getString(3));
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
