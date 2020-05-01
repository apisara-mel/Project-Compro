package chanomshope;

import money.ChangeMoney;
import java.util.Scanner;

public class Payment {

    private ChangeMoney c1 = new ChangeMoney();

    public void addMoney(int total) {

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        c1.changeMoney(money, total);
    }

    public int getC1() {
        return c1.getChange();
    }
    
    
}
