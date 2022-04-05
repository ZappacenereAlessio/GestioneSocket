package gestionesocket;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(2000);
			System.out.println("Server avviato correttamente");
			
			Socket socket = serverSocket.accept();
			System.out.println("Connessione avvenuta");
			System.out.println("Socket: " + socket);
			
			
		} catch (BindException ex) {
			System.err.println("porta occupata");
		}
		catch (IOException ex) {
			System.err.println("errore avvio server sulla porta 2000");
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
