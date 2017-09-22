import java.io.IOException;




public class ThroughServer {
	public static final int BASE_PORT = 1250;
	ThroughServer(){
		Server3 server = null;
		try {
			server = new Server3(BASE_PORT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			server.server_loop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
