package chanomshope;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class Payment {

    private int money;
    private int change;
    private int price;

    public Payment() {
    }

    public int changeMoney(int money) {
        try {
            if (money > price) {
                change = money - price;
                return change;
            } else if (money == price) {
                change = 0;
                return change;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return -1;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
  
}
