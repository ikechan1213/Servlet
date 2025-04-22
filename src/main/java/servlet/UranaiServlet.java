package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/UranaiServlet")
public class UranaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.print("…");
		out.print("</html>");
	response.setContentType("text/html; charset=UTF-8"); // HTMLをUTF-8で返す設定
	response.getWriter().println("<html><body>");
	response.getWriter().println("<h1>こんにちは、サーブレット！</h1>");
	response.getWriter().println("<h1>こんにちは、サーブレット！</h1>");
	response.getWriter().println("</body></html>");
	}

}
