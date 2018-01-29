package com.example.web;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.*;

public class MusicSelect extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{

		MusicExpert expert = new MusicExpert();
		String c = request.getParameter("rasa");
		List raagas = expert.getMusic(c);

		//This was the response displayed by servlet without using JSP
		//PrintWriter out = response.getWriter();
		//out.println("<br> Got music rasa " + c);
		//response.setContentType("text/html");		
		//out.println("Music Selection Advice <br/>");		
		/*Iterator it = raagas.iterator();
		while(it.hasNext()){
			out.print("<br>try :" + it.next());
		}*/
		
		request.setAttribute("styles",raagas);

		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	
	}
}