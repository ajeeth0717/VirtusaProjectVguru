package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connectionpool.DBUtil;

public class CheckDao {
	    String sql="select * from createaccnt where EmailId=?";
	public boolean  check(String email)
	{
		
			try
			{
			Connection connection = DBUtil.getDataSource().getConnection();
			PreparedStatement st= connection.prepareStatement(sql);
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
			
				return true;
			}
			
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			
			return false;
			
		}
}
