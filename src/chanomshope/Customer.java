
package chanomshope;

import customer.Person;

public class Customer extends Person {
    private long phonenum;
   
    public Customer(String firstname,String lastname, long phone) {       
        super(firstname,lastname); 
        this.phonenum = phone;
             
    }
    
    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }
}
