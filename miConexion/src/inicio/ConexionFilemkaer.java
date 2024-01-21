package inicio;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConexionFilemkaer {
	
	static final String JDBC_DRIVER = "com.filemaker.jdbc.Driver";
	static final String DB_URL = "jdbc:filemaker://MIDOMINIO.com/BASEDEDATOS?SocketTimeout=300";

	static final String USER = "Usuario";
	static final String PASS = "Password";
	
	
	public static Connection conexionFilemaer() {
		Connection conn= null;
		Statement stms = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Estamos conectados a la base de Datos filemaker");
			return conn;
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		
		
		return null;
	}
	
	
	

}
