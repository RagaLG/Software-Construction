// Needed for JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
  This program demonstrates how to issue an SQL
  SELECT statement to a database using JDBC.
*/

public class ShowCoffeeDescriptions
{
   public static void main(String[] args)
   {
      final String url = "jdbc:mysql://localhost:3306/coffee";
      final String user = "root";
      final String password = "";
      
      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(url, user, password);
         
         // Create a Statement object.
         Statement stmt = conn.createStatement();
         
         // Create a string with a SELECT statement.
         String sqlStatement = "SELECT * FROM Coffee";
         //String sqlStatement = "SELECT Description FROM Coffee";

         // Send the statement to the DBMS.
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         // Display a header for the listing.
         System.out.println("Coffees Found in the Database");
         System.out.println("-----------------------------");
         
         // Display the contents of the result set.
         // The result set will have three columns.
         while (result.next())
         {
            //System.out.println(result.getString("Description"));
            System.out.println("Description: "+result.getString(1)+" ID: "+result.getString(2));
         }
         
         // Close the connection.
         conn.close();
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}
