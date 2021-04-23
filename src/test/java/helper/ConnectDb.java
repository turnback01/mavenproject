package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDb 
{
	public static Connection dbconnect()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","Kushal_1998");
		}
		catch(Exception e)
		{
		System.out.println("CONNECTION FAILED"+e);	
		}
		
		return con;
	}

}
