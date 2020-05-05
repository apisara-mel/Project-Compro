
package chanom;


public class Flavour {
    private String flavourName;
    private int price;

    public Flavour(String flavourName, int price) {
        this.flavourName = flavourName;
        this.price = price;
    }

    public String getFlavourName() {
        return flavourName;
    }

    public int getPrice() {
        return price;
    }
//
//    @Override
//    public String toString() {
//        StringBuffer buff = new StringBuffer();
//        buff.append("Flavour : ");
//        buff.append(flavourName);
//        buff.append("\t" + price + " bath");
//        return buff.toString();
//    }
}
