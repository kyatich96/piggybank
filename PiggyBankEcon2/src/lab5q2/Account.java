
package lab5q2;
import java.util.*;

/**
 *
 * @author kangw
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private double amountIn;
    private double amountOut;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();
    
    public Account(){
    }
    
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setAmountIn(double amountIn) {
        this.amountIn = amountIn;
    }

    public void setAmountOut(double amountOut) {
        this.amountOut = amountOut;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest(){
        return balance * ((annualInterestRate / 12) / 100);
    }
    
    public void Withdraw(){
        balance = balance - amountOut;
    }
    
    public void Deposit(){
        balance = balance + amountIn;
    }

    //@Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", amountIn=" + amountIn + ", amountOut=" + amountOut + ", annualInterestRate=" + annualInterestRate + ", dateCreated=" + dateCreated + '}';
    }
    
    
}
