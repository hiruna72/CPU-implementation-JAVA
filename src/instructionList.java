import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class instructionList implements accessInstructions{
	private ArrayList<String> instructions;
	int instructionCacheSize=100;
	instructionList() {
		instructions = new ArrayList<String>();
        String instFile = "C:/Hiruna/eclipse/workLoad/CPU-JavaImplement/src/instructionList.txt";
        String line = "";
        int j=0;
        try (BufferedReader br = new BufferedReader(new FileReader(instFile))) {
        	while ((line = br.readLine()) != null && j<instructionCacheSize) {
            	instructions.add(line);
				j++;        		
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
}
	@Override
	public ArrayList<String> loadInstructions() throws IOException {
		return instructions;
	}
}