package myprojectdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import org.apache.catalina.User;

import myprojectutil.DButil;

public class UserDaoImp implements UserDao {

	@Override
	public boolean isValidUser(String username, String password) {
		// TODO Auto-generated method stub
	    String query ="SELECT * FROM users WHERE username=? AND password=?";
	    try(Connection connection = DButil.getConnection() ;
	    	PreparedStatement preparestatement = connection.prepareStatement(query)	){
	    	
	    	preparestatement.setString(1, username);
	    	preparestatement.setString(2, password);
	    	
	    	ResultSet resultset = preparestatement.executeQuery();
//	    	System.out.println("Query Running");
	    	return resultset.next();
	    }
 catch(Exception e) {
	    	e.printStackTrace();
	    	return false;
	    }
		
	    		
	}

	@Override
	public boolean addUser(Users user) {
		// TODO Auto-generated method stub
		String query ="INSERT INTO users (username,password) VALUES (?,?)";
	    try(Connection connection = DButil.getConnection() ;
		    	PreparedStatement preparestatement = connection.prepareStatement(query)	){
		    	
		    	preparestatement.setString(1, user.getUsername());
		    	preparestatement.setString(2, user.getPassword());
		    	
		    	int resultset = preparestatement.executeUpdate();
                System.out.println("User Added Succesully");
		    	return resultset>0;
		    }
	 catch(Exception e) {
		    	e.printStackTrace();
		    	return false;
		    }
	}

}
