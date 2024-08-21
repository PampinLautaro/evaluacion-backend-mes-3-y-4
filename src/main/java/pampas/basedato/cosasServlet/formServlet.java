package pampas.basedato.cosasServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class formServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		try (PrintWriter out = resp.getWriter()) {
			out.println("<HTML>");
			out.println("<HEAD>");
			out.println("<META charset=\"UTF-8\">");
			out.println("<title>procesando form con post</title>");
			out.println("</HEAD>");
			out.println("<body>");
			out.println("<h1>procesando form con post</h1>");
			out.println();
			out.println();
			out.println();
			out.println();
			out.println("</body>");
			out.println("</HTML>");
		} catch (Exception e) {
			
		}
	}

	
}
