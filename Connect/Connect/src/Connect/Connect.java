package Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {

	public static void main(String[] args){
		// TODO Auto-generated method stub
			String url = "jdbc:sqlserver://LAPTOP-R880T7P1\\SHUMOGABE:80;databaseName=dh8c6;integratedSecurity=true";
			String user = "sa";
			String password = "123456";
			try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("Successful");
		}catch (SQLException e){
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
