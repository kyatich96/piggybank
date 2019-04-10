
package lab5q2;

/**
 *
 * @author kangw
 */
public class CheckingAccount extends Account {
    
    private double odl = 0;
    
    public CheckingAccount() {
    }
    
    public CheckingAccount(double odl){
        this.odl = odl;
    }

    public double getOdl() {
        return odl;
    }

    public void setOdl(double odl) {
        this.odl = odl;
    }

    @Override
    public String toString() {
        return super.toString() + ", CheckingAccount{" + "odl=" + odl + '}';
    }
    
    
}
