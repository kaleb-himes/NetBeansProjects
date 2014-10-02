/**
 *
 * @author Kaleb
 */

package k_j_a;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class game_gui extends JFrame {

    private JLabel ai_lbl;
    private static JProgressBar ai_progress_bar;
    private JPanel ai_thinking_quit_panel;
    private static JButton ai_v_ai_but;
    private static JButton ai_v_human_but;
    private static JPanel game_board_panel;
    private static JTextArea game_state_display;
    private JLabel game_state_lbl;
    private JPanel game_state_panel;
    private JScrollPane game_state_scrollpane;
    private static JButton human_v_ai_but;
    private static JButton human_v_human_but;
    private JPanel options_panel;
    private static JButton play_again_but;
    private static JButton quit_but;  
    
    public game_gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="GUI Code looks aweful... LET'S HIDE IT!">                          
    private void initComponents() {

        game_state_panel = new JPanel();
        game_state_lbl = new JLabel();
        game_state_scrollpane = new JScrollPane();
        game_state_display = new JTextArea();
        options_panel = new JPanel();
        human_v_ai_but = new JButton();
        ai_v_human_but = new JButton();
        human_v_human_but = new JButton();
        ai_v_ai_but = new JButton();
        ai_thinking_quit_panel = new JPanel();
        quit_but = new JButton();
        ai_progress_bar = new JProgressBar();
        ai_lbl = new JLabel();
        play_again_but = new JButton();
        game_board_panel = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        game_state_panel.setBorder
        (BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        game_state_lbl.setText("Current Game State");

        game_state_display.setColumns(20);
        game_state_display.setRows(5);
        game_state_display.setText("Select a game mode\nto begin!");
        game_state_display.setFocusable(false);
        game_state_scrollpane.setViewportView(game_state_display);

        GroupLayout game_state_panelLayout = new GroupLayout(game_state_panel);
        game_state_panel.setLayout(game_state_panelLayout);
        game_state_panelLayout.setHorizontalGroup
            (game_state_panelLayout.createParallelGroup
            (GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, 
            game_state_panelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(game_state_scrollpane, GroupLayout.DEFAULT_SIZE, 
            178, Short.MAX_VALUE).addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, 
            game_state_panelLayout.createSequentialGroup()
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(game_state_lbl)
            .addGap(49, 49, 49))
        );
        
        game_state_panelLayout.setVerticalGroup
            (game_state_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(game_state_panelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(game_state_lbl)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(game_state_scrollpane)
            .addContainerGap())
        );

        human_v_ai_but.setText("Human vs AI");
        human_v_ai_but.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                human_v_ai_butMouseClicked(evt);
            }
        });

        ai_v_human_but.setText("AI vs Human");
        ai_v_human_but.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ai_v_human_butMouseClicked(evt);
            }
        });

        human_v_human_but.setText("Human vs Human");
        human_v_human_but.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                human_v_human_butMouseClicked(evt);
            }
        });

        ai_v_ai_but.setText("AI vs AI");
        ai_v_ai_but.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ai_v_ai_butMouseClicked(evt);
            }
        });

        GroupLayout options_panelLayout = new GroupLayout(options_panel);
        options_panel.setLayout(options_panelLayout);
        options_panelLayout.setHorizontalGroup(
                options_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(options_panelLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(human_v_ai_but, GroupLayout.PREFERRED_SIZE, 
                        140, GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ai_v_human_but, GroupLayout.PREFERRED_SIZE, 
                        140, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(human_v_human_but, GroupLayout.PREFERRED_SIZE, 
                        140, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ai_v_ai_but, GroupLayout.PREFERRED_SIZE, 
                        140, GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        
        options_panelLayout.setVerticalGroup(
                options_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(options_panelLayout.createParallelGroup
                (GroupLayout.Alignment.BASELINE)
                .addComponent(ai_v_human_but, GroupLayout.PREFERRED_SIZE, 
                        39, GroupLayout.PREFERRED_SIZE)
                .addComponent(human_v_ai_but, GroupLayout.PREFERRED_SIZE, 
                        40, GroupLayout.PREFERRED_SIZE)
                .addComponent(human_v_human_but, GroupLayout.PREFERRED_SIZE, 
                        38, GroupLayout.PREFERRED_SIZE)
                .addComponent(ai_v_ai_but, GroupLayout.PREFERRED_SIZE, 
                        36, GroupLayout.PREFERRED_SIZE))
        );

        quit_but.setText("Quit");
        quit_but.setMaximumSize(new java.awt.Dimension(83, 23));
        quit_but.setMinimumSize(new java.awt.Dimension(83, 23));
        quit_but.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                quit_butMouseClicked(evt);
            }
        });

        ai_progress_bar.setFocusable(false);

        ai_lbl.setText("                    AI thinking...");

        play_again_but.setText("Play Again");
        play_again_but.setPreferredSize(new java.awt.Dimension(53, 23));
        play_again_but.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                play_again_butMouseClicked(evt);
            }
        });

        GroupLayout ai_thinking_quit_panelLayout = new GroupLayout
            (ai_thinking_quit_panel);
        ai_thinking_quit_panel.setLayout(ai_thinking_quit_panelLayout);
        ai_thinking_quit_panelLayout.setHorizontalGroup
            (ai_thinking_quit_panelLayout.createParallelGroup
                (GroupLayout.Alignment.LEADING)
                .addGroup(ai_thinking_quit_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(play_again_but, GroupLayout.PREFERRED_SIZE, 
                        100, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quit_but, GroupLayout.PREFERRED_SIZE, 
                        100, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ai_thinking_quit_panelLayout.
                    createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(ai_progress_bar, GroupLayout.DEFAULT_SIZE, 
                    178, Short.MAX_VALUE)
                .addComponent(ai_lbl, GroupLayout.DEFAULT_SIZE, 
                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, 
                    Short.MAX_VALUE))
        );
        
        ai_thinking_quit_panelLayout.setVerticalGroup
            (ai_thinking_quit_panelLayout.createParallelGroup
            (GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, 
                ai_thinking_quit_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ai_thinking_quit_panelLayout.createParallelGroup
                    (GroupLayout.Alignment.TRAILING)
                .addComponent(play_again_but, GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quit_but, GroupLayout.Alignment.LEADING, 
                        GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 
                            Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.LEADING, 
                        ai_thinking_quit_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ai_lbl)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ai_progress_bar, GroupLayout.PREFERRED_SIZE, 
                        19, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        game_board_panel.setBackground(new java.awt.Color(255, 255, 255));
        game_board_panel.setBorder(BorderFactory.createBevelBorder
            (javax.swing.border.BevelBorder.RAISED));
        game_board_panel.setFocusable(false);
        game_board_panel.setMaximumSize(new java.awt.Dimension(500, 500));
        game_board_panel.setMinimumSize(new java.awt.Dimension(500, 500));
        game_board_panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                game_board_panelMouseClicked(evt);
            }
        });

        GroupLayout game_board_panelLayout = new GroupLayout(game_board_panel);
        game_board_panel.setLayout(game_board_panelLayout);
        game_board_panelLayout.setHorizontalGroup(
                game_board_panelLayout.createParallelGroup
                    (GroupLayout.Alignment.LEADING)
                .addGap(0, 520, Short.MAX_VALUE)
        );
        game_board_panelLayout.setVerticalGroup(
                game_board_panelLayout.createParallelGroup
                    (GroupLayout.Alignment.LEADING)
                .addGap(0, 520, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(options_panel, GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ai_thinking_quit_panel, GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, 
                        layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(game_board_panel, GroupLayout.PREFERRED_SIZE, 
                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(game_state_panel, GroupLayout.PREFERRED_SIZE, 
                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        
        layout.setVerticalGroup
            (layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(ai_thinking_quit_panel, 
                        GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup
                    (GroupLayout.Alignment.LEADING, false)
                .addComponent(game_board_panel, GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(game_state_panel, GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(options_panel, GroupLayout.PREFERRED_SIZE, 
                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void quit_butMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    private void human_v_ai_butMouseClicked(MouseEvent evt) {
        paint_board(game_board_panel.getGraphics());
        game_state_display.setText("");
        set_all_non_focusable();
    }

    private void ai_v_human_butMouseClicked(MouseEvent evt) {
        paint_board(game_board_panel.getGraphics());
        game_state_display.setText("");
        set_all_non_focusable();
    }

    private void human_v_human_butMouseClicked(MouseEvent evt) {
        paint_board(game_board_panel.getGraphics());
        game_state_display.setText("");
        set_all_non_focusable();
    }

    private void ai_v_ai_butMouseClicked(MouseEvent evt) {
        paint_board(game_board_panel.getGraphics());
        game_state_display.setText("");
        set_all_non_focusable();
    }

    private void play_again_butMouseClicked(MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void game_board_panelMouseClicked(MouseEvent evt) {
        
    /* Legal Move Coodinates in (x,y) format:
     * We will use these to judge if a move is legal and paint the pixels up,
     * down, left, right, these coordinates are the center of the legal location
     *   
     *    Starting between Quadrant 1 and 2 on the verticle "NORTH" Line and
     *    moving clockwise around the circle. Always starting on the inner 
     *    radial circle and going to outter radial circle:
     *   
     *    Quadrant One starting at "NORTH" Line
     *          (250,175)(250,125)(250,75)(250,25)   North Line ->
     *          (284,183)(308,139)(331,94)(355,50)   Top spoke of Q1
     *          (316,215)(362,193)(406,169)(449,146) Bottom spoke of Q1
     *   
     *    Quadrant Four
     *          (325,250)(375,250)(425,250)(475,250) East Line
     *          (317,284)(361,308)(406,332)(450,354) Top spoke of Q4
     *          (284,316)(308,360)(331,404)(354,449) Bottom spoke of Q4
     *   
     *    Quadrant Three
     *          (250,325)(250,375)(250,425)(250,475) South Line
     *          (215,316)(192,360)(169,405)(146,449) Bottom spoke of Q3
     *          (184,284)(140,308)(95,330)(50,354)   TOp spoke of Q3
     *   
     *    Quadrant Two 
     *          (175,250)(125,250)(75,250)(25,250)   West Line
     *          (184,216)(140,192)(95,170)(51,146)   Bottom spoke of Q2
     *          (216,184)(192,139)(169,95)(147,51)   Top spoke of Q2
     */
        Point a = game_board_panel.getMousePosition();
        int x = (int) a.getX();
        int y = (int) a.getY();
        System.out.println("x,y coordinate: " + x + ", " + y + " ");
        paint_board(game_board_panel.getGraphics());
    }

    protected static void paint_board(Graphics g) {
        game_board_panel.paint(g);
        g.setColor(Color.BLUE);

        /* Outter Ring */
        g.drawOval(25, 25, 450, 450);

        /* Second Ring */
        g.drawOval(75, 75, 350, 350);

        /* Third Ring*/
        g.drawOval(125, 125, 250, 250);

        /* Inner most Ring */
        g.drawOval(175, 175, 150, 150);

        /* Quadrant 1 */
        g.drawLine(284, 183, 355, 50);
        g.drawLine(316, 215, 449, 146);

        /* Quadrant 2 */
        g.drawLine(216, 184, 147, 51);
        g.drawLine(184, 216, 51, 146);

        /* Quadrant 3 */
        g.drawLine(184, 284, 51, 354);
        g.drawLine(215, 316, 146, 449);

        /* Quadrant 4 */
        g.drawLine(284, 316, 354, 449);
        g.drawLine(317, 284, 450, 354);

        /* The verticle */
        g.drawLine(250, 25, 250, 175);
        g.drawLine(250, 325, 250, 475);

        /* The horizontal */
        g.drawLine(325, 250, 475, 250);
        g.drawLine(175, 250, 25, 250);
    }

    protected static void reset_board(Graphics g) {
        int gbh = game_board_panel.getHeight();
        int gbw = game_board_panel.getWidth();
        game_board_panel.paint(g);
        g.setColor(Color.white);
        g.fillOval(gbw / 5, gbh / 5, gbw, gbh);
        paint_board(game_board_panel.getGraphics());
    }

    protected static void set_all_non_focusable() {
        ai_v_ai_but.setEnabled(false);
        human_v_human_but.setEnabled(false);
        ai_v_human_but.setEnabled(false);
        human_v_ai_but.setEnabled(false);
        /* We will need to set this true in the event of a win state */
        play_again_but.setEnabled(false);
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new game_gui().setVisible(true);
            }
        });
    }               
}
