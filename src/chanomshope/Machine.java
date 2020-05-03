package chanomshope;

import InputOutput.Receipt;
import java.io.IOException;
import java.util.Scanner;

public class Machine implements Interface {

    private Payment payment = new Payment();
    private Product product = new Product();
    private Receipt receipt = new Receipt();
    Scanner sc = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);

    public void useMachine() throws IOException {
        int num;
        String name = null;
        String last = null;
        long phone = 0;
        Customer cus = new Customer(name, last, phone);

        System.out.print("Name : ");
        name = ss.nextLine();
        System.out.print("Lastname : ");
        last = ss.nextLine();
        System.out.print("Phone Number : ");
        phone = sc.nextLong();
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
//        System.out.println("Want to add menu?");
//        System.out.println("[YES 1]" + "\t" +"[NO 2]");
//        System.out.print("Select : ");
//        num = sc.nextInt();
//        
        System.out.println("------------------------------");
        System.out.println("Total : " + product.getTotal() + " bath");
        System.out.println("------------------------------");
        System.out.println("[ PAYMENT ]");
        System.out.print("Select Money : ");
        int change = payment.addMoney(product.getTotal());
        System.out.println("------------------------------");
        if (change > 0) {
            System.out.println("Change : " + change + " bath");
        }
        payment.getReceipt(product, cus, change, payment);
    }

}
