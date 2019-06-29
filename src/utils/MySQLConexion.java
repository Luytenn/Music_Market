package utils;
import java.sql.*;

public class MySQLConexion {

	public  static Connection getConexion(){
		
		Connection con = null;
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			String url  = "jdbc:mysql://localhost/Music_Market";
			String usr = "root";
			String psw = "";
			con = DriverManager.getConnection(url,usr,psw);
			
		}catch(ClassNotFoundException ex){
			System.out.println("Error >> Driver no Instalado");
		}catch(SQLException ex){
			System.out.println("Error >> de conexión con la BD");
		}
		
		return con;
	}
	
}
