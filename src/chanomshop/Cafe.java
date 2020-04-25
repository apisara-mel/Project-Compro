package chanomshop;



public class Cafe {

    private Flavour flavour[];
    private int arrayFlavour = 0;
    private int countFlavour = 0;
    private Topping topping[];
    private int arrayTopping = 0;
    private int countTopping = 0;
    private Size size;
    private int normalPrice;
    
    

    public boolean addFlavour(String flavours, int price) {
        if (flavours != null || price > 0) {
            ++arrayFlavour;
            Flavour temp[] = flavour;
            flavour = new Flavour[arrayFlavour];
            for(int i=0; i< flavour.length-1; i++){
                flavour[i] = temp[i];
            }
            flavour[countFlavour++] = new Flavour(flavours, price);
        }
        return false;    
    }
     
    public boolean addTopping(String toppings, int price){
        if(toppings != null || price > 0){
            ++arrayTopping;
            Topping temp[] = topping;
            topping = new Topping[arrayTopping];
            for(int i=0; i<topping.length-1; i++){
                topping[i] = temp[i];
            }
            topping[countTopping++] = new Topping(toppings, price);
        }
        return false;
    }
    
    
}
