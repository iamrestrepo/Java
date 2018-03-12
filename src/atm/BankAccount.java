/** 
ATM Machine Final Project ** 
@MonicaRestrepo */ 


package atm;

public class BankAccount {
    public double balance; 
    public int accountNumber = 333220; 
    public User user;  
    
    public BankAccount(double balance){
        this.balance = 0; 
    }
    
    public BankAccount(double balance, User user){  
        this.balance = balance;
        this.user = user; 
  
    }
    
    public void accountNumber(){
        accountNumber++;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public void deposit (double amount){
        balance += amount; 
    }
    
    public void withDraw(double amount) {
        balance -= amount;  
    }
    
    public double getBalance (){
        return balance;  
    }
    
    public void transfer( BankAccount other,double amount){
        withDraw(amount);
        other.deposit(amount); 
    }
          
    
}
    
