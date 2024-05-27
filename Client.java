import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

public final class Client {
    public Socket socket;
    public PrintWriter out;
    public BufferedReader in;
    public ObjectInputStream ois;
    public ObjectOutputStream oos;
    Client() throws IOException, ClassNotFoundException {
        socket = new Socket("localhost", 12345);
        out = new PrintWriter(socket.getOutputStream(), true); // true для автоочистки
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ois = new ObjectInputStream(socket.getInputStream());
        oos = new ObjectOutputStream(socket.getOutputStream());
    }

    public LinkedList<String> refresh(String request) throws IOException, ClassNotFoundException, InterruptedException {
        out.println(request);
        out.flush(); // Добавлено для уверенности в отправке
        Thread.sleep(500);
        LinkedList<String> answer = new LinkedList<>();
        answer = (LinkedList<String>) ois.readObject();
        return answer;
    }

    public void add(String request, LinkedList<String> answer) throws IOException, InterruptedException{
        out.println(request);
        out.flush();
        Thread.sleep(500);
        oos.writeObject(answer);
        oos.flush();
    }
    
    public void update(String request, LinkedList<String> answer) throws InterruptedException, IOException{
        out.println(request);
        out.flush();
        Thread.sleep(500);
        oos.writeObject(answer);
        oos.flush();
    }
    
    public void del(String request, String answer) throws IOException, InterruptedException{
        out.println(request);
        out.flush();
        Thread.sleep(500);
        out.println(answer);
        out.flush();
    }
    
    public void end(){
        out.println("END");
        out.flush();
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Client client = new Client();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
