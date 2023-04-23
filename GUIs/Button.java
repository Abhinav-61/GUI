import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    JButton button = new JButton();
    JLabel label = new JLabel();
    MyFrame()
    {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.add(label);

        button.setBounds(530, 464, 305, 20);
        button.setBackground(Color.gray);
        button.setForeground(Color.cyan);
        button.setBackground(Color.DARK_GRAY);
        button.setAlignmentX(CENTER_ALIGNMENT);
        button.setAlignmentY(CENTER_ALIGNMENT);

    }

    @Override
    public void actionPerformed(ActionEvent g) {
      
    }
}
public class Button
{
    public static void main(String[] args)
    {
       new MyFrame();
    }
}
