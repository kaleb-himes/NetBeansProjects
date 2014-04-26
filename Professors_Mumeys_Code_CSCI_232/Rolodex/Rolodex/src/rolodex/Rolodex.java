/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rolodex;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author Brendan
 */
public class Rolodex extends JFrame {

    
    public static ContactList myContacts;
    
    public static ContactPanel contactPanel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new Rolodex();
        frame.setVisible(true);
        myContacts = new ContactList();
    }

    // Constructor
    /**
     * Construct the components and add them to the frame.
     */
    public Rolodex() {
        super("Rolodex");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Get a reference to the content pane.
        Container contentPane = getContentPane();
        // Set the layout manager to grid layout.
        contentPane.setLayout(new GridLayout(2, 1));
        contactPanel = new ContactPanel();
        contentPane.add(contactPanel);
        contentPane.add(new ButtonPanel());
        
        
        
        
     
        // Size the frame to fit.
        pack();
    }

    // Inner Classes
    /**
     * Class to respond to new gallons value.
     */


    
    
    public static void printContacts() {
         System.out.println("Contact list:");
         myContacts.printList();
    }
}
