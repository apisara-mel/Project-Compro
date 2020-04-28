package chanomshope;

import java.util.Scanner;

public class Machine implements Interface {

    private Flavour[] flavour;
    private Topping[] topping;
    private Customer[] customer;
    private Size size;
    private Payment payment;
    private int total;

    public void useMachine(){
        int countArray = 0;
        flavour = new Flavour[7];
        
        flavour[0] = new Flavour("Milk Tea", 75);
        flavour[1] = new Flavour("Red Ruby", 95);
        flavour[2] = new Flavour("Black Honey", 95);
        flavour[3] = new Flavour("Dark Chocolate",100);
        flavour[4] = new Flavour("Matcha Mouse", 100);
        flavour[5] = new Flavour("Honey Lime Mousse", 110);
        flavour[6] = new Flavour("Caramel Coffee", 125);
         
        for(int i = 0; i<flavour.length; i++){
            countArray++;
        }
        
        System.out.println("[ FLAVOUR ]");
        
        for(int i=0; i<flavour.length; i++){
            System.out.println((i+1 +" : ") + flavour[i].getFlavourName());
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("You Choose Flavour [1-" +countArray +"] : ");
        int input = sc.nextInt();
        
        if(input > countArray || input < 1){
            do{
                System.out.println("! Please Selecte Number Agian !");
                System.out.print("You Choose Flavour [1-" +countArray +"] : ");
                input = sc.nextInt();
            }while(input>countArray || input<1);
        }
   
        System.out.println("You Choose : " + flavour[input-1].getFlavourName());
        this.total += flavour[input - 1].getPrice();
        
        //-------------------------------------------------------------------------//
        
        int topArray = 0;
        topping = new Topping[5];
        
        topping[0] = new Topping("Bubble", 20);
        topping[1] = new Topping("Jelly Juice", 20);
        topping[2] = new Topping("Pudding", 25);
        topping[3] = new Topping("Honey Drop", 30);
        topping[4] = new Topping("Mousse", 50);
        
        for(int i = 0; i<topping.length; i++){
            topArray++;
        }
        
        System.out.println("[ TOPPING ]");
        
        for(int i=0; i<topping.length; i++){
            System.out.println((i+1 +" : ") + topping[i].getToppingName());
        }
        
        System.out.print("You Choose Topping [1-" +topArray +"] : ");
        int selecte = sc.nextInt();
        
        if(selecte > topArray || selecte < 1){
            do{
                System.out.println("! Please Selecte Number Agian !");
                System.out.print("You Choose Flavour [1-" +topArray +"] : ");
                selecte = sc.nextInt();
            }while(selecte > topArray || selecte < 1);
        }
   
        System.out.println("You Choose : " + topping[selecte-1].getToppingName());
        this.total += topping[selecte - 1].getPrice();
        
        //-------------------------------------------------------------------------//
        
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
                        this.total = total + 15;
                        break;
                    case 2:
                        System.out.println(Size.M);
                        this.total = total + 25;
                        break;
                    case 3:
                        System.out.println(Size.L);
                        this.total = total + 30;
                        break;
                       
                }
            }
        }while(sml < 1 || sml > 3);
        
        //--------------------------------------------------------------------//
        
        System.out.println("total : " + total + "bath");
        System.out.println("-----------------------");
        
        
        System.out.print("select money : ");
        int money = sc.nextInt();
        System.out.println(payment.changeMoney(money));
        
        
    }
 
}
