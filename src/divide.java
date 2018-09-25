

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double x = 0;
		double y = 1;
		try {
		    x = Double.parseDouble(request.getParameter("x"));
			y = Double.parseDouble(request.getParameter("y"));
		}
		catch(Exception e)
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}