package chanomshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TreasuryTopping {

    public static void main(String[] args) {
        countTopping();
        testTopping();
    }

    private static void countTopping() {
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/topping", "apisara", "123");
                Statement stm = con.createStatement();) {
            int row = stm.executeUpdate("INSERT INTO topping VALUES(30105, 'Bubble', 300)");
            System.out.println(row);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void testTopping() {
        try(Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/topping", "apisara", "123");
            Statement stm = conn.createStatement()) {
            ResultSet count_rs = stm.executeQuery("SELECT * FROM topping");
            while(count_rs.next()){
                System.out.print(count_rs.getInt("id_topping") + "\t");
                System.out.print(count_rs.getString("name") + "\t");
                System.out.println(count_rs.getInt("counttopping") + " g.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    

}
