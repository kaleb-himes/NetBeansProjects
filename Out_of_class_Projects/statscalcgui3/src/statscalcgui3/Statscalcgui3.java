/* Stats Calc GUI version 3
 *
 * Copyright (C) 2013 Kaleb Himes
 * This file is part of a statistics calculator gui
 *
 * Stats Calc GUI is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * Stats Calc GUI  is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,USA
 */

package statscalcgui3;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kaleb
 */
public class Statscalcgui3 extends JFrame {

    /**
     * Creates new form statsCalcGUI
     */
    public Statscalcgui3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        displayDataTxt = new JTextArea();
        meanTxt = new JTextField();
        medianTxt = new JTextField();
        Q3Txt = new JTextField();
        Q1Txt = new JTextField();
        meanLbl = new JLabel();
        medianLbl = new JLabel();
        Q1Lbl = new JLabel();
        Q3Lbl = new JLabel();
        rangeTxt = new JTextField();
        rangeLbl = new JLabel();
        enterDataTxt = new JTextField();
        enterDataLbl = new JLabel();
        calculate = new JButton();
        IQRTxt = new JTextField();
        IRQLbl = new JLabel();
        jScrollPane2 = new JScrollPane();
        sortedTxt = new JTextArea();
        stdDevLbl = new JLabel();
        stdDevTxt = new JTextField();
        fiveNumSumTxt = new JTextField();
        fiuveNumSumLbl = new JLabel();
        lowOutLbl = new JLabel();
        upOutLbl = new JLabel();
        lowOutTxt = new JTextField();
        upOutTxt = new JTextField();
        resetBut = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        displayDataTxt.setColumns(20);
        displayDataTxt.setRows(5);
        displayDataTxt.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                displayDataTxtFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(displayDataTxt);

        meanTxt.setFocusable(false);

        medianTxt.setFocusable(false);

        Q3Txt.setFocusable(false);

        Q1Txt.setFocusable(false);

        meanLbl.setText("Mean (always pulled to skewed side)");

        medianLbl.setText("Median (Q2) middle of the table");

        Q1Lbl.setText("Q1 middle of first 50%");

        Q3Lbl.setText("Q3 middle of last 50%");

