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

import dao.LoginStudentDao;

@WebServlet("/LoginStudent")
public class LoginStudent extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("Emailid");
		String pass = req.getParameter("Password");

		System.out.println(email + " " + pass);

		LoginStudentDao dao = new LoginStudentDao();

		if (dao.check(email, pass)) {
			HttpSession session = req.getSession();
			session.setAttribute("email", email);
			res.sendRedirect("StudentDashboard.jsp");
		} else {
			res.setHeader("cache-control","no-cache,no-store,must-revalidate");
			PrintWriter pw = res.getWriter();
			// res.getWriter().println("Enter the Correctusername and password");
			// re.setAttribute("invalid");
			res.setContentType("text/html");
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Invalid Username or Password');");
			pw.println("</script>");
			RequestDispatcher rd=req.getRequestDispatcher("StudentLogin.jsp");
			rd.include(req, res);
			

		}

	}
}
