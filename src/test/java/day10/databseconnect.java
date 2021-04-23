package day10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import helper.ConnectDb;


public class databseconnect 
{
	public static void main(String args[]) throws Exception
	{
		Connection con;
		PreparedStatement ps1;
		ResultSet rs1;
		con=ConnectDb.dbconnect();
		String qu1="select * from courses";
		ps1=con.prepareStatement(qu1);
		rs1=ps1.executeQuery();
		System.out.println("COURSE DETAILS \n");
		while(rs1.next())
		{
			System.out.println("Course ID: "+rs1.getInt(1));
			System.out.println("Course Name: "+rs1.getString(2));
			System.out.println("Course Fees: "+rs1.getDouble(3));
			System.out.println();
		}
	}

}
