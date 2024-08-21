package pampas.basedato.cosasServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pampas.basedato.cosasServlet.metodos.Cabecera;
import pampas.basedato.cosasServlet.metodos.Pie;
import pampas.basedato.cosasServlet.metodos.TablaAsignaturas;
import pampas.basedato.cosasServlet.metodos.Titulo;

@WebServlet("/algo-noseque")
public class PrincipalServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println(Cabecera.class);
		out.println(Titulo.class);
		out.println(TablaAsignaturas.class);
		out.println(Pie.class);
	}
}
