package chanomshope;

import InputOutput.Receipt;
import java.io.IOException;
import java.util.Scanner;

public class Machine implements Interface {

    private Payment money = new Payment();
    private Product product = new Product();
    private Receipt receipt = new Receipt();
    Scanner sc = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);
    
    public void useMachine() throws IOException {
       String name = ss.nextLine();
       String last = ss.nextLine();
       long number = sc.nextLong();
       Customer cus = new Customer(name, last, number);
        
        System.out.println("Name : " + cus.getFirstname());
        System.out.println("------------------------------");
        System.out.println("[ FLAVOUR ]");
        product.addFlavour();
        System.out.println("------------------------------");
        System.out.println("[ TOPPING ]");
        product.addTopping();
        System.out.println("------------------------------");
        System.out.println("[SIZE]");
        System.out.println("S" + "\t" + "M" + "\t" + "L");
        System.out.print("Choose size [1-3] : ");
        product.addSize();
        System.out.println("------------------------------");
        System.out.print("Amount : ");
        product.addAmount();
        System.out.println("------------------------------");
        System.out.println("Total : " + product.getTotal() + " bath");
        System.out.println("------------------------------");
        System.out.println("[ PAYMENT ]");
        System.out.print("Select Money : ");

       
            
            int change = money.addMoney(product.getTotal());
            System.out.println("------------------------------");

            if (change > 0) {
                System.out.println("Change : " + money.getC1() + " bath");
            } 

        
       // receipt.writeReciept(product);
    }
    
    
}
