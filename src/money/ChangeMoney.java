package money;

public class ChangeMoney {

    private int money;
    private int change;
    private int price;

    public ChangeMoney() {
    }

    public int changeMoney(int money, int total) {
        this.price = total;
        try {
            if (money > price) {
                change = money - price;
                
            } else if (money == price) {
                change = 0;
                
            }
            System.out.println("change : " + change + " bath");
            return change;
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
