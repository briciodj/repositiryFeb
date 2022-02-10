package org.crud.sregion;

import java.io.IOException;
import java.rmi.ConnectIOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * crud:  create read update delete
 * */
public class CRUDS_Region {
	
	static Connection connection;
	static String driver ="oracle.jdbc.driver.OracleDriver";
	static String URL= "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public static void connectionOracleDataBase()throws IOException,SQLException{
		try {
			Class.forName(driver).newInstance();
			System.out.println("CARGO DRIVER CORRECTAMENTE");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("EXCEPTION"+ e.getMessage());
		}
		try {
			connection = DriverManager.getConnection(URL,"system","adm1norcL");
			System.out.println("CONEXION EXITOSA A ORACLE DATA BASE");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("EXCEPTION"+ e.getMessage());
		}
	}
	
	public static void agregarS_Region(int id,String name) throws IOException,SQLException{
		try {
		
			connectionOracleDataBase();
			//CONSULTA
			String sql = "INSERT INTO S_REGION (ID,NAME) VALUES (?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.executeQuery();
			ps.close();
			connection.close();
			System.out.println("INSERTO: " + id +", "+name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
	
	public static void actualizarS_Region( String name,int id) throws IOException,SQLException{
		try {
		
			connectionOracleDataBase();
			//CONSULTA
			String sql = "UPDATE S_REGION SET NAME = ? WHERE ID = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,name);
			ps.setInt(2,id);
			ps.executeQuery();
			ps.close();
			connection.close();
			System.out.println("Actualizo: " + id+", "+name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
	
	public static void eliminarS_Region(int id) throws IOException,SQLException{
		try {
		
			connectionOracleDataBase();
			//CONSULTA
			String sql = "delete  from S_REGION where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println("1iuyi2");
			ps.setInt(1,id);
			ps.executeQuery();
			ps.close();
			connection.close();
			System.out.println("Eliminó: " + id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
	
	public static void consultaIndividualS_Region(int id) throws IOException,SQLException{

		try {
		
			connectionOracleDataBase();
			//CONSULTA
			String sql = "select *  from S_REGION where id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rSet = ps.executeQuery();
			if (rSet.next()) {
				System.out.println(rSet.getInt("id")+","+rSet.getString("name"));
			}			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
	
		
	public static void consultaGeneralS_Region() throws IOException,SQLException{
		try {
		
			connectionOracleDataBase();
			//CONSULTA
			System.out.println("siiiii");
			String sql = "select * from s_region order by id";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rSet =ps.executeQuery();
			while (rSet.next()) {
				System.out.println(rSet.getInt("id")+","+ rSet.getString("name"));				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
	
	public static void invovaProcedimientoAlamacenado(int id,String name) throws IOException,SQLException{
		try {
		
			connectionOracleDataBase();
			//CONSULTA
			CallableStatement cs = connection.prepareCall("CALL proc(?,?)");
			cs.setInt(1,id);
			cs.setString(2,name);
			cs.execute();
			System.out.println("procedimiento correcto");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
	
	public static void main(String[] args)throws IOException, SQLException {
		
		//connectionOracleDataBase();
		
		//actualizarS_Region( "COAHUILA",17);		
		eliminarS_Region(23);
		//consultaIndividualS_Region(2);
		//agregarS_Region(23,"DURANGO");
		//consultaGeneralS_Region();
		//invovaProcedimientoAlamacenado(22, "Tijuana");
	}
}
