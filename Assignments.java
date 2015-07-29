/*
    Name: Balwinder Singh Bhandechha
    Assignment: Assignment 1
    Program: Java 2
    Date:24/05/2012
    Description:
*/
/**
 *
 * @author Owner
 */
public class Assignments { 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input=new java.util.Scanner(System.in);
        
        System.out.println("Enter your SIN Number(9 Digits): "); // prompt user for SIN
        String sin = input.nextLine();                               //accept SIN
        
        char a = sin.charAt(0);                                 //char 1
        
        char b = sin.charAt(1);                                 //char2
        
        char c = sin.charAt(2);                                 //char3
        
        char d = sin.charAt(3);                                 //char 4
               
        char e = sin.charAt(4);                                  //char 5
        
        char f = sin.charAt(5);                                 //char 6
        
        char g = sin.charAt(6);                                 //char 7
        
        char h = sin.charAt(7);                                  //char 8
        
        char i = sin.charAt(8);                                  //char 9
                
        // Validate SIN digits      
        int j = Character.getNumericValue(a) * 1;
        int k = Character.getNumericValue(b) * 2;
        int l = Character.getNumericValue(c) * 1;
        int m = Character.getNumericValue(d) * 2;
        int n = Character.getNumericValue(e) * 1;
        int o = Character.getNumericValue(f) * 2;
        int p = Character.getNumericValue(g) * 1;
        int q = Character.getNumericValue(h) * 2;
        int r = Character.getNumericValue(i);
        
        //Check for two digit outcomes from above step   
        if (j > 9){        
            j = j - 9;            
        }
        else if (k > 9){        
            k = k - 9;
        }
        else if (l > 9){
            l = l - 9;
        }
        else if (m > 9){
            m = m - 9;        
        }
        else if (n > 9){
            n = n - 9;
        }
        else if (o > 9){
            o = o - 9;
        }
        else if (p > 9){
            p = p - 9;
        }
        else if (q > 9){
            q = q - 9;
        }
        
        //add digits
        int s = j + k + l + m + n + o + p + q;
              
        String str1 = Integer.toString(s);                  //Integer to string conversion
              
        char str3 = str1.charAt(0);                         //assirn char variable to the first digit in the string
                
        int str4 = Character.getNumericValue(str3);         // assign int variable to the numeric value
        
        int s2 = ((str4) * 10) + 10;                        //Find the next number divisible by 10
                
        s2 = s2 - s;                                       //Subtract the sum from the next 10 divisible number obtained above
                
        //test validity according to the condition supplied
        if (s2 == r){
         System.out.println("SIN Valid!");
        } 
        else
            System.out.println("SIN Invalid!");            
                             
    }

}
