/*
    Name: Balwinder Singh Bhandechha
    Assignment: Final Exam
    Program:/Java 2
    Date:14/08/2012
    Description:
*/

package pkgfinal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Owner
 */
public class Final extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
        //textfield
      JTextField txtField = new JTextField(20);
      
      JTextArea txtArea = new JTextArea(30,200);
    
    Final() throws FileNotFoundException, IOException{
        
        setTitle("Search String in file");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        //Lower panel buttons
        JButton btnSearch = new JButton("Search");
        JButton btnReset = new JButton("Reset");
        JButton btnExit = new JButton("Exit");
        
        JLabel lblSearch = new JLabel("Search Name");
              

        
        JPanel pnlNorth = new JPanel(new FlowLayout());
        pnlNorth.add(lblSearch);
        pnlNorth.add(txtField);
        
        JPanel pnlCenter = new JPanel();
        pnlCenter.add(txtArea);
        
        JPanel pnlSouth = new JPanel(new GridLayout(1,3));
        pnlSouth.add(btnSearch);
        pnlSouth.add(btnReset);
        pnlSouth.add(btnExit);
        
        add(pnlNorth, BorderLayout.NORTH);
        add(pnlCenter, BorderLayout.CENTER);
        add(pnlSouth, BorderLayout.SOUTH);
        
        //Action Listener to exit Button
        btnExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
         //Action Listener to reset button
        btnReset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtField.setText("");
            }
        });
        
        
        btnSearch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader buffRead = new BufferedReader(new FileReader("names.dat"));
                    String line;
                    
                    //search term to compare with
                    String searchTerm = txtField.getText();
                    
                    try {
                        while ( ( line = buffRead.readLine() ) != null ){
                            
                            if (line.equals(searchTerm) ) {

                                txtArea.setText(searchTerm + "is found in the file");
                            
                            }                           

                        }    
                    } catch (IOException ex) {
                        System.out.println("Wrong Input. Try Again");
                    }

                    
                } catch (FileNotFoundException ex) {
                   System.out.println("File Not Found!");
                }
            }
        });
        
        
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       
        Final searchProgram = new Final();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