        rangeTxt.setFocusable(false);
        rangeTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rangeTxtActionPerformed(evt);
            }
        });

        rangeLbl.setText("Range  (Max - Min)");

        enterDataTxt.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                enterDataTxtFocusGained(evt);
            }
        });
        enterDataTxt.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                enterDataTxtKeyPressed(evt);
            }
        });

        enterDataLbl.setText("Enter Data Value then hit enter, values can be entered in any order");

        calculate.setText("Calculate Everything");
        calculate.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                calculateMouseClicked(evt);
            }
        });

        IQRTxt.setFocusable(false);

        IRQLbl.setText("IQR");

        sortedTxt.setColumns(20);
        sortedTxt.setRows(5);
        jScrollPane2.setViewportView(sortedTxt);

        stdDevLbl.setText("Standard Deviation");

        stdDevTxt.setFocusable(false);

        fiveNumSumTxt.setFocusable(false);

        fiuveNumSumLbl.setText("5 number summary");

        lowOutLbl.setText("Lower Outlier");

        upOutLbl.setText("Upper Outlier");

        lowOutTxt.setFocusable(false);

        upOutTxt.setFocusable(false);

        resetBut.setText("RESET ALL");
        resetBut.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                resetButMouseClicked(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2))
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(rangeLbl, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Q1Lbl, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                .addComponent(lowOutTxt, GroupLayout.Alignment.LEADING)
                .addComponent(lowOutLbl, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rangeTxt, GroupLayout.Alignment.LEADING)
                .addComponent(IRQLbl, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IQRTxt, GroupLayout.Alignment.LEADING)
                .addComponent(stdDevLbl, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stdDevTxt, GroupLayout.Alignment.LEADING)
                .addComponent(upOutLbl, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
                .addComponent(upOutTxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(Q1Txt)
                .addComponent(medianLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(medianTxt)
                .addComponent(Q3Lbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Q3Txt)
                .addComponent(fiuveNumSumLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fiveNumSumTxt)
                .addComponent(meanLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(meanTxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)))
                .addComponent(calculate, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 375, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(resetBut)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(enterDataLbl, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
                .addComponent(enterDataTxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap()))));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addComponent(jScrollPane2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterDataLbl)
                .addGap(5, 5, 5)
                .addComponent(enterDataTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(calculate)
                .addComponent(resetBut, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(Q1Lbl)
                .addComponent(rangeLbl))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(Q1Txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(rangeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(medianLbl)
                .addComponent(IRQLbl))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(medianTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(IQRTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(Q3Lbl)
                .addComponent(stdDevLbl))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(Q3Txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(stdDevTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(fiuveNumSumLbl)
                .addComponent(lowOutLbl))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(fiveNumSumTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lowOutTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(meanLbl)
                .addComponent(upOutLbl))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(meanTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(upOutTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    private void enterDataTxtKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            double add = Double.parseDouble(enterDataTxt.getText());
            enterDataTxt.setText(enterDataTxt.getText());
            displayDataTxt.append(enterDataTxt.getText() + "\n");
            data.add(add);
            displayDataTxt.requestFocus();
            sortingmethod.run();
        }
    }

    private void displayDataTxtFocusGained(FocusEvent evt) {
        enterDataTxt.requestFocus();
    }

    private void enterDataTxtFocusGained(FocusEvent evt) {
        enterDataTxt.setText("");
    }

    private void calculateMouseClicked(MouseEvent evt) {
        calcMean();
        calcMedian();
        calcRange();
        calcIQR();
        calcStdDev();
        calcFiveNumSum();
        calcLowOut();
        calcUpOut();
    }

    private void rangeTxtActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void resetButMouseClicked(MouseEvent evt) {
        data = new ArrayList<>();
        sortedData = new double[data.size()];
        displayDataTxt.setText("");
        sortedTxt.setText("");
        enterDataTxt.setText("");
        rangeTxt.setText("");
        Q1Txt.setText("");
        IQRTxt.setText("");
        medianTxt.setText("");
        stdDevTxt.setText("");
        Q3Txt.setText("");
        lowOutTxt.setText("");
        fiveNumSumTxt.setText("");
        upOutTxt.setText("");
        meanTxt.setText("");
    }

    public void calcMean() {
        mean = 0;
        total = 0;
        for (int i = 0; i < sortedData.length; i++) {
            total += sortedData[i];
        }
        mean = total / sortedData.length;
        meanTxt.setText(Double.toString(mean));
    }

    public void calcMedian() {
        int middle = sortedData.length / 2;
        int rightOfMedian = (sortedData.length + 1) / 2;
        int leftOfMedian = (sortedData.length - 1) / 2;
        double leftD = sortedData[leftOfMedian + 1];
        double rightD = sortedData[leftOfMedian];
        double median = (leftD + rightD) / 2.0;
        if (sortedData.length % 2 == 1) {
            medianTxt.setText(Double.toString(sortedData[middle]));
            calcQ1true(middle);
            calcQ3true(middle);
        } else {
            medianTxt.setText(Double.toString(median));
            calcQ1false(leftOfMedian);
            calcQ3false(rightOfMedian);
        }
    }

    public void calcQ1true(int Median) {
        int middle = Median / 2;
        int m1 = Median - 1;
        int m2 = Median + 1;
        int Q1L = m1 / 2;
        int Q1R = m2 / 2;
        double median = (sortedData[Q1L] + sortedData[Q1R]) / 2;
        if (Median % 2 == 0) {
            Q1Txt.setText(Double.toString(sortedData[middle]));
        } else {
            Q1Txt.setText(Double.toString(median));
        }
    }

    public void calcQ1false(int leftBound) {
        int middle = leftBound / 2;
        int m1 = leftBound - 1;
        int m2 = leftBound + 1;
        int Q1L = m1 / 2;
        int Q1R = m2 / 2;
        double median = (sortedData[Q1L] + sortedData[Q1R]) / 2;
        if (leftBound % 2 == 0) {
            Q1Txt.setText(Double.toString(sortedData[middle]));
        } else {
            Q1Txt.setText(Double.toString(median));
        }
    }

    public void calcQ3true(int Median) {
        int upper = Median + sortedData.length;
        int middle = (upper) / 2;
        int lOM = (upper - 1) / 2;
        double leftD = sortedData[lOM + 1];
        double rightD = sortedData[lOM];
        double median = (leftD + rightD) / 2.0;
        if (upper % 2 == 1) {
            Q3Txt.setText(Double.toString(sortedData[middle]));
        } else {
            Q3Txt.setText(Double.toString(median));
        }
    }

    public void calcQ3false(int rightBound) {
        int upper = rightBound + sortedData.length;
        int middle = (upper) / 2;
        int lOM = (upper - 1) / 2;
        double leftD = sortedData[lOM + 1];
        double rightD = sortedData[lOM];
        double median = (leftD + rightD) / 2.0;
        if (upper % 2 == 1) {
            Q3Txt.setText(Double.toString(sortedData[middle]));
        } else {
            Q3Txt.setText(Double.toString(median));
        }
    }

    public void calcRange() {
        double max = sortedData[sortedData.length - 1];
        double min = sortedData[0];
        double range = max - min;
        rangeTxt.setText("Ranges from: " + min + " to " + max + " (" + range + ")");
    }

    public void calcIQR() {
        double Q1 = Double.parseDouble(Q1Txt.getText());
        double Q3 = Double.parseDouble(Q3Txt.getText());
        double IQR = Q3 - Q1;
        IQRTxt.setText(Double.toString(IQR));

    }

    public void calcStdDev() {
        double stdDev;
        double sum = 0;
        for (int i = 0; i < sortedData.length; i++) {
            sum += Math.pow(sortedData[i] - mean, 2);
        }
        stdDev = Math.sqrt(sum / (sortedData.length - 1));
        stdDevTxt.setText(Double.toString(stdDev));
    }

    public void calcFiveNumSum() {
        double min = sortedData[0];
        double Q1 = Double.parseDouble(Q1Txt.getText());
        double Q2 = Double.parseDouble(medianTxt.getText());
        double Q3 = Double.parseDouble(Q3Txt.getText());
        double max = sortedData[sortedData.length - 1];
        double fiveNumSum = min + Q1 + Q2 + Q3 + max;
        fiveNumSumTxt.setText(min + " + " + Q1 + " + " + Q2 + " + " + Q3 + " + " + max + " = " + fiveNumSum);
    }

    public void calcLowOut() {
        double Q1 = Double.parseDouble(Q1Txt.getText());
        double IQR = Double.parseDouble(IQRTxt.getText());
        double lowOut = Q1 - 1.5 * IQR;
        lowOutTxt.setText(Double.toString(lowOut));
    }

    public void calcUpOut() {
        double Q3 = Double.parseDouble(Q3Txt.getText());
        double IQR = Double.parseDouble(IQRTxt.getText());
        double upOut = Q3 + 1.5 * IQR;
        upOutTxt.setText(Double.toString(upOut));
    }

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Statscalcgui3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Statscalcgui3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Statscalcgui3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Statscalcgui3.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statscalcgui3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private JTextField IQRTxt;
    private JLabel IRQLbl;
    private JLabel Q1Lbl;
    private JTextField Q1Txt;
    private JLabel Q3Lbl;
    private JTextField Q3Txt;
    private JButton calculate;
    private JTextArea displayDataTxt;
    private JLabel enterDataLbl;
    private JTextField enterDataTxt;
    private JLabel fiuveNumSumLbl;
    private JTextField fiveNumSumTxt;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JLabel lowOutLbl;
    private JTextField lowOutTxt;
    private JLabel meanLbl;
    private JTextField meanTxt;
    private JLabel medianLbl;
    private JTextField medianTxt;
    private JLabel rangeLbl;
    private JTextField rangeTxt;
    private JButton resetBut;
    public static JTextArea sortedTxt;
    private JLabel stdDevLbl;
    private JTextField stdDevTxt;
    private JLabel upOutLbl;
    private JTextField upOutTxt;
    // End of variables declaration
    public static ArrayList<Double> data = new ArrayList<>();
    public static double[] sortedData = new double[data.size()];
    private double total;
    private double sumSqrd;
    public double mean;
}
