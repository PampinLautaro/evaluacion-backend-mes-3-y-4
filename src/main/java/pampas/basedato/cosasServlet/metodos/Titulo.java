package pampas.basedato.cosasServlet.metodos;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("titulo")
public class Titulo extends HttpServlet{

	protected void tituloHTML (HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String mensaje = "algun mensaje de titulo";
		out.println("<!-------------------------------------------------------------------->"+
				"<!-- TITULO -->"+
				"<!-------------------------------------------------------------------->"+
				"<h1><br/>"+mensaje+"<br/>&nbsp;</h1>");
	}
}
