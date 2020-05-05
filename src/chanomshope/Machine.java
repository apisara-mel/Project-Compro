package chanomshope;

import InputOutput.Receipt;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Machine implements Interface {

    private Payment payment = new Payment();
    private Receipt receipt = new Receipt();
    private Customer cus;
    private Product product[];
    private int productCount;
    private int total;
    String name = null;
    String last = null;
    long phone;
    private boolean isMember;
    int discount = 0;

    public Machine() {
        this.cus = new Customer(name, last, phone);
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
                                this.isMember = true;
                                applyMember();
                            } else if (num <= 0 || num >= 3) {
                                System.out.println("!! Pls select 1 or 2 !!");
                            } else if (num == 2) {
                                if (productCount == 0) {
                                    System.out.println("------------------------------");
                                    System.out.print("Firstname : ");
                                    name = ss.nextLine();
                                    System.out.print("Lastname : ");
                                    last = ss.nextLine();
                                    System.out.print("Phone Number : ");
                                    this.phone = sc.nextLong();
                                    makeProduct();
                                }
                                break;
                            }
                    }
                } while (num <= 0 || num >= 3);
            } else if (select == 2) {

                this.isMember = true;
                if (productCount == 0) {
                    System.out.print("Firstname : ");
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
        whatDoYouWant();
    }

    @Override
    public void applyMember() {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.print("Firstname : ");
        name = sc.nextLine();
        System.out.print("Lastname : ");
        last = sc.nextLine();
        System.out.print("Phone Number : ");
        phone = ss.nextLong();
        try {
            makeProduct();
        } catch (IOException ex) {

        }

    }

    public void whatDoYouWant() throws IOException {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("What do you want?");
        System.out.println("1.Add Menu");
        System.out.println("2.Delete Menu");
        System.out.println("3.Payment");
        System.out.println("4.Exit");
        System.out.print("Select : ");
        num = sc.nextInt();
        do {
            switch (num) {
                case 1:
                    makeProduct();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 3:
                    caculate();
                    break;
                case 4:
                    break;
            }
            if (num < 1 || num > 4) {
                System.out.println("Pls select 1 or 2 : ");
            }
        } while (num < 1 || num > 4);
    }

    @Override
    public void deleteMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("[ Your Order ]");

        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                System.out.println((i + 1 + ". ") + product[i].getNameSelectFlavour() + "\n"
                        + product[i].getNameSelectTopping() + "\n"
                        + product[i].getSize());
            }
        }

        System.out.print("Select : ");
        int select = sc.nextInt();

        System.out.println("------------------------------");
        System.out.println(" Are you sure? ");
        System.out.println("[ YES 1 ]" + "\t" + "[ NO 2 ]");
        System.out.print("Select : ");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                this.product[select-1] = null;   
                break;
            case 2:
                break;
        }
        try {
            whatDoYouWant();
        } catch (IOException ex) {
            
        }

    }

    @Override
    public void caculate() throws IOException {
        cus = new Customer(name, last, phone + 'L');

        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                total += product[i].getTotal();
            }
        }

        System.out.println("------------------------------");
        System.out.println("Total : " + total + " bath");
        System.out.println("------------------------------");
        if(total == 0){
            whatDoYouWant();
        }
        
        System.out.println("[ PAYMENT ]");
        System.out.print("Insert Money : ");

        int change = payment.addMoney(total);
        
        if (isMember == true) {
            
            for (int i = 0; i < product.length; i++) {
                if(product[i]!=null){
               discount +=(product[i].getAmount()*10);
                }
            }
            System.out.println("Discount member "+ discount +" bath");
            change += discount;
        }
        System.out.println("------------------------------");
        
        if (change > 0) {
            System.out.println("Change : " + change + " bath");
        }
        payment.getReceipt(product, cus, change, payment, discount);
    }

}
