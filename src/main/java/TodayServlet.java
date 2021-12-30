

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Formatter;
import java.util.Timer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Formatter f = new Formatter();
		LocalDateTime DateTime = LocalDateTime.now();
		
		f.format("현재 시간 : %tY/%tm/%te %tk:%tM ", DateTime,DateTime,DateTime,DateTime,DateTime);
		
		out.println("<h2><a href='http://localhost:8080/aboutme/index.html'>메인화면</a></h2><br>"); 
		out.print("<h1><center>");
		out.print(f);
		out.print("</center></h1>");
		out.close();
	}

	
}
