package myprojectpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.catalina.User;
import myprojectdao.UserDao;
import myprojectdao.UserDaoImp;
import myprojectdao.Users;
/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private static UserDao userDao =  new UserDaoImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		
		
		if(userDao.addUser(user)) {
			response.sendRedirect("login.jsp?registration=success");
		}
		else {
			response.sendRedirect("register.jsp?error=1");		
			}
	}

}
