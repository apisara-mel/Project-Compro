
package chanomshope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ToppingDB {
    public static void main(String[] args) {
        Topping();
        testSelectFromTopping();
    }
    
        private static void Topping() {
        try(Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/topping ", "apisara", "123");
            Statement stm = conn.createStatement();) {
            
            int row = stm.executeUpdate("INSERT INTO topping VALUES(30015, 'Bubble', 500)");
            System.out.println(row);
           
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     }

    private static void testSelectFromTopping() {
       try(Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/topping", "apisara", "123");
            Statement stm = conn.createStatement()) {
            ResultSet top_rs = stm.executeQuery("SELECT * FROM topping");
            while(top_rs.next()){
                System.out.print(top_rs.getInt("id_topping") + "\t");
                System.out.print(top_rs.getString("name_topping") + "\t");
                System.out.println(top_rs.getInt("qauntity") + " g.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
