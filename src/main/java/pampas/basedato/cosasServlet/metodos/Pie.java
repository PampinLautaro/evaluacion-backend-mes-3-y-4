package pampas.basedato.cosasServlet.metodos;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("pie")
public class Pie extends HttpServlet{

	protected void pieHTML(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<HTML>"+
				"<br/>"+
				"<br/>"+
				"<!-------------------------------------------------------------------->"+
				"<!--Franja de Abajo -->"+
				"<!-------------------------------------------------------------------->"+
				"<div id= \"nifty3 \">"+
				"<table width= \"100% \" bgcolor= \"#42628e \">"+
				"<tr><td wifth= \"20% \">&nbsp;</td><td width= \"60% \">"+
				"<p align= \"center \" ><h2 style= \"background-color:#FFFFFF \"><a href= \"(colocar tu mail) \"> </a></h2></p>"+
				"</td><td wifth= \"20% \">&nbsp;</td></tr>"+
				"</table>"+
				"</div>"+

				"<!--Fin Tabla principal-->"+
				"</TD>"+
				"</TR>"+
				"</TABLE>"+
				"</BODY>"+
				"</HTML>");
	}
}
