package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connectionpool.DBUtil;

public class InsertvalueStudent {
	String sql1="insert into createaccnt(uname,pass,EmailId,org) values(?,?,?,?)";
	String sql2="insert into login values(?,?)";
	
	
	public int  insert(String uname,String pass,String Emailid,String Organization)  
	{
		
		try
		{
			
		Connection connection = DBUtil.getDataSource().getConnection();
		PreparedStatement st1= connection.prepareStatement(sql1);
		PreparedStatement st2= connection.prepareStatement(sql2);
		st1.setString(1,uname);
		st1.setString(2,pass);
		st1.setString(3,Emailid);
		st1.setString(4,Organization);
		st2.setString(1, Emailid);
		st2.setString(2, pass);
		int n=st1.executeUpdate();
		st2.executeUpdate();
		System.out.println("inside i");
		return n;
		}
		catch(Exception e)
		{
			
		}
		System.out.println("yes3");
		return 0 ;
		
	}

}
