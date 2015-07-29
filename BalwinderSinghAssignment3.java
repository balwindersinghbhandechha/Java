/**
 * Auto Generated Java Class.
 */
public class BalwinderSinghAssignment3 {
  
  
  public static void main(String[] args) { 
    
 
/*• Prompts the Java 1 student for their mark (percentage) on Mid Term 1; Mid Term 2; 
  Assignments and Quizzes; and the Final Exam. Assume the grade has not been received yet if the user enters -1.*/
    
    java.util.Scanner input = new java.util.Scanner(System.in);
    
    System.out.println("Enter Midterm-1 Marks obtained(-1 if grade not recieved)");
    double mid1Marks = input.nextDouble();
    
    if(mid1Marks > 15){System.out.println("Wrong answern for Midterm-1 marks. Try again"); //• Validates the user inputs
    System.exit(0);
    }
    
    System.out.println("Enter Midterm-2 Marks obtained(-1 if grade not recieved)");  
    double mid2Marks = input.nextDouble();
    
    if(mid2Marks > 25){System.out.println("Wrong answer for Midterm-2 marks. Try again"); //• Validates the user inputs
    System.exit(0);
    }
    
    System.out.println("Enter Total Assignment Marks obtained(-1 if grade not recieved)");
    double aqMarks = input.nextDouble();
    
    if(aqMarks > 25){System.out.println("Wrong answer for Assignment and Quiz marks. Try again");  //• Validates the user inputs
    System.exit(0);
    }
    
    System.out.println("Enter Final Exam Marks obtained(-1 if grade not recieved)");
    double finalMarks = input.nextDouble();
    
    if(finalMarks > 35){System.out.println("Wrong answer for Final Exam marks. Try again");   //• Validates the user inputs
    System.exit(0);
    }
    
    //Maximum Marks for all four categories
    
    int mid1Total = 15;  
    int mid2Total = 25;
    int finalTotal = 35;
    int aqTotal = 25;

    //No grades
    if (mid1Marks == -1)
        mid1Total = 15;
    if (mid2Marks == -1)
        mid2Marks = 25;
    if (aqMarks == -1)
        aqMarks = 25;
    if (finalMarks == -1)
        finalMarks = 35;
    
//• Calculates and displays the student’s final mark in percentage and letter grade based on the following weighting:  
//• Assignments and Quizzes – 25%
//• Mid Term 1 – 15%
//• Mid Term 2 – 25%
//• Final Exam – 35%
//• Note: if the user has entered any grades of -1 then simply calculate the maximum possible grade for the student based on the completed assessments.
        
    double finalPercent = ((mid1Marks + mid2Marks + finalMarks + aqMarks )/(mid1Total +mid2Total + finalTotal + aqTotal))*100;
    
    System.out.println("Your maximum possible grade is: " + finalPercent + "% marks.");
    
//• Calculates and displays the student’s highest percentage among the four components using the Math class
    
    double highPercent1 = Math.max(mid1Marks,mid2Marks);
    double highPercent2 = Math.max(aqMarks,finalMarks);
    double highPercent = Math.max(highPercent1, highPercent2);

    
    System.out.println("Your highest grade is: " + highPercent + "%");
      
//• Calculates and displays the student’s lowest percentage among the four components using the Math class

    double lowPercent1 = Math.min(mid1Marks,mid2Marks);
    double lowPercent2 = Math.min(aqMarks,finalMarks);
    double lowPercent = Math.min(highPercent1, highPercent2);
    
    System.out.println("Your lowest percentage is:" + lowPercent + "%");
    
/*Questions & Clarifications
•Add any questions that you may have to the Assignment 3 Discussion thread on SLATE for the benefit of all.
•Follow the Assignment 3 Discussion thread to ensure that you are aware of any clarifications or modifications that are made to the Assignment.

Submission Instructions:
•Save your Java source code to a file named as follows: "yournameA3.java" where “yourname” is substituted with your actual first name. For example, my assignment would be in a file named "JoeA3.java". You may use your nickname or last name if you prefer but try to keep your name the same for the whole term! 
•Attach your Java source code file (described above - ie. "xxxxxA3.java") to your assignment submission in SLATE.*/

    
    
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
