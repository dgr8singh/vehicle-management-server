package com.example.track;

import java.sql.*;

public class Dao {
private static Connection con;
public static Connection getCon(){
	try{
		Class.forName("com.mysql.jdbc.Driver"); 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/track","root","Ankitsingh@95");
	}catch (Exception e) { 
		System.out.println(e+" IN Dao");
	}
	return con;
}
/*
 ****** soltuion for *******
 ****java.lang.ClassNotFoundException:  com.mysql.jdbc.Driver*******
 *
 *
 *
 * 1) Right click your project folder and open up Properties.

2) From the right panel, select Java Build Path then go to Libraries tab.

3) Select Add External JARs to import the mysql driver.

4) From the right panel, select Deployment Assembly.

5) Select Add..., then select Java Build Path Entries and click Next.

6) You should see the sql driver on the list. Select it and click first.

And that's it! Try to run it again! Cheers!
*/
public static void main(String args[]){  
try{  
Statement stmt=getCon().createStatement();  
ResultSet rs=stmt.executeQuery("select * from driver");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ 
	System.out.println(e+" here");
	}  
}  
}
