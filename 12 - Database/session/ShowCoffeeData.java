// Needed for JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
  This program displays all of the columns in the
  Coffee table of the CoffeeDB database.
*/

public class ShowCoffeeData
{
   public static void main(String[] args)
   {
      final String url = "jdbc:mysql://localhost:3306/coffee";
      final String user = "root";
      final String password = "";
      
      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(url,user,password);
         
         // Create a Statement object.
         Statement stmt = conn.createStatement();
         
         // Create a string with a SELECT statement.
         String sqlStatement = "SELECT * FROM Coffee";
         
         // Send the statement to the DBMS.
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         // Display the contents of the result set.
         // The result set will have three columns.
         while (result.next())
         {
            System.out.printf("%25s %10s %5.2f\n",
                              result.getString("Description"),
                              result.getString("ProdNum"),
                              result.getDouble("Price"));
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
