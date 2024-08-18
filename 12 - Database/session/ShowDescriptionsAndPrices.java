// Needed for JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
  This program displays the coffee descriptions
  and their prices.
*/

public class ShowDescriptionsAndPrices
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
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
         String sqlStatement = 
            "SELECT Description, Price FROM Coffee";
         
         // Send the statement to the DBMS.
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         // Display the contents of the result set.
         // The result set will have three columns.
         while (result.next())
         {
            System.out.println(
                              result.getString("Description")+ "  "+
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
