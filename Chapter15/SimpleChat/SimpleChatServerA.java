import java.io.*;
import java.net.*;

public class SimpleChatServerA {

	public static void main(String[] args) {
		SimpleChatServerA server = new SimpleChatServerA();
		server.go();
	}

	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(5000);

			while(true) {
				Socket sock = serverSock.accept();
				BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
