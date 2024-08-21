package pampas.basedato.cosasServlet.metodos;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("cabecera")
public class Cabecera extends HttpServlet{

	protected void cabeceraHTML(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String titulo = "evaluacion backend java 3 y 4";
		out.println("<HTML>"+
			"<META NAME=\"title\" CONTENT=\""+titulo+", examen de Servlets Java y JDBC\">"+
			"<meta name=\"author\" content=\"(colocar aquí tu nombre completo)\">"+
			"<HEAD>"+
			"<TITLE>"+titulo+"</TITLE>"+
			"<STYLE>"+
			"h3 { font-size: 12pt; font-family: Arial; color: white; background-color:#FFFFFF ; line-height: 134%; "+
			"text-align: justify; margin-top:6; margin-bottom:6; margin-left:6; margin-right:6}"+
			"h5 { color: #42628e; text-align: left; text-indent:0px; margin-top:0; margin-right: 10; margin-left: 10;"+
			"margin-bottom:0 ;background-color: white; font-size:12pt; font-family: Courier}"+
			"h4 { font-size: 14pt; font-family: Arial; color: white; background-color:#42628e ; line-height: 134%; "+
			"text-align: center; margin-top:6; margin-bottom:6; margin-left:6; margin-right:6}"+
			"p { text-align: justify; margin-top:6; margin-bottom:6; margin-left:10; margin-right:10}"+
			"h1 { color: white; text-align: center; background-color: #42628e; font-size: 20pt; }"+
			"h2 { color: white; text-align: center; background-color: #42628e; font-size: 20pt; font-family: Courier}"+
			"A.sub { text-decoration:underline; }"+
			"A { text-decoration:none; }"+
			"</STYLE>"+
			"</HEAD>"+
			"<BODY bgColor=\"#FFFFFF\" text=\"#000000\" link=\"#004466\" vlink=\"#888888\" >");
	}
}
