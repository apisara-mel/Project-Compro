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
//            System.out.println("change : " + change + " bath");
            return this.change;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return -1;
    }

    public int getChange() {
        return change;
    }


    
  
}
