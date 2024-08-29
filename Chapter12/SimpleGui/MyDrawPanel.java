import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		g.setColor(new Color(red, green, blue));
		g.fillOval(70, 70, 100, 100);
	}
}
