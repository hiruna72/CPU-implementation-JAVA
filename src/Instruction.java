import java.io.IOException;

interface Instruction {
//    public void execute(String [] agrs, CPUReg regFile)
//	throws IOException;
    public void execute(String [] agrs, CPUReg regFile,RAM ram)
	throws IOException;
}
