import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie cookie= new Cookie("uname", request.getParameter("name"));
		response.addCookie(cookie);
		
		out.print("<form action=\"demoConsumeCookie\">");
		out.print("<input type=\"submit\" value=\"Submit\"/>");
		out.print("</form>");
	}
}