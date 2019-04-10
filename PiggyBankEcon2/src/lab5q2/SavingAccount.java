
package lab5q2;

/**
 *
 * @author kangw
 */
public class SavingAccount extends Account {
    
    private double overdraw;
    
    public SavingAccount(){
        
    }
    
    public SavingAccount(double overdraw){
        this.overdraw = overdraw;
    }

    public double getOverdraw() {
        return overdraw;
    }

    public void setOverdraw(double overdraw) {
        this.overdraw = overdraw;
    }

    @Override
    public String toString() {
        return super.toString() + ", SavingAccount{" + "overdraw=" + overdraw + '}';
    }
    
    
}
