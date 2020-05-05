package money;

import java.util.Scanner;

public class ChangeMoney {

    private int change;
    private int total;
    private int momey = 0;
    Scanner sc = new Scanner(System.in);

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
                input = sc.nextInt();
                this.momey += input;
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
