/** 
ATM Machine Final Project ** 
@MonicaRestrepo */ 

package atm;

public class CheckingAccount extends BankAccount {
    private int transactionCount;
    private static final double transactionFees = 1.50; 
    private static final int freeTransactions = 5; 
    
    
    public CheckingAccount (double balance){
        super(balance);
        transactionCount = 0; 
    }
    public void deposit(double amount){
    transactionCount ++; 
    super.deposit(amount); 
    }
    
    public void withDraw(double amount){
    transactionCount ++; 
    super.withDraw(amount);
    }
    public void deductFees (){
    if (transactionCount > freeTransactions){
        double fees = transactionFees * (transactionCount - freeTransactions); 
        super.withDraw(fees);
    }
    transactionCount = 0; 
    }
}

