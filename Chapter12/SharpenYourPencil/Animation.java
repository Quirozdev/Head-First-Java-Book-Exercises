import javax.swing.*;
import java.awt.*;

public class Animation {
	private int x;
	private int y;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	private static final int OVAL_SIZE = 30;

	public Animation() {
		this.x = 0;
		this.y = 0;
	}

	public static void main(String[] args) throws InterruptedException {
		Animation animation = new Animation();
		animation.start();
	}

	public void start() throws InterruptedException {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new MyDrawPanel());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);

		for (int i = 0; i < WIDTH - OVAL_SIZE; i++) {
			Thread.sleep(50);
			x = i;
			y = i;
			frame.repaint();
		}
	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.orange);
			g.fillOval(x, y, OVAL_SIZE, OVAL_SIZE);
		}
	}
}
