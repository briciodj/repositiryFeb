package org.crud.sproduct;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDS_product {
	static Connection connection;
	static String driver="oracle.jdbc.driver.OracleDriver";
	static String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	
	public static void connectionOracleDataBase()throws IOException, SQLException{
		try {
			Class.forName(driver).newInstance();
			System.out.println("driver cargado correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Excepcion: "+ e.getMessage());
		} 
		try {
			connection = DriverManager.getConnection(URL,"system","adm1norcL");
			System.out.println("DATA BASE ORACLE CONECTADO...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	public static void agregarS_Product(int id,String name,String short_desc,int longtext_id,int suggesed_price,int whlsl_unit,int image_id) throws IOException,SQLException{
		try {
		
			connectionOracleDataBase();
			//CONSULTA
			String sql = "INSERT INTO S_PRODUCT (ID,NAME,SHORT_DESC,LONGTEXT_ID,SUGGESED_WHLSL_PRICE,WHLSL_UNITS,IMAGE_ID) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, short_desc);
			ps.setInt(4, longtext_id);
			ps.setInt(5, suggesed_price);
			ps.setInt(6, whlsl_unit);
			ps.setInt(7, image_id);
			ps.executeQuery();
			ps.close();
			connection.close();
			System.out.println("INSERTO: " + id +", "+name+","+short_desc+","+longtext_id+","+suggesed_price+","+whlsl_unit+","+image_id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
		
	public static void actalizarS_Product(String name,String short_desc,int longtext_id,int suggesed_price,int whlsl_units,int image_id,int id) throws IOException,SQLException{
		try {
		
			connectionOracleDataBase();
			//CONSULTA
			String sql = "Update s_product set name = ?, short_desc=?,longtext_id=?,suggesed_whlsl_price=?,whlsl_units=?,image_id=? where id = ? ";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, name);
			//ps.setInt(1, id);
			ps.setString(2, short_desc);
			ps.setInt(3, longtext_id);
			ps.setInt(4, suggesed_price);
			ps.setInt(5, whlsl_units);
			ps.setInt(6, image_id);
			ps.setInt(7, id);
			ps.executeQuery();
			ps.close();
			connection.close();
			System.out.println("Actualizó: " + id +", "+name+","+short_desc+","+longtext_id+","+suggesed_price+","+whlsl_units+","+image_id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
	
	public static void eliminarS_Product(int id) throws IOException,SQLException{
		try {
		
			connectionOracleDataBase();
			//CONSULTA
			String sql = "delete from S_product where id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeQuery();
			ps.close();
			connection.close();
			System.out.println("Eliminó: " + id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception"+ e.getMessage());
		}
	}
	
	public static void consultaIndividualS_product(int id)throws IOException,SQLException{
	try {
		connectionOracleDataBase();
		//CONSULTA
		String sql ="select * from s_product where id=?";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rSet = ps.executeQuery();
		if(rSet.next()) {
			System.out.println(rSet.getInt("id")+" , "+ rSet.getString("name")+" , "+ rSet.getString("short_desc")+" , "+rSet.getInt("longtext_id")+" , "+rSet.getInt("suggesed_whlsl_price")+" , "+rSet.getInt("whlsl_units")+" , "+rSet.getInt("image_id"));
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception"+ e.getMessage());
	}
}
	
	public static void consultaGeneralS_product()throws IOException,SQLException{
	try {
		connectionOracleDataBase();
		//CONSULTA
		String sql="select * from s_product order by id";
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rSet = ps.executeQuery();
		while (rSet.next()) {
			System.out.println(rSet.getInt("id")+" , "+ rSet.getString("name")+" , "+ rSet.getString("short_desc")+" , "+rSet.getInt("longtext_id")+" , "+rSet.getInt("suggesed_whlsl_price")+" , "+rSet.getInt("whlsl_units")+" , "+rSet.getInt("image_id"));
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception: "+ e.getMessage());
	}
}
	
	public static void invocaProcedimientoAlmacenado(int id,String name,String short_desc,int longtext_id,int suggesed_price,int whlsl_unit,int image_id)throws IOException,SQLException{
		try {
			connectionOracleDataBase();
			//CONSULTA
			CallableStatement cs = connection.prepareCall("CALL proc_prod(?,?,?,?,?,?,?)");
			cs.setInt(1, id);
			cs.setString(2,name);
			cs.setString(3,short_desc);
			cs.setInt(4, longtext_id);
			cs.setInt(5, suggesed_price);
			cs.setInt(6, whlsl_unit);
			cs.setInt(7, image_id);
			cs.execute();
			System.out.println("Procedimiento Correcto");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+ e.getMessage());
		}
	}
	public static void main(String[] args) throws IOException,SQLException {
		//connectionOracleDataBase();
		//agregarS_Product(6, "lenovo","amd a8", 123, 1, 3, 2);
		//actalizarS_Product("intel i3", "ssd 500gb", 333, 4500, 5, 2,4);
		//eliminarS_Product(2);
		//consultaIndividualS_product(2);
		//consultaGeneralS_product();
		invocaProcedimientoAlmacenado(7, "lenovo","amd a8", 123, 1, 3, 2);
	}
}
