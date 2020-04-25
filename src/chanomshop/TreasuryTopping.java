
package chanomshop;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TreasuryTopping {
    public static void main(String[] args) {
        topping();
        
       
        }

    private static void topping() {
        try(Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/topping", "apisara", "123");
            Statement stm = conn.createStatement()) {
            
            int row = stm("INSERT INTO topping VALUES(200, 'Bubble', 70)");
            System.out.println(row);
           
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     } 
}
        
    

