import java.awt.Color;

import javax.swing.*;

public class Swing {

    public static void main(String []args)
    {
        JFrame frame = new JFrame ("Swing TAb");
        frame.setBounds(200, 2, 800, 500);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setVisible(true);
    }
}