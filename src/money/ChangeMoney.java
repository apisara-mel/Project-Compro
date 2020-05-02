package money;

import java.util.Scanner;

public class ChangeMoney {

    private int change;
    private int total;
    Scanner sc = new Scanner(System.in);

    public int changeMoney(int total) {
        this.total = total;
        int money = 0;

        do {
            System.out.print("Pls add money : ");
            int input = sc.nextInt();
            
            money += input;

        } while (money < total);

        change = money - total;

        return this.change;

    }

    public int getChange() {
        return change;
    }

}
