package pampas.basedato.cosasServlet.metodos;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("tabla")
public class TablaAsignaturas extends HttpServlet{

	protected void tablaAsignaturas (HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h5> <br/>"+
				"<center>"+

				"<table border=\"1\" cellpadding=\"6\" style=\" font-size: 10pt; font-family: Courier; color: white; background-color:#547cb4 ; line-"+
				"height: 134%; text-align: justify; margin-top:6; margin-bottom:6; margin-left:20; margin-right:20\">"+

				"<tr>"+

				"<th> Columna 1 </th>"+
				"<th> Columna 2</th>"+
				"<th> Columna 3</th>"+
				"<th> Columna 4 </th>"+
				"<th> Columna 5</th>"+

				"<th> Columna ......</th>"+
				"</tr>"+
				"</table> </center> <br/> </h5>");
	}
}
