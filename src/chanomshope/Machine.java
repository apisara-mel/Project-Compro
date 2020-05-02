package chanomshope;

import java.util.Scanner;

public class Machine implements Interface {

    private Payment money = new Payment();
    private Product product = new Product();
    // private final Customer cus = new Customer("jj", "kl", 224);

    public void useMachine() {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Customer choose 1 || Manager choose 2 ");
            System.out.print("Select : ");
            num = sc.nextInt();
            System.out.println("------------------------------");

            if (num == 1) {

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

                do {
                    money.addMoney(product.getTotal());
                    System.out.println("------------------------------");
                    
                    if (product.getTotal() <= 0) {
                        System.out.println("Change : " + money.getC1() + " bath");
                    } 
                    
                    else if (product.getTotal() > 0) {
                        System.out.println("Pls ass money : " + money.getC1() + " bath");
                    }
                    
                } while (product.getTotal() > 0);

            } else if (num == 2) {
                
            }
        } while (num <= 0);

    }
}
