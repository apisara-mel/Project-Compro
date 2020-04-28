package chanomshope;

import java.util.Scanner;

public class Machine implements Interface {

    private Flavour[] flavour;
    private Topping[] topping;
    private Customer[] customer;
    private Size size;
    private int total = 0;

    public Flavour getFlavour() {
        Scanner sc = new Scanner(System.in);
        int f;
        
        do {
            System.out.println("[FLAVOUR]");
            System.out.println("Coco" + "\t" + "M" + "\t" + "L");
            System.out.print("Choose size [1-3] : ");
            
            f = sc.nextInt();
            
            if(f < 1 || f > 3){
                System.out.println("!! INCORRECT !!");
            }
            
            else if (f > 0 || f < 4) {
            System.out.print("You choose size: ");    
                
                switch (f) {
                    case 1:
                        System.out.println(Size.S);
                        break;
                    case 2:
                        System.out.println(Size.M);
                        break;
                    case 3:
                        System.out.println(Size.L);
                        break;
                }
            }
        }while(f < 1 || f > 3);
        
        for (int i = 0; i < flavour.length; i++) {
            Flavour[] fl = new Flavour[10]; 
            
        }
        return flavour[2];
    }

    public Topping[] getTopping() {
        return topping;
    }
    

    public void getSize() {
        Scanner sc = new Scanner(System.in);
        int sml;
        do {
            System.out.println("[SIZE]");
            System.out.println("S" + "\t" + "M" + "\t" + "L");
            System.out.print("Choose size [1-3] : ");
            
            sml = sc.nextInt();
            
            if(sml < 1 || sml > 3){
                System.out.println("!! INCORRECT !!");
            }
            
            else if (sml > 0 || sml < 4) {
            System.out.print("You choose size: ");    
                
                switch (sml) {
                    case 1:
                        System.out.println(Size.S);
                        break;
                    case 2:
                        System.out.println(Size.M);
                        break;
                    case 3:
                        System.out.println(Size.L);
                        break;
                }
            }
        }while(sml < 1 || sml > 3);
    }
    public static void main(String[] args) {
        Flavour[] flavourTemp = new Flavour[2];
        flavourTemp[0] = new Flavour("iceTea",10);
        flavourTemp[1] = new Flavour("GreenTea",20);
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        System.out.println(flavourTemp[result].getFlavourName());
        System.out.println(flavourTemp[result].getPrice());
    }
}
