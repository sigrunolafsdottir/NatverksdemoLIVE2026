package ThirdDayDemo;

import javax.swing.*;


public class GUIDemo extends JFrame  {

    //för att hålla andra komponenter
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hello World");
    JButton button = new JButton("Klicka här");

    public GUIDemo() {

        add(panel);
        panel.add(label);
        panel.add(button);

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
