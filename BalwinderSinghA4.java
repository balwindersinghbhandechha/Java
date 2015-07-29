public class BalwinderSinghA4{

  String id = "0" ;                 //a data field to store the ID for the account
  double currBalance = 0;            // data field to store the current balance of the account
  double currAnnualIntRate = 0;     // data field to store the interest rate 
  double monInterest = 0;

  //the no args constructor
  BalwinderSinghA4() {}
  
  //constructor creating an account with specified id and current balance
  BalwinderSinghA4(String newId, double newCurrBalance, double newAnnualIntRate){
  
  id = newId;
  currBalance = newCurrBalance;
  currAnnualIntRate = newAnnualIntRate;
  
  }

  //main method
  public static void main(String[] args) {
  
    BalwinderSinghA4 newAccount = new BalwinderSinghA4("1010", 5000.0, 2.5);
    newAccount.test();
     
  }
  
  //accessor methods for:
  //current balance
  
  public double getCurrBalance(){return currBalance;}
  
  //id
  public String getId(){return id;}
  
  //annual interest rate
  public double getAnnualIntRate(){return currAnnualIntRate;}
  
  //mutator methods for:
  // current balance 
 
  public void setCurrBalance(double bal){currBalance = bal;}
 
  //id
  public void setId(String id1){id = id1;}
  
  //annual interest rate
  public void setAnnualIntRate(double currAnnIntRate){currAnnualIntRate = currAnnIntRate;}
  
  //method that returns monthly interest rate in percentage
  public double monthlyRate(){
  
    double rate = currAnnualIntRate/12;
    return rate;
    
  } 
  
  //withdraw method
  public void withdraw(double draw){
    
  currBalance = currBalance - draw;
        
  }
  
  //deposit method
  public void deposit(double deposit){
  
  currBalance = currBalance + deposit; 
    
  }
  

  //test method
  public void test(){
    
      BalwinderSinghA4 newAccount = new BalwinderSinghA4("1010", 5000.0, 2.5);
    
      withdraw(1000);
      deposit(2000);
      
      monInterest = currBalance * currAnnualIntRate/1200;
  
      
    System.out.println("The monthly interest earned is: " + monInterest);
    System.out.println("The final balance is: $" + currBalance);
  }
  
  
  
  
  
  

}