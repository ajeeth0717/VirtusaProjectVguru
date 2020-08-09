package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginteacherDao;
import dao.OtpInsert;

@WebServlet("/LoginTeacher")
public class LoginTeacher extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("Emailid");
		String pass = req.getParameter("Password");
		System.out.println(email + " " + pass);
		int len = 5;
		String numbers = "0123456789";

		// Using random method
		Random rndm_method = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		String k = new String(otp);
		OtpInsert ot = new OtpInsert();
		ot.insertotp(email, k);

		try {
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
					return new PasswordAuthentication("Enter admin EmailId", "password");
				}
			});

			// compose message
			MimeMessage message = new MimeMessage(session);

			message.setFrom(new InternetAddress("Enter admin EmailID"));// change accordingly

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			message.setSubject("OTP ");

			message.setText("Your OTP is :" + k);
			// send message
			Transport.send(message);
			System.out.println("message sent successfully");

		} catch (Exception e) {
			System.out.println(e);
		}

		LoginteacherDao dao = new LoginteacherDao();

		if (dao.check(email, pass)) {
			HttpSession session = req.getSession();
			session.setAttribute("email", email);
			res.setHeader("cache-control", "no-cache,no-store,must-revalidate");
			RequestDispatcher rd = req.getRequestDispatcher("OtpVerification.jsp");
			rd.include(req, res);
			// res.sendRedirect("");

		} else {

			// res.getWriter().println("Enter the Correctusername and password");
			res.setHeader("cache-control", "no-cache,no-store,must-revalidate");
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Invlaid Email or Password');");
			pw.println("</script>");
			RequestDispatcher rd = req.getRequestDispatcher("TeacherLogin.jsp");
			rd.include(req, res);

			// res.sendRedirect("TeacherLogin.jsp");

		}

	}
}
