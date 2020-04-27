
package chanomshope;


public class Customer extends Person {
    
    private long phonenum;
    private  memberType MemberType;
    private enum memberType{
        general,gold,platinum
    }
    

    public Customer(String firstname,String lastname,long phonenum) {
        super(firstname,lastname);
        this.phonenum=phonenum;
    }
    
    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }
    
//    public String getFirstName(){
//        return super(firstname);
//    }

    public memberType getMemberType() {
        return MemberType;
    }

    public void setMemberType(memberType MemberType) {
        this.MemberType = MemberType;
    }
    
    
}
