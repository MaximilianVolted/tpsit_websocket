import java.io.*;
import java.net.*;

public class Server
{
  public static void main(String[] args) throws IOException
  {
    int port = 12345;
    ServerSocket serverSocket = new ServerSocket(port);
    System.out.println("Server in ascolto sulla porta " + port);

    try (Socket clientSocket = serverSocket.accept())
    {
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      out.println("Ciao client!");
    }
    finally
    {
      serverSocket.close();
    }
  }
}