import javax.swing.*;

public class FrameWithPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MyDrawPanel3 panel = new MyDrawPanel3();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(panel);

		frame.setSize(300, 300);

		frame.setVisible(true);
	}
}
