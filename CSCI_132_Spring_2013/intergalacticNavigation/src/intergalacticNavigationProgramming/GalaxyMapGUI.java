package intergalacticNavigationProgramming;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Kaleb
 */
@SuppressWarnings("serial")
public class GalaxyMapGUI extends JFrame {

    public GalaxyMapGUI() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        GalaxyMapScrollPane = new JScrollPane();
        GalaxyMapTA = new JTextArea();
        jPanel2 = new JPanel();
        RouteInstTAScrollPane = new JScrollPane();
        RouteInstructionsTA = new JTextArea();
        RouteInstructionsLabel = new JLabel();
        StartLocationTF = new JTextField();
        StartLocationLabel = new JLabel();
        jLabel3 = new JLabel();
        destinationTF = new JTextField();
        jButton1 = new JButton();
        jPanel3 = new JPanel();
        jLabel4 = new JLabel();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1500, 900));

        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new Dimension(800, 800));

        GalaxyMapScrollPane.setPreferredSize(new Dimension(183, 900));

        GalaxyMapTA.setColumns(1000);
        GalaxyMapTA.setRows(1000);
        GalaxyMapTA.setBackground(Color.BLACK);
        GalaxyMapTA.setForeground(Color.WHITE);
        GalaxyMapTA.setToolTipText("");
        GalaxyMapTA.setFocusable(false);
        GalaxyMapTA.setPreferredSize(new Dimension(1000, 1000));
        GalaxyMapScrollPane.setViewportView(GalaxyMapTA);
        RouteInstructionsTA.setColumns(200);
        RouteInstructionsTA.setRows(200);
        RouteInstructionsTA.setPreferredSize(new Dimension(200, 200));
        RouteInstTAScrollPane.setViewportView(RouteInstructionsTA);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(GalaxyMapScrollPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GalaxyMapScrollPane, GroupLayout.PREFERRED_SIZE, 741, GroupLayout.PREFERRED_SIZE)));

        jPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        jPanel2.setPreferredSize(new Dimension(300, 800));

        RouteInstTAScrollPane.setPreferredSize(new Dimension(183, 900));

        RouteInstructionsTA.setColumns(20);
        RouteInstructionsTA.setRows(5);
        RouteInstructionsTA.setFocusable(false);
        RouteInstructionsTA.setPreferredSize(new Dimension(164, 500));
        RouteInstTAScrollPane.setViewportView(RouteInstructionsTA);

        RouteInstructionsLabel.setText("Route Instructions:");

        StartLocationTF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        StartLocationTF.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });

        StartLocationLabel.setText("Please Enter Starting Location:");

        jLabel3.setText("Enter Destination:");

        destinationTF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        destinationTF.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });

        jButton1.setText("Calculate Route");
        jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                try {
                    jButton1MouseClicked(evt);
                } catch (IOException ex) {
                    Logger.getLogger(GalaxyMapGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(RouteInstTAScrollPane, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(StartLocationTF)
                .addComponent(destinationTF)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(StartLocationLabel)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jButton1)
                .addComponent(jLabel3))))
                .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(RouteInstructionsLabel)
                .addContainerGap()));

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(StartLocationLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StartLocationTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(RouteInstructionsLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RouteInstTAScrollPane, GroupLayout.PREFERRED_SIZE, 649, GroupLayout.PREFERRED_SIZE)));

        jPanel3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createBevelBorder(BevelBorder.RAISED)));

        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText(" A list of possible destinations, enjoy  ");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap()));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 745, GroupLayout.PREFERRED_SIZE)));

        pack();
    }

    private void jButton1MouseClicked(MouseEvent evt) throws IOException {
        BuildTheGraph.createPaths();
        RouteInstructionsTA.setText("");
        try{
        TestDijkstra.run();
        }catch(java.util.NoSuchElementException ex){
            RouteInstructionsTA.setText(" ");
            RouteInstructionsTA.append("You have selected an invalid start AND/OR destination,\n"
                    + "Boy your a nincomepoop!\n"
                    + "Please take a deep breath, relax, get your bearings!\n"
                    + "NOW review the list of real locations.\n"
                    + "Input your current location and where you are headed...\n"
                    + "IF THAT'S NOT TOO DIFFICULT!!!!");
        }
    }

    private void jTextField1KeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            StartLocationTF.setText(StartLocationTF.getText());
            if (StartLocationTF.getText().equals("")) {
                StartLocationTF.setText("please enter a start position");
            }
            destinationTF.requestFocus();
        }
    }

    private void jTextField1FocusGained(FocusEvent evt) {
        if (StartLocationTF.hasFocus()) {
            StartLocationTF.setText("");
        }
    }

    private void jTextField2KeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            destinationTF.setText(destinationTF.getText());
            if (destinationTF.getText().equals("")) {
                destinationTF.setText("please enter a destination");
            }
            jButton1.requestFocus();
        }
    }

    private void jTextField2FocusGained(FocusEvent evt) {
        if (destinationTF.hasFocus()) {
            destinationTF.setText("");
        }
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GalaxyMapGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GalaxyMapGUI().setVisible(true);
                BuildTheGraph.writeTheNodesXYandRadiusifApplicable();
//                for (int i = 0; i < 1000; i++) {
//                    for (int j = 0; j < 1000; j++) {
//                        if (BuildTheGraph.galaxy[i][j] == null) {
//                            BuildTheGraph.galaxy[i][j] = " ";
//                            GalaxyMapTA.append(BuildTheGraph.galaxy[i][j]);
//                        }
//                        if (BuildTheGraph.galaxy[i][j] != null){
//                            GalaxyMapTA.append(BuildTheGraph.galaxy[i][j]);
//                        }
//                    } GalaxyMapTA.append("\n");
//                }
            }
        });
    }
    private JButton jButton1;
    private JLabel RouteInstructionsLabel;
    private JLabel StartLocationLabel;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane RouteInstTAScrollPane;
    private JScrollPane GalaxyMapScrollPane;
    static JTextArea RouteInstructionsTA;
    static JTextArea GalaxyMapTA;
    public static JTextField StartLocationTF;
    public static JTextField destinationTF;
    static String sourcePlanet;
    static String sourceBase;
    static String sourceAsteroid;
    static int xCoordinate;
    static int yCoordinate;
}
