import java.io.IOException;
import java.util.ArrayList;

class TestCPUthroughServer {
	private ThroughServer serverStream = new ThroughServer();    
    public static void main(String [] args)  {
	try {
		RAM ram = new RAM(1024); // 1GB ram
		instructionList instList=new instructionList();
		ArrayList<String> instructs =instList.loadInstructions();
	    CPUReg regFile = new CPUReg();
	    Controller cnt = new Controller();
	    
	    for(int i=0; i < instructs.size(); i++) {
	    	String [] cmd = instructs.get(i).split(" ");
	    	cnt.executeInstruction(cmd, regFile,ram);
	    	//System.out.println(instructs.get(i));
	    }
	    
	    System.out.println("R3 = " +
			       regFile.readReg("R3"));
	} catch(IOException e) {
	    System.out.println(e);
	}
    }
}

		      
