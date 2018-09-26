

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class subtract
 */
@WebServlet("/subtract")
public class subtract extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public subtract() {
        super();
    }

	/**
	 * returns difference of parameters x and y
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
		
		response.getWriter().append(Double.toString(x - y));
	}

}
