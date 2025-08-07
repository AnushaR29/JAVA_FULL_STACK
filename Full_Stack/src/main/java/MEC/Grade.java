package MEC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Grade {


		//MAIN FUNCTION
		public static void main(String[] args) throws SQLException 
		{
//			create();
			read();
//			insertFromUser();
		}
		
		//CREATING TABLE
		public static void create() throws SQLException
		{
			String url = "jdbc:mysql://localhost:3306/mec";
			String un = "root";
			String pw = "Anukani@2908";
			String q = "create table score(roll int,name varchar(20),mark int);";
			
			Connection c = DriverManager.getConnection(url, un, pw);
			Statement s = c.createStatement();
			s.executeUpdate(q);
		}
		
		//INSERTING VALUES
		public static void insertFromUser() throws SQLException
		{
			String url = "jdbc:mysql://localhost:3306/mec";
			String un = "root";
			String pw = "Anukani@2908";
			String q = "insert into score values(?,?,?);";
			
			Connection c = DriverManager.getConnection(url, un, pw);
			PreparedStatement ps = c.prepareStatement(q);
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i = 1;i <= n;i++)
			{
				int roll_no = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				int mark = sc.nextInt();
				sc.nextLine();
				ps.setInt(1, roll_no);
				ps.setString(2, name);
				ps.setInt(3, mark);
				ps.executeUpdate();
			}
		}
		
		//READING
		public static void read() throws SQLException 
		{
			String url = "jdbc:mysql://localhost:3306/mec";
			String un = "root";
			String pw = "Anukani@2908";
			String q = "select name,mark from score order by mark desc limit 3;";
			
			Connection c = DriverManager.getConnection(url, un, pw);
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(q);
			while(rs.next())
			{
				String name = rs.getString(1);
				int mark = rs.getInt(2);
				if(mark>=90 && mark<=100) 
				{
					System.out.println(name +"-"+"A grade");
				}
				else if(mark>=80 && mark<=89) 
				{
					System.out.println(name +"-"+"B grade");
				}
				else if(mark>=70 && mark<=79) 
				{
					System.out.println(name +"-"+"C grade");
				}
				else
				{
					System.out.println(name +"-"+"Fail");
				}
			}
			
		}
		
}
