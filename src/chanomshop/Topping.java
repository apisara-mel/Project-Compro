
package chanomshop;


class Topping {
    private String toppings;
    private int price;

    public Topping(String toppings, int price) {
        this.toppings = toppings;
        this.price = price;
    }

    public String getToppings() {
        return toppings;
    }

    public int getPrice() {
        return price;
    }
    

    @Override
    public String toString() {
        StringBuilder t = new StringBuilder();
        t.append(toppings);
        t.append(price);
        return t.toString();
    }
    
    
}
