
package chanom;


public class Topping {
    private int price;
    private String toppingName;
    private int count;

    public Topping(String toppingName, int price) {
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
   

}
