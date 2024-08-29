import javax.swing.*;
import java.awt.*;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.getContentPane().add(BorderLayout.CENTER, new MyPanel());
		frame.getContentPane().add(BorderLayout.SOUTH, new Button("Change colors"));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
