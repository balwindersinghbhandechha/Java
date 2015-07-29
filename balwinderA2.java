/**
 * Auto Generated Java Class.
 */
public class balwinderA2 {
  
  
  public static void main(String[] args) { 
    
//Prompts the user for the number of successful penalty kicks (goals)
    
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.println("Enter the number of goals");
    double g = input.nextDouble();   
      

// Prompts the user for the total number of penalty kicks attempted

     System.out.println("Enter the total number of penalty kicks attempted");
          double p = input.nextDouble();
                    
    
    // Displays the penalty kick average as an integer percentage (73%)

         double pa = 0;
         
          pa = (g/p)*100;
          
        System.out.println("The average percentage penalty kicks are: " + pa);
                 
          
    //Displays the penalty kick average as a real number (.673)
        
         System.out.println("The average penalty kicks are: " + (pa/100) );
          
     
          
    
//Displays what the penalty kick average would have been if there was one less attempt and if there were four fewer attempts with the same number of successful penalty kicks
         
     double npa = 0;
         npa = (g/(p-1))*100;       
         
         System.out.println("The average percentage penalty kicks if  there were an attempt less would be: " +  npa);
         
         double npa4 = 0;
     npa4 = (g/(p-4))*100;
     
              System.out.println("The average percentage penalty kicks if  there were four attempts less would be: " +  npa4);
              
         
//Displays what the penalty kick average +would have been if one additional goal and if five additional goals were scored with the same number of attempts

             double npa1 = 0;
             
             npa1 = ((g+1)/p)*100;
              
              System.out.println("The average percentage penalty kicks if there was 1 additional goal would be: " +  npa1);
              
              double npa5 = 0;
             
             npa5 = ((g+5)/p)*100;
              
              System.out.println("The average percentage penalty kicks if there were 5 additional goals would be: " +  npa5);

// Displays the total number of successful penalty kicks (int) if the original number of penalty kicks attempted decreased by 20% and the penalty kick average remained the same

              
             int npa20 = (int)((p-(0.2*p))*pa);
             
             System.out.println("the total number of successful penalty kicks  if the original number of penalty kicks attempted decreased by 20%: " + npa20);
              

// Displays the total number of successful penalty kicks (int) if the original number of penalty kicks attempted increased by 30% and the penalty kick average remained the same

              int npa30 = (int)((p+(0.3*p))*pa);
             
             System.out.println("the total number of successful penalty kicks  if the original number of penalty kicks attempted increased by 30%: " + npa30);
             
/*Notes:
•Minimize the usage of casts
•Use the shorthand operators where possible
•Add any questions that you may have to the Assignment 1 Discussion thread on SLATE.
•Follow the Assignment 1 Discussion thread to ensure that you are aware of any clarifications or modifications that are made to the Assignment.

Submission Instructions:
•Save your Java source code to a file named as follows: "yournameA2.java" where “yourname” is substituted with your actual first name. For example, my assignment would be in a file named "JoeA2.java". You may use your nickname or last name if you prefer but try to keep your name the same for the whole term! 
•Attach your Java source code file (described above - ie. "xxxxxA2.java") to your assignment submission in SLATE.*/
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
