import java.io.IOException;

public class RAM implements MemInterface{
	int []memory;
	public RAM(int size) {
		int sizeInMb = size;
		memory=new int[sizeInMb/4];
	}
	public int lw(String address) throws IOException{
		try{
			return memory[Integer.parseInt(address)-1];
		}
		catch(ArrayIndexOutOfBoundsException e){
			throw new IOException();
		}
	}
	public void sw(String address, int val) throws IOException{
		try{
			memory[Integer.parseInt(address)-1]=val;
		}
		catch(ArrayIndexOutOfBoundsException e){
			throw new IOException();
		}
	}
    public int cacheHits(){
    	return 1;
    }
    public int cacheMisses(){
    	return 0;
    }
}
