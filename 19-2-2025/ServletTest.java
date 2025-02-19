package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class Servlettry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");      
	       PrintWriter pwriter = response.getWriter();    
	       pwriter.println("<form name='loginForm' action='loginform' method='post'>");
	       pwriter.println("Username: <input type='text' name='username'/> <br/>");
	       pwriter.println("Password: <input type='password' name='password'/> <br/>");
	       pwriter.println("<input type='submit' value='Login'/>");
	       pwriter.println("</form>");
    }
	
}
