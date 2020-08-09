package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connectionpool.DBUtil;

public class OtpInsert {
	String sql="insert into otpgen (EmailId,otpvalues) values(?,?)";
	public  void  insertotp(String EmailId,String otp)
	{
		
		
		try
		{
		Connection connection = DBUtil.getDataSource().getConnection();
		PreparedStatement st1= connection.prepareStatement(sql);
		st1.setString(1,EmailId);
		st1.setString(2,otp);
		st1.executeUpdate();
		System.out.println("inside i");
	
		}
		catch(Exception e)
		{
			
		}
		System.out.println("yes3");
		
		
	}

		
	}
	
