
package lab5q2;

/**
 *
 * @author kangw
 */
public class Lab5q2 {
    
    public static void AcctObj1(){
        Account Account = new Account();
        Account.setId(1122);
        Account.setBalance(20000);
        Account.setAnnualInterestRate(4.5);
        Account.setAmountOut(2500);
        //Togo.setDateCreated();
        Account.Withdraw();
        Account.setAmountIn(3000);
        Account.Deposit();
        System.out.println(Account);
       
    }
    
    public static void CheckObj2(){
        CheckingAccount Check = new CheckingAccount();
        Check.setId(3344);
        Check.setBalance(50000);
        Check.setAnnualInterestRate(5);
        Check.setOdl(45000);
        System.out.println(Check);
    }
    
    public static void SaveObj3(){
        SavingAccount Save = new SavingAccount();
        Save.setId(5566);
        Save.setBalance(100000);
        Save.setAnnualInterestRate(7.5);
        Save.setOverdraw(100000);
        System.out.println(Save);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AcctObj1();
        CheckObj2();
        SaveObj3();
    }
    
}
