
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
    Name: Balwinder Singh Bhandechha
    Assignment: Assignment
    Program: Java 2
    Date:

    Description:



*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Temp extends JFrame implements ActionListener{
    
    JTextField txtField = new JTextField(20);
    JButton btnConvert = new JButton("Convert");
    JTextArea txtArea = new JTextArea(30,30);
    
    
    Temp(){
        setTitle("Search String in file");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        add(txtField);
        add(btnConvert);
        add(txtArea);
        
        
        
        txtField.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txtField.getText();
                   int Fahrenheit = Integer.parseInt(text);
            }
        });
        
        btnConvert.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            int Celsius = (5/9)*(Fahrenheit -32);
            }
        });
        
        
        
        setVisible(true);
    }
    
    
 
    
    public static void main(String[] args){
    
        Temp tmp = new Temp();    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
