import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Server {

    public static void main (String[] args) throws IOException {
        System.out.println("start");
        ServerSocket serverSocket = new ServerSocket(8080); // TODO: create a server socket
        Socket clientSocket = serverSocket.accept(); // TODO: wait for a connection...
        System.out.println("accept client connection..");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
        //change
        
        //changesgit push -u
        PrintWriter out = new PrintWriter(
            clientSocket.getOutputStream(), true); 
        out.println("connection made");
        // TODO: create an output stream (Writer) for the socket

        String inputLine = null;
        while ((inputLine = in.readLine()) !=null) {
            System.out.println(inputLine.toUpperCase());
            if (inputLine.equals ("stop")) {
                break;
            }
            out.println(inputLine.toUpperCase());
        }
        System.out.println("sever stopped");
}

}
