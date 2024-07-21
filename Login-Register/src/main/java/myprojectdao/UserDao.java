package myprojectdao;

import org.apache.catalina.User;

public interface UserDao {

	boolean isValidUser(String username, String password);

	boolean addUser(Users user);

}
