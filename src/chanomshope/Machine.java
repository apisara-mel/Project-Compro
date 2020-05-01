package chanomshope;

import java.util.Scanner;

public class Machine implements Interface {

    private final Payment money = new Payment();
    private final Product product = new Product();
    private final Customer cus = new Customer("jj", "kl", 224);

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
                System.out.println("[ PAYMENT ]");
                System.out.print("Select Money : ");
                
            } else if (num == 2) {

            }
        } while (num <= 0);

    }
}
