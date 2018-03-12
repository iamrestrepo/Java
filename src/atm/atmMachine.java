/** 
ATM Machine Final Project ** 
@MonicaRestrepo */ 


package atm;

import java.util.Scanner; 
import java.io.*; 

public class atmMachine {
     
    
    public static void main(String [] args) throws IOException, InterruptedException  {
        
      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(ir); 
        
        User user1 = new User("Thomas", "Jack"); 
        BankAccount bankAcUser1 = new BankAccount(1000,user1);
        BankAccount bankAcUser2 = new BankAccount(200);
        System.out.println("This is your UniqueKey : " + user1.getUniqueKey()); 
 
       
        
        Scanner inputWelcomeScreen = new Scanner(System.in);  
        System.out.println("Welcome to your ATM Machine.Please enter your account number to start"); 
        int accountNumber = inputWelcomeScreen.nextInt(); 
        System.out.println("The account number entered was : " + accountNumber);
        Scanner accountUniqueKey = new Scanner(System.in); 
        
        int attempts = 1; 
         int option = 1;
        
        
        while (attempts < 3){

            System.out.println("Please Enter your Unique Key"); 
            String Ukey = accountUniqueKey.next(); 

            if (Ukey.equals(user1.getUniqueKey())){
                System.out.println("You have accessed your account. What would you like to do?");
                System.out.println(); 
                System.out.println(); 
                System.out.println("\t\t" + "1) Deposit money"); 
            
                System.out.println("\t\t" + "2) Withdraw money");
                
                System.out.println("\t\t" + "3) Transfer to another account"); 
              
                System.out.println("\t\t" + "4) See my account's Balance"); 
                
                System.out.println("\t\t" + "5) Quit"); 
                System.out.println(); 
                System.out.print(" Enter Option [1-5]: ");
                break; 
            } else {
                System.out.println("Failure to access account " + accountNumber);
                attempts ++; 
            }
        }
        
         option = Integer.parseInt(br.readLine()); 
         Scanner userInput = new Scanner(System.in); 
         switch(option){
         
             case 1: 
                 System.out.println("How much would you like to deposit?");
                 double amount = userInput.nextDouble();
                 bankAcUser1.deposit(amount); 
                 System.out.println("You have deposited " + amount);
                 System.out.println("Your new Balance is " +  bankAcUser1.getBalance());
                   System.out.println();
                   System.out.println();
                 System.out.println("Thank you, " + user1.getName() + "! ");
                 break; 
             
             case 2: 
                 boolean checkpoint = false; 
                 attempts = 1; 
                 while (true && (attempts <= 3)) { 
                    System.out.println("How much would you like to withdraw ? "); 
                    amount = userInput.nextDouble(); 
                    if (attempts == 3){
                     System.out.println("You have exceed your attempts, your account will be blocked for security reasons. Please contact your bank. ");
                     break;
                    } else if (amount > bankAcUser1.getBalance()){
                    System.out.println("The selected amount exceeds your balance. Please try another amount");
                    checkpoint = true; 
                    attempts ++; 
                    
                    } else {
                    bankAcUser1.withDraw(amount);
                    System.out.println("You have withdrew " + amount);
                    System.out.println("Your new Balance is " +  bankAcUser1.getBalance());
                    System.out.println();
                    System.out.println();
                    System.out.println("Thank you, " + user1.getName() + "! ");
                    break; 
                    }
  
                }
                 break;
                
             case 3:
                 
                 System.out.println("Enter the account you would like to transfer money to : "); 
                 String accountName = userInput.next(); 
                 boolean checkTransfers = false; 
                 attempts = 1; 
                 while (true && (attempts <= 3)) { 
                    System.out.println("Please enter the amount to transfer to " + accountName);
                     amount = userInput.nextDouble(); 
                    if (attempts == 3){
                     System.out.println("You have exceed your attempts, your account will be blocked for security reasons. Please contact your bank. ");
                     break;
                    } else if (amount > bankAcUser1.getBalance()){
                    System.out.println("The selected amount exceeds your balance. Please try another amount");
                    checkpoint = true; 
                    attempts ++; 
                    
                    } else {
                    bankAcUser1.transfer(bankAcUser2, amount);
                    System.out.println("You have transfered " + amount + " to " + accountName);
                    System.out.println("Your new Balance is " +  bankAcUser1.getBalance());
                    System.out.println();
                   System.out.println();
                    System.out.println("Thank you, " + user1.getName() + "! ");
                    break; 
                    }
                 }
                 break;

             case 4:
                 System.out.println("Your Account Information: ");
                 System.out.println("User Name : " + user1.getName() + " " + user1.getLastName()); 
                 System.out.println("Your current balance for the account " + bankAcUser1.getAccountNumber() + " is : " + bankAcUser1.getBalance());
                 System.out.println();
                 System.out.println();
                 System.out.println("Thank you, " + user1.getName() + "! ");
                 break;
             case 5: 
                 break; 
         
         }
   
    }
}
