/** 
ATM Machine Final Project ** 
@MonicaRestrepo */ 

package atm;


public class User {
    
    //private int id = 222333111; 
    public String name;  
    public String lastName; 
    private  int dOB; 
    
    public User (String aName, String aLast){
        name = aName; 
        lastName = aLast; 
    }
     
      public String getName(){
          return name;   
      }
      
      public String getLastName(){
          return lastName; 
      }
       
       
      public String getUniqueKey(){
          String uniqueKey = name.substring(0,1) + name.substring(name.length() -1) + lastName.substring(0,1) + lastName.substring(lastName.length()-1); 
          return uniqueKey.toLowerCase(); 
      }
    
    
    
}
