package mvc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registerDAO {
	String url = "jdbc:sqlserver://LAPTOP-R880T7P1\\SHUMOGABE;databaseName=javaweb;integratedSecurity=true";
	String user = "sa";
	String password = "123456";
	String db = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public void load(String db) {
		try {
			Class.forName(db);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Successful");
		} catch (SQLException e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		return conn;
	}
	public String insert(registerDTO dto) {
		load(db);
		Connection conn = getConnection();
		String result = "Thêm thành công";
		String sql = "insert into register values(?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getUser());
			ps.setString(2, dto.getPass());
			ps.setString(3, dto.getPhone());
			ps.setString(4, dto.getEmail());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			result = "Thêm xong rồi";
		}
		return result;
	}
}
