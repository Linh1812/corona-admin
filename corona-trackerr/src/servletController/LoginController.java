package servletController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LoginService;
import model.LoginForUser;

/**
 * Servlet implementation class login
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		  String username = req.getParameter("username");
		  res.setContentType("text/html");
		  String password = req.getParameter("password");
		  res.setContentType("text/html");
		  
		  LoginService sv = new LoginService();
		  LoginForUser us = new LoginForUser(username,password);
		  
		  if(sv.checkLogin(us)) {
			  RequestDispatcher rd = req.getRequestDispatcher("/view/login.jsp");
			  rd.forward(req, res);
		  } else {
			  res.sendRedirect("/login.jsp");
			  
		  }
		  
		  PrintWriter pw = res.getWriter();
		  pw.println(
				   "<html>\n" +
		             "<body>" + 
		             "<h2> Hello " + username + " !\n" + 
		             "</body>" +
		             "</html>"   
				   );
		  pw.close();
		
	}
}


	