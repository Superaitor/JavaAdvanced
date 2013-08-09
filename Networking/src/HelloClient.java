import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class HelloClient {
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter the server's IP adress:");
	    		String ip = keyboard.nextLine();
	    		
	    		try {
					Socket sock = new Socket(ip,9090);
					PrintWriter output = new PrintWriter(sock.getOutputStream());
					Scanner input = new Scanner(sock.getInputStream());
					
					String in = input.nextLine();
					
					System.out.println(in);
					
					sock.close();
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					
				}
	}

}
