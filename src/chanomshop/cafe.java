
package chanomshop;

import enumChanom.topping;
import enumChanom.sweetness;
import enumChanom.size;
import enumChanom.flavour;


public class cafe {
    private flavour flavour;
    private topping tipping;
    private sweetness sweet;
    private size size;

    public void order(int delivery){
        if(delivery == 1){
            //ให้ทำงาน delivery
        }
        else if(delivery == 2){
            //ให้ทำงานสั่งกินหน้าร้าน
        }
        else{
            System.out.println("Pls select a number 1 or 2");
        }
    }

    @Override
    public String toString() {
        return "menu{" + '}';
    }
    
    
}
