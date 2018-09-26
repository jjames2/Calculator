

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class divide
 */
@WebServlet("/divide")
public class divide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public divide() {
        super();
    }

	/**
	 * returns quotient of parameters x and y
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double x = 0;
		double y = 1;
		try {
		    x = Double.parseDouble(request.getParameter("x"));
			y = Double.parseDouble(request.getParameter("y"));
		}
		catch(NumberFormatException | NullPointerException e)
		{
			response.getWriter().append("Invalid parameters");
			return;
		}
		
		if(y != 0) {
			response.getWriter().append(Double.toString(x / y));
		}
		else {
			response.getWriter().append("Divide by zero not allowed");
		}
	}
}
