import java.io.*;

public class theHumbleProgrammer{
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        System.out.println(name + " makes $120,000 a year. Ha-ha-ha!");
    }
}