
package my.calculator;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        zerobut = new javax.swing.JButton();
        decpointbut = new javax.swing.JButton();
        addbut = new javax.swing.JButton();
        equalsbut = new javax.swing.JButton();
        twobut = new javax.swing.JButton();
        onebut = new javax.swing.JButton();
        threebut = new javax.swing.JButton();
        subtractbut = new javax.swing.JButton();
        fourbut = new javax.swing.JButton();
        fivebut = new javax.swing.JButton();
        sixbut = new javax.swing.JButton();
        multiplybut = new javax.swing.JButton();
        sevenbut = new javax.swing.JButton();
        eightbut = new javax.swing.JButton();
        ninebut = new javax.swing.JButton();
        devidebut = new javax.swing.JButton();
        clearexisting = new javax.swing.JButton();
        clearall = new javax.swing.JButton();
        output = new javax.swing.JFormattedTextField();
        input = new javax.swing.JFormattedTextField();
        openparanbut = new javax.swing.JButton();
        closeparanbut = new javax.swing.JButton();
        deletebut = new javax.swing.JButton();

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
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
    }// </editor-fold>//GEN-END:initComponents

    private void zerobutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zerobutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + zerobut.getText());
    }//GEN-LAST:event_zerobutMouseClicked

    private void onebutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onebutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + onebut.getText());
    }//GEN-LAST:event_onebutMouseClicked

    private void twobutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twobutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + twobut.getText());
    }//GEN-LAST:event_twobutMouseClicked

    private void threebutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threebutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + threebut.getText());
    }//GEN-LAST:event_threebutMouseClicked

    private void fourbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + fourbut.getText());
    }//GEN-LAST:event_fourbutMouseClicked

    private void fivebutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fivebutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + fivebut.getText());
    }//GEN-LAST:event_fivebutMouseClicked

    private void sixbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + sixbut.getText());
    }//GEN-LAST:event_sixbutMouseClicked

    private void sevenbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + sevenbut.getText());
    }//GEN-LAST:event_sevenbutMouseClicked

    private void eightbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + eightbut.getText());
    }//GEN-LAST:event_eightbutMouseClicked

    private void ninebutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ninebutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + ninebut.getText());
    }//GEN-LAST:event_ninebutMouseClicked

    private void decpointbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decpointbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + decpointbut.getText());
    }//GEN-LAST:event_decpointbutMouseClicked

    private void addbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + addbut.getText());
    }//GEN-LAST:event_addbutMouseClicked

    private void subtractbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtractbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + subtractbut.getText());
    }//GEN-LAST:event_subtractbutMouseClicked

    private void multiplybutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplybutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + multiplybut.getText());
    }//GEN-LAST:event_multiplybutMouseClicked

    private void devidebutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devidebutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + devidebut.getText());
    }//GEN-LAST:event_devidebutMouseClicked

    private void equalsbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsbutMouseClicked
        PostfixEvaluation.calculate();
    }//GEN-LAST:event_equalsbutMouseClicked

    private void clearexistingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearexistingMouseClicked
        input.setText(output.getText());
        output.setText("");
    }//GEN-LAST:event_clearexistingMouseClicked

    private void clearallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearallMouseClicked
        input.setText("");
        output.setText("");
    }//GEN-LAST:event_clearallMouseClicked

    private void openparanbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openparanbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + openparanbut.getText());
    }//GEN-LAST:event_openparanbutMouseClicked

    private void closeparanbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeparanbutMouseClicked
        String inputString = getDisplayString();
        setDisplayString(inputString + closeparanbut.getText());
    }//GEN-LAST:event_closeparanbutMouseClicked

    private void deletebutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebutMouseClicked
        String inputString = getDisplayString();
        inputString = inputString.substring(0, inputString.length()-1);
        setDisplayString(inputString);
    }//GEN-LAST:event_deletebutMouseClicked
    
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

//            if(take == "0" || take == "1" || take == "2" || take == "3" || take == "5" || take == "6" || take == "7" || take == "8" || take == "9"){
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
    private String Uinput;
}
    /**
     * @return the outputarray
     */
 
