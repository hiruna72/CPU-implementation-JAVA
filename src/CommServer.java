

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

class CommServer extends Thread implements accessInstructions {  
	private ArrayList<String> instructions;
    private Socket connectionSocket; 
    boolean passInstructions=false;
    public CommServer(Socket s) { 
    	this.connectionSocket = s; 
    }
    

    public void run() { 
	try { 
	    BufferedReader in = new 
		BufferedReader(new InputStreamReader(this.connectionSocket.getInputStream()));
	    PrintWriter out = new 
		PrintWriter(new OutputStreamWriter(this.connectionSocket.getOutputStream()));	 
	    String line; 
	    for(line = in.readLine(); 
		line != null && !line.equals("quit"); 
		line = in.readLine()) {  
		//out.print(line + "\n"); 
	    	instructions.add(line);
	    	out.flush();	    
	    } // for loop
	    passInstructions=true;
	}// try 
	catch (IOException e) { 
	    System.out.println(e); 
	} 
	try { 	    
	    this.connectionSocket.close(); 
	} catch(IOException e) {}
	
    }


	@Override
	public ArrayList<String> loadInstructions() throws IOException {
		if(passInstructions){
			return instructions;
		}
		return null;
	}
	    
	
}