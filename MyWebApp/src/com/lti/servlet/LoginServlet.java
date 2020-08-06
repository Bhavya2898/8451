package com.lti.servlet;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet.lti")
public class LoginServlet extends HttpServlet {
	
	// doPost method because method="post" in the HTML file
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// reading user input
			String uname = request.getParameter("uname");
			String pwd = request.getParameter("pwd");
			
			//InMemoryLoginService loginService = new InMemoryLoginService();
			DatabaseLginService loginService = new DatabaseLginService();
			
			boolean isValid = loginService.authenticate(uname, pwd);
			if(isValid) {
				String rememberMe = request.getParameter("reme");
				if(rememberMe != null && rememberMe.contentEquals("yes")) {
					Cookie c1 = new Cookie("uname",uname);
					c1.setMaxAge(60*60); //1hr
					Cookie c2 =  new Cookie("pwd", Base64.getEncoder().encodeToString(pwd.getBytes()));
					c2.setMaxAge(60*60);
					response.addCookie(c1);
					response.addCookie(c2);
					
				
			}
			
			response.sendRedirect("Welcome.html");
		}
		else
			response.sendRedirect("Login.html");
		
		}
}
		


	
	

