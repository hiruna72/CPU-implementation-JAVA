
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 { 

    private static ServerSocket serverSocket; 
    private static int socketNumber; 

           
    public Server3(int socket) throws IOException { 
	serverSocket = new ServerSocket(socket); 
	socketNumber = socket; 
    }

   
    public void server_loop() throws IOException { 
	while(true) { 
	    Socket socket = serverSocket.accept(); 	    
	    CommServer worker = new CommServer(socket); 
	    worker.start(); 
	}
    }

    
}



