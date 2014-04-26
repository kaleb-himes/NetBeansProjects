
package my.calculator;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;

/**
 *
 * @author Kaleb
 */
public class calculatorUI extends javax.swing.JFrame {

    /**
     * Creates new form calculatorUI
     */
    public calculatorUI() {
        initComponents();
    }
    
    //UICODE BEGIN
    // <editor-fold defaultstate="collapsed" desc="UI code, buttons, text fields etc. edit cautiously">                          
     private void initComponents() {

        jSeparator1 = new JSeparator();
        zerobut = new JButton();
        decpointbut = new JButton();
        addbut = new JButton();
        equalsbut = new JButton();
        twobut = new JButton();
        onebut = new JButton();
        threebut = new JButton();
        subtractbut = new JButton();
        fourbut = new JButton();
        fivebut = new JButton();
        sixbut = new JButton();
        multiplybut = new JButton();
        sevenbut = new JButton();
        eightbut = new JButton();
        ninebut = new JButton();
        devidebut = new JButton();
        clearexisting = new JButton();
        clearall = new JButton();
        output = new JFormattedTextField();
        input = new JFormattedTextField();
        openparanbut = new JButton();
        closeparanbut = new JButton();
        deletebut = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zerobut.setText("0");
        zerobut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zerobutMouseClicked(evt);
            }
        });

        decpointbut.setText(".");
        decpointbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decpointbutMouseClicked(evt);
            }
        });

        addbut.setText("+");
        addbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbutMouseClicked(evt);
            }
        });

        equalsbut.setText("=");
        equalsbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalsbutMouseClicked(evt);
            }
        });

        twobut.setText("2");
        twobut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twobutMouseClicked(evt);
            }
        });

        onebut.setText("1");
        onebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onebutMouseClicked(evt);
            }
        });

        threebut.setText("3");
        threebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threebutMouseClicked(evt);
            }
        });

        subtractbut.setText("-");
        subtractbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtractbutMouseClicked(evt);
            }
        });

        fourbut.setText("4");
        fourbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourbutMouseClicked(evt);
            }
        });

        fivebut.setText("5");
        fivebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fivebutMouseClicked(evt);
            }
        });

        sixbut.setText("6");
        sixbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixbutMouseClicked(evt);
            }
        });

        multiplybut.setText("*");
        multiplybut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplybutMouseClicked(evt);
            }
        });

        sevenbut.setText("7");
        sevenbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenbutMouseClicked(evt);
            }
        });

        eightbut.setText("8");
        eightbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightbutMouseClicked(evt);
            }
        });

        ninebut.setText("9");
        ninebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ninebutMouseClicked(evt);
            }
        });

        devidebut.setText("/");
        devidebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devidebutMouseClicked(evt);
            }
        });

        clearexisting.setText("CE");
        clearexisting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearexistingMouseClicked(evt);
            }
        });

        clearall.setText("C");
        clearall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearallMouseClicked(evt);
            }
        });

        output.setFocusable(false);

        openparanbut.setText("(");
        openparanbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openparanbutMouseClicked(evt);
            }
        });

        closeparanbut.setText(")");
        closeparanbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeparanbutMouseClicked(evt);
            }
        });

        deletebut.setText("<-- Backup One");
        deletebut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(output)
            .addComponent(input)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deletebut, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(openparanbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(closeparanbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(layout.createSequentialGroup()
            .addComponent(fourbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(fivebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(sixbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(multiplybut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(clearexisting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(layout.createSequentialGroup()
            .addComponent(onebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(twobut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(zerobut, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(layout.createSequentialGroup()
            .addComponent(threebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subtractbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(decpointbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(equalsbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sevenbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eightbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ninebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(devidebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearall, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(openparanbut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeparanbut))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ninebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(devidebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fivebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplybut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearexisting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equalsbut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(threebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twobut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onebut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtractbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decpointbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zerobut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(deletebut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    //UICODE END
    /*
     * Note to future editors, mouse events are initialized in the UICODE
     * but the logic is under MOUSE EVENTS code
     */
    //MOUSE EVENTS BEGIN
    // <editor-fold defaultstate="collapsed" desc="mouse event listeners attatched to buttons, edit cautiously">
        private void zerobutMouseClicked(java.awt.event.MouseEvent evt) {                                     
        String inputString = getDisplayString();
        setDisplayString(inputString + zerobut.getText());
    }                                    

    private void onebutMouseClicked(java.awt.event.MouseEvent evt) {                                    
        String inputString = getDisplayString();
        setDisplayString(inputString + onebut.getText());
    }                                   

    private void twobutMouseClicked(java.awt.event.MouseEvent evt) {                                    
        String inputString = getDisplayString();
        setDisplayString(inputString + twobut.getText());
    }                                   

    private void threebutMouseClicked(java.awt.event.MouseEvent evt) {                                      
        String inputString = getDisplayString();
        setDisplayString(inputString + threebut.getText());
    }                                     

    private void fourbutMouseClicked(java.awt.event.MouseEvent evt) {                                     
        String inputString = getDisplayString();
        setDisplayString(inputString + fourbut.getText());
    }                                    

    private void fivebutMouseClicked(java.awt.event.MouseEvent evt) {                                     
        String inputString = getDisplayString();
        setDisplayString(inputString + fivebut.getText());
    }                                    

    private void sixbutMouseClicked(java.awt.event.MouseEvent evt) {                                    
        String inputString = getDisplayString();
        setDisplayString(inputString + sixbut.getText());
    }                                   

    private void sevenbutMouseClicked(java.awt.event.MouseEvent evt) {                                      
        String inputString = getDisplayString();
        setDisplayString(inputString + sevenbut.getText());
    }                                     

    private void eightbutMouseClicked(java.awt.event.MouseEvent evt) {                                      
        String inputString = getDisplayString();
        setDisplayString(inputString + eightbut.getText());
    }                                     

    private void ninebutMouseClicked(java.awt.event.MouseEvent evt) {                                     
        String inputString = getDisplayString();
        setDisplayString(inputString + ninebut.getText());
    }                                    

    private void decpointbutMouseClicked(java.awt.event.MouseEvent evt) {                                         
        String inputString = getDisplayString();
        setDisplayString(inputString + decpointbut.getText());
    }                                        

    private void addbutMouseClicked(java.awt.event.MouseEvent evt) {                                    
        String inputString = getDisplayString();
        setDisplayString(inputString + addbut.getText());
    }                                   

    private void subtractbutMouseClicked(java.awt.event.MouseEvent evt) {                                         
        String inputString = getDisplayString();
        setDisplayString(inputString + subtractbut.getText());
    }                                        

    private void multiplybutMouseClicked(java.awt.event.MouseEvent evt) {                                         
        String inputString = getDisplayString();
        setDisplayString(inputString + multiplybut.getText());
    }                                        

    private void devidebutMouseClicked(java.awt.event.MouseEvent evt) {                                       
        String inputString = getDisplayString();
        setDisplayString(inputString + devidebut.getText());
    }                                      

    private void equalsbutMouseClicked(java.awt.event.MouseEvent evt) {                                       
        PostfixEvaluation.calculate();
    }                                      

    private void clearexistingMouseClicked(java.awt.event.MouseEvent evt) {                                                
        input.setText("("+output.getText()+")");
        output.setText("");
    }                                               

    private void clearallMouseClicked(java.awt.event.MouseEvent evt) {                                          
        input.setText("");
        output.setText("");
    }                                         

    private void openparanbutMouseClicked(java.awt.event.MouseEvent evt) {                                          
        String inputString = getDisplayString();
        setDisplayString(inputString + openparanbut.getText());
    }                                         

    private void closeparanbutMouseClicked(java.awt.event.MouseEvent evt) {                                           
        String inputString = getDisplayString();
        setDisplayString(inputString + closeparanbut.getText());
    }                                          

    private void deletebutMouseClicked(java.awt.event.MouseEvent evt) {                                       
        try{
        String inputString = getDisplayString();
        inputString = inputString.substring(0, inputString.length()-1);
        setDisplayString(inputString);
        } catch(java.lang.StringIndexOutOfBoundsException ex){
            output.setText("There is nothing else to delete");
        }
    }                                      
    
        void setDisplayString(String s) {
		input.setText(s);
	}
	String getDisplayString() {
		return input.getText();
	}
        public static String woops(){
            output.setText("ERROR, you broke me");
        return null;
        }
    // </editor-fold>
    //MOUSE EVENTS END
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" set to Nimbus look and feel ">
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorUI().setVisible(true);
            }
        });
    }
    //VARIABLES BEGIN
    // <editor-fold defaultstate="collapsed" desc="variables used in UI">                    
    private javax.swing.JButton addbut;
    private javax.swing.JButton clearall;
    private javax.swing.JButton clearexisting;
    private javax.swing.JButton closeparanbut;
    private javax.swing.JButton decpointbut;
    private javax.swing.JButton deletebut;
    private javax.swing.JButton devidebut;
    private javax.swing.JButton eightbut;
    private javax.swing.JButton equalsbut;
    private javax.swing.JButton fivebut;
    private javax.swing.JButton fourbut;
    public static javax.swing.JFormattedTextField input;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton multiplybut;
    private javax.swing.JButton ninebut;
    private javax.swing.JButton onebut;
    private javax.swing.JButton openparanbut;
    public static javax.swing.JFormattedTextField output;
    private javax.swing.JButton sevenbut;
    private javax.swing.JButton sixbut;
    private javax.swing.JButton subtractbut;
    private javax.swing.JButton threebut;
    private javax.swing.JButton twobut;
    private javax.swing.JButton zerobut;
    // End of variables declaration                   
    ArrayList<String> inlist = new ArrayList<>();
    // </editor-fold>
    //VARIABLES END
}
 
