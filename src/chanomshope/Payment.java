package chanomshope;

import money.ChangeMoney;
import java.util.Scanner;

public class Payment {

    private ChangeMoney c1 = new ChangeMoney();

    public int addMoney(int total) {
        return c1.changeMoney(total);
        
    }

    public int getC1() {
        return c1.getChange();
    }
    
    
}
