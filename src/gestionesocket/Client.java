package gestionesocket;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
	public static void main(String[] args) {
	
	try {
	Socket socket = new Socket("127.0.0.1",2000);
	
	} catch (IOException ex) {
		System.err.println("errore nella connessione server alla porta 2000");
		Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
	}
  }
}
