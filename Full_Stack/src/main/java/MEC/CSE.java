package MEC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CSE
{
	public static void main(String[] args) throws SQLException 
	{
//		create();
		insert();
//		read();
	}
	public static void create() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/mec";
		String un="root";
		String pw="Anukani@2908";
		String q="create table student_data (roll int,name varchar(10),mark int);";

		Connection c=DriverManager.getConnection(url, un, pw);	
		Statement s=c.createStatement();
		s.executeUpdate(q);
	}
	public static void insert() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/mec";
		String un="root";
		String pw="Anukani@2908";
		String i="insert into student_data value(3,'Aishu',100),(4,'Abii',95);";
		
		Connection c=DriverManager.getConnection(url, un, pw);	
		Statement s=c.createStatement();
		s.executeUpdate(i);
	}
	public static void read() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/mec";
		String un="root";
		String pw="Anukani@2908";
		String q = "select * from student_data;";
		
		Connection c=DriverManager.getConnection(url, un, pw);
		Statement s=c.createStatement();
		ResultSet rs = s.executeQuery(q);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
}