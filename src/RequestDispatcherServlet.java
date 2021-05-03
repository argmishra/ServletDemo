import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherServlet extends HttpServlet {          
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		if(request.getParameter("name").equalsIgnoreCase("name")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome");
			dispatcher.forward(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.print(" <h4> Please insert name to login </h4> ");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}
	}
}