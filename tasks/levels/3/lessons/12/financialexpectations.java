//Use the keyboard to enter the number n.
// Display the phrase "I will earn $n per hour" on the screen.

import java.io.*;

public class financialexpectations{
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sNum = bufferedReader.readLine();
        int num = Integer.parseInt(sNum);
        System.out.println("I will earn $" + num + " per hour");
    }
}