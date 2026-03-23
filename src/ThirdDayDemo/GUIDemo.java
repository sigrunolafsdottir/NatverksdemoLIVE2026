package ThirdDayDemo;

import javax.swing.*;
import java.awt.*;


public class GUIDemo extends JFrame  {

    //för att hålla andra komponenter
    JPanel groundPanel = new JPanel();
    JPanel northLabelPanel = new JPanel();
    JLabel label = new JLabel("Hello World");
    JLabel label2 = new JLabel("Another Message");
    JPanel southButtonPanel = new JPanel();
    JButton button = new JButton("Klicka här");
    JButton exit = new JButton("Avsluta");

    public GUIDemo() {
        add(groundPanel);
        groundPanel.setLayout(new BorderLayout());
        groundPanel.add(northLabelPanel, BorderLayout.NORTH);
        groundPanel.add(southButtonPanel, BorderLayout.SOUTH);

        northLabelPanel.setLayout(new FlowLayout());
        northLabelPanel.add(label);
        northLabelPanel.add(label2);

        southButtonPanel.setLayout(new FlowLayout());
        southButtonPanel.add(button);
        southButtonPanel.add(exit);

        //setSize(300, 300);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUIDemo::new);
    }

}
