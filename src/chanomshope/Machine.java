package chanomshope;

import InputOutput.Receipt;
import java.io.IOException;
import java.util.Scanner;

public class Machine implements Interface {

    private Payment payment = new Payment();
    private Receipt receipt = new Receipt();
    private Product product[];
    private int productCount;
    private int total;
    String name = null;
    String last = null;
    long phone;

    public Machine() {
        product = new Product[10];
    }

    @Override
    public void useMachine() throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        int select;
        int num = 0;

        do {
            System.out.println("[ Type Customer ]");
            System.out.println("1.General" + "\t" + "2.Member");
            System.out.print("Select : ");
            select = sc.nextInt();

            if (select >= 3 || select <= 0) {
                System.out.println("!! Pls select 1 or 2 !!");
                System.out.println("------------------------------");
            } else if (select == 1) {
                do {
                    switch (select) {
                        case 1:
                            System.out.println("------------------------------");
                            System.out.println("Do you want to register?");
                            System.out.println("[ YES 1 ]" + "\t" + "[ NO 2 ]");
                            System.out.print("Select : ");
                            num = sc.nextInt();

                            if (num == 1) {
                                applyMember();
                            } else if (num <= 0 || num >= 3) {
                                System.out.println("!! Pls select 1 or 2 !!");
                            }
                            break;
                    }
                } while (num <= 0 || num >= 3);

            } else if (select == 2) {
                if (productCount == 0) {
                    System.out.print("Fristname : ");
                    name = ss.nextLine();
                    System.out.print("Lastname : ");
                    last = ss.nextLine();
                    System.out.print("Phone Number : ");
                    this.phone = sc.nextLong();
                    makeProduct();
                }

            }

        } while (select >= 3 || select <= 0);
    }

    private void makeProduct() throws IOException {
        Product product = new Product();

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
        this.product[productCount++] = product;
        wantAddMenu();
    }

    private void applyMember() {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.print("Fristname : ");
        name = sc.nextLine();
        System.out.print("Lastname : ");
        last = sc.nextLine();
        System.out.println("Phone Number : ");
        phone = ss.nextLong();

    }

    public void wantAddMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Want to add menu?");
        System.out.println("[ YES 1 ]" + "\t" + "[ NO 2 ]");
        System.out.print("Select : ");
        num = sc.nextInt();
        do {
            switch (num) {
                case 1:
                    useMachine();
                    break;
                case 2:
                    break;
            }
            if (num <= 0 || num >= 3) {
                System.out.println("Pls select 1 or 2 : ");
            }
        } while (num <= 0 || num >= 3);
    }

    @Override
    public void caculate() throws IOException {
        Customer cus = new Customer(name, last, phone + 'L');

        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                total += product[i].getTotal();
            }
        }

        System.out.println("------------------------------");
        System.out.println("Total : " + total + " bath");
        System.out.println("------------------------------");
        System.out.println("[ PAYMENT ]");
        System.out.print("Select Money : ");
        int change = payment.addMoney(total);
        System.out.println("------------------------------");
        if (change > 0) {
            System.out.println("Change : " + change + " bath");
        }
        payment.getReceipt(product, cus, change, payment);
    }

}
