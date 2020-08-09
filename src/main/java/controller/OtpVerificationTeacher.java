package controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpool.DBUtil;

@WebServlet("/OtpVerificationTeacher")
public class OtpVerificationTeacher extends HttpServlet {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String otp = request.getParameter("otp");

		try {

			Connection connection = DBUtil.getDataSource().getConnection();
			Statement st = connection.createStatement();

			ResultSet rs = st.executeQuery("select * from otpgen where otpvalues='" + otp + "'");
			// rs.next();
			// rs.getString("otpvalues").equals(otp)
			if (rs.next()) {
				System.out.println(otp);
				response.setHeader("cache-control", "no-cache,no-store,must-revalidate");
				response.sendRedirect("TeacherDashboard.jsp");
			}
			else
			{
				PrintWriter pw = response.getWriter();
				response.setContentType("text/html");
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Enter the valid Otp');");
				pw.println("</script>");
				RequestDispatcher rd = request.getRequestDispatcher("OtpVerification.jsp");
				rd.include(request, response);

				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("outside if");

	}

}
