import java.io.IOException;
abstract class RegBase {

    protected int value;
    //abstract public int readReg() throws IOException; 
    public int readReg() throws IOException {
    	return value;
        }
    abstract public void writeReg(int value) throws IOException;
}



