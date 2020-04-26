
package chanomshope;


public class Topping {
    private int price;
    private String toppingName;
    private int count;

    public Topping(int price, String toppingName) {
        this.price = price;
        this.toppingName = toppingName;
    }

    public int getPrice() {
        return price;
    }

    public String getToppingName() {
        return toppingName;
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("Topping : ");
        buff.append(toppingName);
        buff.append("\t" + price + " bath");
        return buff.toString();
    }  
   
    public static void main(String[] args) {
        Topping t = new Topping(12, "bubble");
        
        System.out.println(t);
    }
}
