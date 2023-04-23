import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class NewFrame extends JFrame implements ActionListener {
    JButton button = new JButton();

    public NewFrame() {

        setTitle("LOL");
        setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                super.paintComponent(g);
                GradientPaint gradient = new GradientPaint(0, 0, Color.RED, getWidth(), getHeight(), Color.BLUE);
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };



        JButton button = new JButton("CLICK ME");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel();
                JFrame newFrame = new JFrame();

                newFrame.setSize(300, 300);
                newFrame.setVisible(true);
                label.setText("NOTHING");

                label.setHorizontalTextPosition(JLabel.CENTER);
                label.setVerticalTextPosition(JLabel.TOP);
                label.setForeground(new Color(0x00ff00));
                label.setFont(new Font("Lucida Console", Font.PLAIN, 20));
                label.setIconTextGap(-5);
                label.setBackground(Color.BLACK);
                label.setOpaque(true);
                label.setVerticalAlignment(JLabel.CENTER);
                label.setHorizontalAlignment(JLabel.CENTER);

                newFrame.add(label);

            }
        });
        button.setBackground(Color.blue);

        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




    @Override
    public void actionPerformed(ActionEvent act) {
        if (act.getSource() == button){
            System.out.println("LOL");
        }
    }
}
class frame {
    public static void main(String []args) {

        new NewFrame();
    }
}