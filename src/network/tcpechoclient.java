package network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net. ConnectException;

public class tcpechoclient

{

    public static void main(String[] args)throws IOException

    {

        BufferedReader fromServer = null, fromUser = null;

        PrintWriter toServer = null;

        Socket sock = null;

        try

        {

            if (args.length == 0)

                sock = new Socket(InetAddress.getLocalHost(),4000);

            else

                sock = new Socket(InetAddress.getByName(args[0]),4000);

            fromServer = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            fromUser = new BufferedReader(new InputStreamReader(System.in));

            toServer = new PrintWriter(sock.getOutputStream(),true);

            String Usrmsg, Srvmsg;

            System.out.println("Type \"bye\" to quit");

            while (true)

            {

                System.out.print("Enter msg to server : ");

                Usrmsg = fromUser.readLine();

                if (Usrmsg==null || Usrmsg.equals("bye"))

                {

                    toServer.println("bye");

                    break;

                }

                else

                    toServer.println(Usrmsg);

                Srvmsg = fromServer.readLine();

                System.out.println(Srvmsg);

            }

            fromUser.close();

            fromServer.close();

            toServer.close();

            sock.close();
        }

        catch (IOException ioe)

        {

            System.err.println(ioe);

        }
    }
}
