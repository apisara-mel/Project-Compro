package money;

import java.util.Scanner;

public class ChangeMoney {

    private int change;
    private int total;
    Scanner sc = new Scanner(System.in);
    private int momey = 0;

    public int changeMoney(int total) {
        this.total = total;

        do {

            int input = sc.nextInt();
            this.momey += input;
            if (this.momey < total) {
                System.out.println("------------------------------");
                System.out.println("[ remaining total paid : " + (total - this.momey) + " ]");
                System.out.println("Not Enough Money To Buy ");
                System.out.print("Please Insert Cash More : ");

            }

        } while (this.momey < total);

        change = this.momey - total;

        return this.change;

    }

    public int getChange() {
        return change;
    }

    public int getMomey() {
        return momey;
    }


}
