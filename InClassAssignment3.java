/*
    Name: Balwinder Singh Bhandechha
    Assignment: Assignment
    Program: Java 2
    Date:
    Description:
*/

package inclassassignment3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Owner
 */
public class InClassAssignment3 extends JFrame implements WindowListener{

    JTextArea txtArea = new JTextArea(3,40);
    
    InClassAssignment3(){
        
        setTitle("Quiz!");
        setSize(300,150);
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout(0,0));
        
    
        JLabel label = new JLabel("HI");
        
        JRadioButton rdnTrue = new JRadioButton("True");
        JRadioButton rdnFalse = new JRadioButton("False");
        
        JButton btnNext = new JButton("Next");
        JButton btnExit = new JButton("Exit");
        
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(rdnTrue);
        btnGroup.add(rdnFalse);
        
        add(label, BorderLayout.NORTH);
        
        JPanel pnlCenter = new JPanel(new FlowLayout());
        pnlCenter.add(rdnTrue);
        pnlCenter.add(rdnFalse);
        
        add(pnlCenter, BorderLayout.CENTER);
        
        JPanel pnlSouth = new JPanel(new GridLayout(1,2));
        pnlSouth.add(btnNext);
        pnlSouth.add(btnExit);
        
        add(pnlSouth, BorderLayout.SOUTH);
        

        
        this.addWindowListener(this);
        
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        InClassAssignment3 assignment3 = new InClassAssignment3();
        
        File file = new File("data.dat");
        ArrayList <Quiz> arrayList = new ArrayList();
        
        String strRecord = "";
        String strField[] = new String[3];
        String strSerialNo = "";
        String strQuestion = "";
        String strAnswer = "";
        
        
        
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()){
        
            Quiz quiz1 = new Quiz();
            
            strRecord = scanner.next();
            strField = strRecord.split("\\|");
            System.out.println("");
            
            strSerialNo = strField[0];
            strQuestion = strField[1];
            strAnswer = strField[2];
            
           
            
            
        }
        
        for(int i=0; i < arrayList.size(); i++){
        
            Quiz quiz = arrayList.get(i);
            System.out.println(quiz);
            
            
        
        }
        

    }
    

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
                txtArea.append("Window Closed Event. \n");
        if(JOptionPane.showConfirmDialog(this, "Are you sure you want to close this window?", 
                "Confirm Dialog", JOptionPane.YES_NO_CANCEL_OPTION)
                == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

class Quiz{
    
    private String strSerialNo;
    private String strQuestion;
    private String strAnswer;

    public void setSerialNo(String serialNo)
    {        
        if(serialNo != null)
            strSerialNo = serialNo;
        else
            throw new IllegalArgumentException("Serial number cannot be zero or less.");    
    
    }
    
    public void setQuestion(String question)
    {        
        if(question != null)
            strQuestion = question;
        else
            throw new IllegalArgumentException("Question cannot be null.");    
    
    }
        
    public void setAnswer(String answer)
    {        
        if(answer != null)
            strAnswer = answer;
        else
            throw new IllegalArgumentException("Answer cannot be zero.");    
    
    }
    
    public String getSerialNo()
    {        
     return strSerialNo;
    }
    
    public String getQuestion()
    {        
     return strQuestion;
    }
        
    public String getAnswer()
    {        
     return strAnswer;
    } 
    
}