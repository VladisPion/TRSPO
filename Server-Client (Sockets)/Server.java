import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) {
        int port =  3000 ; //порт от 1025 до 65535
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Ожидаем подключения клиента");
            Socket socket = ss.accept();
            System.out.println("Got a client :) ");
            System.out.println();
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String line = null;
            while (true){

                line = in.readUTF();
                System.out.println("\n" +
                        "Клиент только что отправил мне эту строку: "+line);
                System.out.println("\n" +
                        "Я отправляю его обратно...");
                out.writeUTF(line);
                out.flush();
                System.out.println("Ожидание следующей строки ...");
                System.out.println();
            }


        }
        catch (Exception ex){

            ex.printStackTrace();
        }

    }
}
