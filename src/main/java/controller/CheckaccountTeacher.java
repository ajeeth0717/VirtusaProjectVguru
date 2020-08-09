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

import dao.CheckTeacherDao;
import dao.InsertvalueTeacher;

@WebServlet("/CheckaccountTeacher")
public class CheckaccountTeacher extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String Name = request.getParameter("Name");
		String Password = request.getParameter("Password");
		String EmailId = request.getParameter("EmailId");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");

		CheckTeacherDao checkdao1 = new CheckTeacherDao();

		if (checkdao1.check(EmailId)) {
			HttpSession session = request.getSession();
			session.setAttribute("email", EmailId);
			// alert message
			response.setHeader("cache-control","no-cache,no-store,must-revalidate");
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('This Email is already registered');");
			pw.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("TeachercreateNewccount.jsp");
			rd.include(request, response);

		} else {
			InsertvalueTeacher in = new InsertvalueTeacher();
			if (in.insertteacher(Name, EmailId, Password, age, gender) >= 1) {
				System.out.println("values inserted in db");
				HttpSession session = request.getSession();
				session.setAttribute("username", Name);
				response.setHeader("cache-control","no-cache,no-store,must-revalidate");
				PrintWriter pw = response.getWriter();
				response.setContentType("text/html");
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Account created Sucessfully');");
				pw.println("</script>");
				RequestDispatcher rd = request.getRequestDispatcher("TeacherLogin.jsp");
				rd.include(request, response);

			}

		}

	}

}
