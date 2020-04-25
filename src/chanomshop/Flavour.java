
package chanomshop;


class Flavour {
    private String flavours;
    private int price;

    public Flavour(String flavours, int price) {
        if(flavours != null || price >0){
            this.flavours = flavours;
            this.price = price;
        }
        
    }
    
    public String getFlavour(){
        return flavours;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder f = new StringBuilder();
        f.append(flavours);
        f.append(price);
        return f.toString();
    }
    
    
}
