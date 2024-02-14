import java.io.*;
import java.net.*;

public class Client
{
  public static void main(String[] args)
  {
    int port = 12345;
    String hostname = "localhost";

    try
    (
      Socket socket = new Socket(hostname, port);
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    )
    {
      String data = in.readLine();
      System.out.println((data != null) ? data : "[No data found]");
    }
    catch (IOException exception)
    {
      System.err.println("Error: " + exception.getMessage());
    }
  }
}