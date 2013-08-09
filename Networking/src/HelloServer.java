import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class HelloServer {
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9090);
			
			while (true) {
				
				Socket client = server.accept();
				PrintWriter output = new PrintWriter(client.getOutputStream(),true);
				Scanner input = new Scanner(client.getInputStream());
				
				output.println("WASSSSAAAAPPP MY HOMIEEE BWOOY!!");
				
				client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
