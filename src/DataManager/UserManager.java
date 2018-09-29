package DataManager;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;

import DatabaseAndTools.MySQLConnector;

public class UserManager {
	public static void saveNew_Product(NewProductDB x) {
		try {
			Connection conn = MySQLConnector.Connect();
			String query = "INSERT INTO new_product VALUES (0, ?, ?)"; 																								
			PreparedStatement st = conn.prepareStatement(query);
			if (x.getNewProduct_Img() != null) {
				ByteArrayOutputStream outStream = new ByteArrayOutputStream();
				ImageIO.write(x.getNewProduct_Img(), "jpg", outStream);
				ImageIO.write(x.getNewProduct_Img(), "png", outStream);
				ImageIO.write(x.getNewProduct_Img(), "jpeg", outStream);
				st.setBytes(1, outStream.toByteArray());
				outStream.close();
			} else 
				st.setBytes(1, new byte[0]);
			st.setString(2, x.getNewProduct_Type());
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}
	}
	
	public boolean check_Email(String text) {
	    try {
	    	Connection conn = MySQLConnector.Connect();
			Statement st = conn.createStatement();
			ResultSet rec = st.executeQuery("SELECT email FROM user");
			//Email
			while (rec.next()) {
			   if (text.equals(rec.getString("email"))) {
				   return false;
				   }
			}
			return true;
		
		
	    } catch (Exception exo) {
	    	return true;
	    }
	}
	public boolean check_Phone(String text) {
		  try {
		    	Connection conn = MySQLConnector.Connect();
				Statement st = conn.createStatement();
				ResultSet rec = st.executeQuery("SELECT phone FROM user");
				//Email
				while (rec.next()) {
				   if (text.equals(rec.getString("phone"))) {
					   
					   return false;
					   }
				}
				return true;
			
			
		    } catch (Exception exo) {
		    	return true;
		    }
		}
	public boolean checkLogin(String user,String password ) {
		try {
			Connection conn = MySQLConnector.Connect();
			Statement st = conn.createStatement();
			ResultSet rec = st.executeQuery("SELECT phone,email,password FROM user");
			//Email
			while (rec.next()) {
			   if ((user.equals(rec.getString("email"))||user.equals(rec.getString("phone")))&&password.equals(rec.getString("password"))) {
				   return false;
				   }
			}
			return true;
		
		
		}catch(Exception ex) {
			System.out.println("Error"+ex);
			return true;
		}
	}
	public String forget(String email,String name ) {
		try {
			Connection conn = MySQLConnector.Connect();
			Statement st = conn.createStatement();
			ResultSet rec = st.executeQuery("SELECT email,name,password FROM user");
			//Email
			while (rec.next()) {
			   if (email.equals(rec.getString("email"))&&name.equals(rec.getString("name")) ){
				   return rec.getString("password");
				   }
			}
			return "notFound";
		
		
		}catch(Exception ex) {
			return "notFound";
		}
	}
	 public boolean Insert(String email, String phone,String date ,String password,String name) {
		    try {
		    	Connection conn = MySQLConnector.Connect();
				String query= "INSERT INTO user(name,phone,date,email,password,type) VALUES(?,?,?,?,?,?)"; 	
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1, name);
				stmt.setString(2, phone);
				stmt.setString(3, date);
				stmt.setString(4, email);
				stmt.setString(5, password);
				stmt.setString(6, "user");
				stmt.executeUpdate();
				return true;
		    } catch (Exception exo) {
		    	return false;
		    }
	 }
}