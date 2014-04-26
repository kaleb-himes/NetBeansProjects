/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ordermenu;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaleb
 */
@SuppressWarnings("serial")
public class tableAndSection extends javax.swing.JFrame {
    /**
     * Creates new form tableAndSection
     */
    public tableAndSection() {
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

        jPanel1 = new javax.swing.JPanel();
        matradeetbllbl = new javax.swing.JLabel();
        matradeesectionlbl = new javax.swing.JLabel();
        adultlbl = new javax.swing.JLabel();
        chldlbl = new javax.swing.JLabel();
        matradeepartylbl = new javax.swing.JLabel();
        matradeesubmitbut = new javax.swing.JButton();
        matradeesec = new javax.swing.JFormattedTextField();
        matradeetable = new javax.swing.JFormattedTextField();
        adulttxt = new javax.swing.JFormattedTextField();
        childtxt = new javax.swing.JFormattedTextField();
        matradeeparty = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Table And Section / Party", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION)));

        matradeetbllbl.setText("Table Party Will Be Seated At:");

        matradeesectionlbl.setText("Section Party Will Be In:");

        adultlbl.setText("How Many Adults In Party:");

        chldlbl.setText("How Many Children In Party:");

        matradeepartylbl.setText("Total Party Size:");

        matradeesubmitbut.setText("Submit");
        matradeesubmitbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matradeesubmitbutMouseClicked(evt);
            }
        });

        matradeesec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matradeesecKeyPressed(evt);
            }
        });

        matradeetable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matradeetableKeyPressed(evt);
            }
        });

        adulttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adulttxtKeyPressed(evt);
            }
        });

        childtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                childtxtKeyPressed(evt);
            }
        });

        matradeeparty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                matradeepartyKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matradeesectionlbl)
                            .addComponent(matradeetbllbl)
                            .addComponent(adultlbl)
                            .addComponent(chldlbl)
                            .addComponent(matradeepartylbl))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matradeesec)
                            .addComponent(matradeetable)
                            .addComponent(adulttxt)
                            .addComponent(childtxt)
                            .addComponent(matradeeparty, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(matradeesubmitbut)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matradeesectionlbl)
                    .addComponent(matradeesec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(matradeetbllbl)
                    .addComponent(matradeetable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adultlbl)
                    .addComponent(adulttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chldlbl)
                    .addComponent(childtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matradeepartylbl)
                    .addComponent(matradeeparty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(matradeesubmitbut)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matradeesubmitbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matradeesubmitbutMouseClicked
        setVisible(false);
        new MenuOrderUI().setVisible(true);
        MenuOrderUI.sectiontxt.setText(matradeesec.getText());
        MenuOrderUI.tabletxt.setText(matradeetable.getText());
        MenuOrderUI.partytxt.setText(matradeeparty.getText());
    }//GEN-LAST:event_matradeesubmitbutMouseClicked

    private void matradeesecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matradeesecKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            matradeesec.setText(matradeesec.getText());
            matradeesec.transferFocus();
        }
    }//GEN-LAST:event_matradeesecKeyPressed

    private void matradeetableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matradeetableKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            matradeetable.setText(matradeetable.getText());
            matradeetable.transferFocus();
        }
    }//GEN-LAST:event_matradeetableKeyPressed

    private void adulttxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adulttxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            adulttxt.setText(adulttxt.getText());
            adulttxt.transferFocus();
        }
    }//GEN-LAST:event_adulttxtKeyPressed

    private void childtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_childtxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            childtxt.setText(childtxt.getText());
            childtxt.transferFocus();
        }
    }//GEN-LAST:event_childtxtKeyPressed

    private void matradeepartyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matradeepartyKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            matradeeparty.setText(matradeeparty.getText());
            matradeeparty.transferFocus();
        }
    }//GEN-LAST:event_matradeepartyKeyPressed

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
            java.util.logging.Logger.getLogger(tableAndSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableAndSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableAndSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableAndSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableAndSection().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adultlbl;
    private javax.swing.JFormattedTextField adulttxt;
    private javax.swing.JFormattedTextField childtxt;
    private javax.swing.JLabel chldlbl;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JFormattedTextField matradeeparty;
    private javax.swing.JLabel matradeepartylbl;
    public static javax.swing.JFormattedTextField matradeesec;
    private javax.swing.JLabel matradeesectionlbl;
    private javax.swing.JButton matradeesubmitbut;
    public static javax.swing.JFormattedTextField matradeetable;
    private javax.swing.JLabel matradeetbllbl;
    // End of variables declaration//GEN-END:variables
}
