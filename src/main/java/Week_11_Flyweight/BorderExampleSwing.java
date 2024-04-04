package Week_11_Flyweight;
import javax.swing.*;
import java.awt.*;

public class BorderExampleSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(200, 200));
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(100, 100));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.setLayout(new FlowLayout());
        frame.add(panel1);
        frame.add(panel2);

        frame.pack();
        frame.setVisible(true);
    }
}
