import java.awt.*;
import javax.swing.*;

public class Animate extends JFrame {
   private static final long serialVersionUID = 1L;
   private int x = 0, y = 0, velX = 5, velY = 5;

   public Animate() {
      setTitle("2D Animation");
      setSize(500, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      add(panel);

      setVisible(true);

   }

   JPanel panel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
         Graphics2D g2d = (Graphics2D) g;
         super.paintComponent(g);
         GradientPaint gradient = new GradientPaint(0, 0, Color.cyan, getWidth(), getHeight(), Color.GREEN);
         g2d.setPaint(gradient);
         g2d.fillRect(0, 0, getWidth(), getHeight());

      }
   };

   public void paint(Graphics g) {
      super.paint(g);
      Graphics2D g2d = (Graphics2D) g;
      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
      g2d.setColor(Color.RED);
      g2d.fillOval(x, y, 50, 50);
   }

   public void move() {
      if (x + velX < 0 || x + velX > getWidth() - 50)
         velX = -velX;
      if (y + velY < 0 || y + velY > getHeight() - 50)
         velY = -velY;
      x += velX;
      y += velY;
      repaint();
   }

   public static void main(String[] args) throws InterruptedException {
      Animate animation = new Animate();
      while (true) {
         animation.move();
         Thread.sleep(50);
      }
   }
}
