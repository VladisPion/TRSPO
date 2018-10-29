import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) {
        int serverport = 3000;
        String line = null;
        String address = "localhost";
        try {
           InetAddress ipAddress =  InetAddress.getByName(address);
            System.out.println("IP-адрес " + address + " и порт " + serverport);
            Socket socket = new Socket(ipAddress,serverport);
            System.out.println("\n" +
                    "Да! Я просто овладел программой.");
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            //поток для чтения клавиатуры
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите что-то и нажмите enter. Отправьте его на сервер и скажите, что он думает.");
            System.out.println();
               while (true){
                line = keyboard.readLine();
                System.out.println("Отправка этой строки на сервер...");
                out.writeUTF(line); // отсылаем введенную строку текста серверу.
                out.flush(); // заставляем поток закончить передачу данных.
                line = in.readUTF(); // ждем пока сервер отошлет строку текста.
                System.out.println("Сервер был очень вежлив. Послал мне это : " + line);
                System.out.println("Похоже, сервер доволен нами. Идем дальше и вводим больше строк.");
                System.out.println();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
