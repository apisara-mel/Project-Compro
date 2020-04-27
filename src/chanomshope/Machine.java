package chanomshope;

import java.util.Scanner;

public class Machine implements Interface {

//    private Flavour[] Flavour;
//    private Topping[] Topping;
//    private Customer[] Customer;
    private Size size;

    public String getSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[SIZE]");
        System.out.println("S" +"\t"+ "M" +"\t"+ "L");
        System.out.print("Choose size [1-3] : ");
        int sml = sc.nextInt();
        if (sml > 1 || sml < 3) {
            System.out.print("You choose size: ");
            switch(sml){
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
       return null;
    }

    
}
