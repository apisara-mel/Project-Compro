
package chanomshope;

import money.ChangeMoney;
import java.util.Scanner;


public class Payment{
    private int total;
    private Product pd = new Product();

    
    public void addMoney(){
        int num;
        Scanner sc = new Scanner(System.in);
        do {
//            System.out.println("[ PAYMENT ]");
//            System.out.println("1. Cash");
//            System.out.println("2. Transfer");
//            System.out.print("Choose Payment [1 or 2] : ");

            num = sc.nextInt();
            System.out.println("------------------------------");
            System.out.println("total : "  + pd.getTotal() + " bath");
            System.out.println("------------------------------");

            if (num < 1 || num > 2) {
                System.out.println("!! Pls Select Number !!");
            } else if (num == 1) {
                System.out.print("Select Money : ");
                int money = sc.nextInt();
                ChangeMoney c1 = new ChangeMoney();
                System.out.println("------------------------------");
                c1.changeMoney(money, total);

            } else if (num == 2) {
                System.out.println("");
            }
        } while (num < 1 || num > 3);
    }
}
