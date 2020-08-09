package controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String sql = "select pass from createaccnt where EmailId=?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajeeth", "root", "msdhoni07");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, email);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				String to = email;// change accordingly
				// Get the session object
				Properties props = new Properties();
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.port", "465");
				Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("Enter admin EmailId", "Password");
					}
				});

				// compose message
				MimeMessage message = new MimeMessage(session);

				message.setFrom(new InternetAddress("Enter admin EmailID"));// change accordingly

				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

				message.setSubject("forgot password");

				message.setText("Your password is :" + rs.getNString(1));
				// send message
				Transport.send(message);
				response.setHeader("cache-control","no-cache,no-store,must-revalidate");
				PrintWriter pw = response.getWriter();
				response.setContentType("text/html");
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Password sent to your EmailId');");
				pw.println("</script>");
				RequestDispatcher rd=request.getRequestDispatcher("StudentLogin.jsp");
				rd.include(request, response);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
