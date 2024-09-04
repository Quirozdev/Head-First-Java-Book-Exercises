import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClientA {

	JTextField outgoing;
	PrintWriter writer;
	Socket sock;

	public static void main(String[] args) {
		SimpleChatClientA gui = new SimpleChatClientA();
		gui.go();
	}

	public void go() {
		// make gui and register a listener with the send button
		JFrame frame = new JFrame("Ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetworking();
		frame.setSize(400, 500);
		frame.setVisible(true);
		// call the setUpNetworking() method
	}

	private void setUpNetworking() {
		// make a Socket, then make a PrintWriter
		try {
			sock = new Socket("127.0.0.1", 5000);
			// assign the PrintWriter to writer instance variable
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public class SendButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			// get the text from the text field and
			String text = outgoing.getText();
			try {
				// send it to the server using the writer (a PrintWriter)
				writer.println(text);
				writer.flush();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}
}
