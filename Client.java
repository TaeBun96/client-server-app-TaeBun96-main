import java.net.*;
import java.io.*;

 class Client {
	public static void main(String[] args) {
    	// make changes
		//changes
		
		try{
			Socket socket = new Socket("localhost", 8080);	
			BufferedReader in = new BufferedReader(
			new InputStreamReader(socket.getInputStream())
			);
		
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader stdin = new BufferedReader(
					new InputStreamReader(System.in));

			String fromServer = null;
			while((fromServer = in.readLine()) != null) {
				System.out.println("Server: " + fromServer) ;
					
					String fromUser = stdin.readLine();
					out.println(fromUser);
					if(fromUser.equals("stop")) {
				    break;
					} 

				}
				System.out.println(fromServer);
			} catch(IOException uhe) {
				System.out.println("Bad IP");
			}
			System.out.println("client stopped");
		}

	}
			
		 


