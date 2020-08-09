package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connectionpool.DBUtil;
public class LoginteacherDao
{
	String sql="select * from createaccntteacher where EmailId=? and Password=?";	
	public boolean check(String email,String pass) 
	{
		try
		{
		Connection connection = DBUtil.getDataSource().getConnection();
		PreparedStatement st= connection.prepareStatement(sql);
		st.setString(1, email);
		st.setString(2, pass);
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
