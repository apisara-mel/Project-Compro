
package Database;

import chanom.Topping;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ToppingDB {

    public static void main(String[] args) {
        Topping t1 = new Topping(10,"Bubble");
        insertTopping(1001,t1,100);
    }
    
        public static void insertTopping(int id,Topping t1,int gramm) {
        try(Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/topping ", "apisara", "123");
            Statement stm = conn.createStatement();) {
            
            stm.executeUpdate("INSERT INTO topping VALUES("+id+", '"+t1.getToppingName()+"',"+gramm+")");
            System.out.println("Sucessful");
            
           
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     }

    public String[] testSelectFromTopping() {
       try(Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/topping", "apisara", "123");
            Statement stm = conn.createStatement()) {
           int count = 0, i = 0;
           
            ResultSet toppingCount = stm.executeQuery("SELECT * FROM topping");
            while(toppingCount.next()){
                count++;
            } 
            String topping[] = new String[count];
            
            ResultSet toppingMenu = stm.executeQuery("SELECT * FROM topping");
            while(toppingMenu.next()){
                topping[i++] = toppingMenu.getString("");
            }
//            return topping;
//            System.out.print(toppingMenu.getInt("id_topping") + "\t");
//            System.out.print(toppingMenu.getString("name_topping") + "\t");
//            System.out.println(toppingMenu.getInt("qauntity") + " g.");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
}
