 package chanomshope;

import chanom.Flavour;
import chanom.Topping;
import java.util.Scanner;
import chanom.Size;

public class Product {

    private Flavour[] flavour;
    private Topping[] topping;
    private int[] item;
    private Size size;
    private int total;
    int amount;
    private Flavour selectFlavour;
    private Topping selectTopping;
    Scanner sc = new Scanner(System.in);

    public String getNameSelectFlavour() {
        return selectFlavour.getFlavourName();
    }
    
    public String getNameSelectTopping() {
        return selectTopping.getToppingName();
    }
    
    
    public int getTotal() {
        return total;
    }

    public int getAmount() {
        return amount;
    }

    public Flavour[] getFlavour() {
        return flavour;
    }

    public Topping[] getTopping() {
        return topping;
    }

    public Size getSize() {
        return size;
    }

    public int[] getItem() {
        return item;
    }
    
    public void addFlavour() {
        int countArray = 0;
        flavour = new Flavour[7];

        flavour[0] = new Flavour("Milk Tea", 75);
        flavour[1] = new Flavour("Red Ruby", 95);
        flavour[2] = new Flavour("Black Honey", 95);
        flavour[3] = new Flavour("Dark Chocolate", 100);
        flavour[4] = new Flavour("Matcha Mouse", 100);
        flavour[5] = new Flavour("Honey Lime Mousse", 110);
        flavour[6] = new Flavour("Caramel Coffee", 125);

        for (int i = 0; i < flavour.length; i++) {
            countArray++;
        }

        for (int i = 0; i < flavour.length; i++) {
            System.out.println((i + 1 + " : ") + flavour[i].getFlavourName());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("You Choose Flavour [1-" + countArray + "] : ");
        int input = sc.nextInt();

        if (input > countArray || input < 1) {
            do {
                System.out.println("! Please Selecte Number Agian !");
                System.out.print("You Choose Flavour [1-" + countArray + "] : ");
                input = sc.nextInt();
            } while (input > countArray || input < 1);
        }

        System.out.println("You Choose : " + flavour[input - 1].getFlavourName());
        this.total += flavour[input - 1].getPrice();
        selectFlavour = flavour[input - 1];
    }

    public void addTopping() {
        int topArray = 0;
        Scanner sc = new Scanner(System.in);
        topping = new Topping[5];

        topping[0] = new Topping("Bubble", 20);
        topping[1] = new Topping("Jelly Juice", 20);
        topping[2] = new Topping("Pudding", 25);
        topping[3] = new Topping("Honey Drop", 30);
        topping[4] = new Topping("Mousse", 50);

        for (int i = 0; i < topping.length; i++) {
            topArray++;
        }

        for (int i = 0; i < topping.length; i++) {
            System.out.println((i + 1 + " : ") + topping[i].getToppingName());
        }

        System.out.print("You Choose Topping [1-" + topArray + "] : ");
        int selecte = sc.nextInt();

        if (selecte > topArray || selecte < 1) {
            do {
                System.out.println("! Please Selecte Number Agian !");
                System.out.print("You Choose Flavour [1-" + topArray + "] : ");
                selecte = sc.nextInt();
            } while (selecte > topArray || selecte < 1);
        }

        System.out.println("You Choose : " + topping[selecte - 1].getToppingName());
        this.total += topping[selecte - 1].getPrice();
        selectTopping = topping[selecte - 1];
        // System.out.println("------------------------------");
    }

    public void addSize() {
        int sml;
        
        do {

            sml = sc.nextInt();

            if (sml < 1 || sml > 3) {
                System.out.println("!! INCORRECT !!");
            } else if (sml > 0 || sml < 4) {
                System.out.print("You choose size: ");

                switch (sml) {
                    case 1:
                        System.out.println(Size.S);
                        this.total = total + 15;
                        size = Size.S;
                        break;
                    case 2:
                        System.out.println(Size.M);
                        this.total = total + 25;
                        size = Size.M;
                        break;
                    case 3:
                        System.out.println(Size.L);
                        this.total = total + 30;
                        size = Size.L;
                        break; 

                }
            }
        } while (sml < 1 || sml > 3);
    }

    public void addAmount() {
        amount = sc.nextInt();

        if (amount > 0) {
            this.total = total * amount;
        }
    }
    
    public void arrayItem(){
        int itemArray = 0;
        
        for (int i = 0; i < item.length; i++) {
            itemArray++;
        }
        
        for(int i = 0; i< item.length; i++){
            item = flavour.getFlavourName()+ topping.getToppingName() + size;
        }
        
        
    }
    
    
}
