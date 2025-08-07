package MEC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student 
{
	//MAIN FUNCTION
	public static void main(String[] args) throws SQLException 
	{
//		create();
//		insert();
//		read();
//		insertFromUserRT1();
		insertFromUserRT2();
	}
	
	//CREATING TABLE
	public static void create() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/mec";
		String un = "root";
		String pw = "Anukani@2908";
		String q = "create table info(roll int,name varchar(20),dept varchar(10));";
		
		Connection c = DriverManager.getConnection(url, un, pw);
		Statement s = c.createStatement();
		s.executeUpdate(q);
	}
	
	//INSERTING VALUES INTO THE TABLE
	public static void insert() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/mec";
		String un = "root";
		String pw = "Anukani@2908";
		String i = "insert into info values(64,'Bruzz','CSE'),(50,'Aishu','AIDS'),(47,'Abi','ECE');";

		Connection c = DriverManager.getConnection(url, un, pw);
		Statement s = c.createStatement();
		s.executeUpdate(i);
	}
	
	//INSERTING VALUES FROM THE USER 
	public static void insertFromUserRT1() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/mec";
		String un = "root";
		String pw = "Anukani@2908";
		
		Connection c = DriverManager.getConnection(url, un, pw);
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++)
		{
			int roll_no = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String dept = sc.nextLine();
			String q = "insert into info values("+roll_no+",'"+name+"','"+dept+"');";
			s.execute(q);
		}
	}
	
	//INSERTING VALUES FROM THE USER using PREPARED STATEMENT
	public static void insertFromUserRT2() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/mec";
		String un = "root";
		String pw = "Anukani@2908";
		String q = "insert into info values(?,?,?);";
		
		Connection c = DriverManager.getConnection(url, un, pw);
		PreparedStatement ps = c.prepareStatement(q);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++)
		{
			int roll_no = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String dept = sc.nextLine();
			ps.setInt(1, roll_no);
			ps.setString(2, name);
			ps.setString(3, dept);
			ps.executeUpdate();
		}
	}
	
	//READING THE VALUES IN THE TABLE
	public static void read() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/mec";
		String un = "root";
		String pw = "Anukani@2908";
		String r = "select * from info;";
		
		Connection c = DriverManager.getConnection(url, un, pw);
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(r);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3));
		}
	}
}
