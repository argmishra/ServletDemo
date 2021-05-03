import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/demoAnnotation", initParams = { 
		   @WebInitParam(name = "car", value = "getz"), 
		   @WebInitParam(name = "colour", value = "white") 
		}) 
public class AnnotationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("Servlet Annotation Demo <br>");
		out.println("I have " +getInitParameter("car")+ " car which is "+getInitParameter("colour") + " in colour"); 
	}
}