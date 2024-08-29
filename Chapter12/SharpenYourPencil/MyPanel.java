import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}
