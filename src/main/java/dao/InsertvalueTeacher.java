package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connectionpool.DBUtil;

public class InsertvalueTeacher {
	String sql1="insert into createaccntteacher(Name,EmailId,Password,Age,gender) values(?,?,?,?,?)";
	//String sql2="insert into login values(?,?)";
	
	
	public int  insertteacher(String name,String EmailId,String Password,String age,String gender)  
	{
		
		try
		{
			
		Connection connection = DBUtil.getDataSource().getConnection();
		PreparedStatement st1= connection.prepareStatement(sql1);
		//PreparedStatement st2= connection.prepareStatement(sql2);
		st1.setString(1,name);
		st1.setString(2,EmailId);
		st1.setString(3,Password);
		st1.setString(4,age);
		st1.setString(5, gender);
		System.out.println("inside i");
		int n=st1.executeUpdate();
		
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
