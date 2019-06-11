import java.io.*;

public class predictions{
    public static void main( String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        String sNum1 = bufferedReader.readLine();
        String sNum2 = bufferedReader.readLine();
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        System.out.println(name + " will receive " + num1 + " in " + num2 + " years.");
    }
}