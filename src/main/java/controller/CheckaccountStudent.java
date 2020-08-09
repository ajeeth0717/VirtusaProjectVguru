package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CheckDao;
import dao.InsertvalueStudent;

@WebServlet("/CheckaccountStudent")
public class CheckaccountStudent extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String uname = request.getParameter("fullname");
		String pass = request.getParameter("Password");
		String email = request.getParameter("EmailId");
		String org = request.getParameter("Organization");

		CheckDao checkdao = new CheckDao();

		if (checkdao.check(email)) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			// alert message
			response.setHeader("cache-control","no-cache,no-store,must-revalidate");
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('This Email is already registerd ');");
			pw.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("CreateNewAccountStudent.jsp");
			rd.include(request, response);

		} else {
			InsertvalueStudent in = new InsertvalueStudent();
			if (in.insert(uname, pass, email, org) >= 1) {
				System.out.println("values inserted in db");
				HttpSession session = request.getSession();
				session.setAttribute("username", uname);
				response.setHeader("cache-control","no-cache,no-store,must-revalidate");
				PrintWriter pw = response.getWriter();
				response.setContentType("text/html");
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Account created sucessfully');");
				pw.println("</script>");
				RequestDispatcher rd = request.getRequestDispatcher("StudentLogin.jsp");
				rd.include(request, response);

			}

		}

	}

}
