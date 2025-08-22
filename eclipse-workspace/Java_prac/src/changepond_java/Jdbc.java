package changepond_java;
import java.sql.Connection;


import java.sql.DriverManager;

import java.sql.SQLException;

public class Jdbc {

	  public static void main(String[] args) throws SQLException {
	    // TODO Auto-generated method stub

	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Database@123");

	    System.out.println("done");

	 

	  }



	}
 



