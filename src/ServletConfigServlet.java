import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		Enumeration<String> parameters = config.getInitParameterNames();
	    String paramName="";  
		while(parameters.hasMoreElements()){  
			paramName=parameters.nextElement();
		    out.print(" <br> Compnay "+ paramName + " is " +config.getInitParameter(paramName));  
		}  
	}
}