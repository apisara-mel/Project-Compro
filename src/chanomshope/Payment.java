package chanomshope;

import InputOutput.Receipt;
import java.io.IOException;
import money.ChangeMoney;

public class Payment {

    private ChangeMoney c = new ChangeMoney();
    private Receipt receipt = new Receipt();
      
    public int addMoney(int total) {
        return c.changeMoney(total);
    }

    public int getChange() {
        return c.getChange();
    }
    
    public int getTotal(){
        return c.getMomey();
    }

    public void getReceipt(Product[] pd, Customer ct, int change, Payment pm) throws IOException {
        receipt.writeReciept(pd, ct, change, pm);
    }


    
}
