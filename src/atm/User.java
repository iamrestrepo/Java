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
        //id = anIDNumber;   // can i really include this here?  
        //dOB = dayOfBirth; 
    
    }
     
      public String getName(){
          return name;   
      }
      
      public String getLastName(){
          return lastName; 
      }
      
//      
//       public int  getId(){
//        return id++; 
//    }
      
//      public void dOB(int dOB){
//          this.dOB = dOB; 
//      }
//      
//       public int getDOB(){
//           return dOB; 
//       }
//    
       
      public String getUniqueKey(){
          String uniqueKey = name.substring(0,1) + name.substring(name.length() -1) + lastName.substring(0,1) + lastName.substring(lastName.length()-1); 
          return uniqueKey.toLowerCase(); 
      }
    
    
    
}
