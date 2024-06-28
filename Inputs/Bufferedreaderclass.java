package Inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreaderclass {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter String");
        String str = reader.readLine();
        System.out.println(str);
        System.out.println("enter number");
        int a = Integer.parseInt(reader.readLine());
        System.out.println(str);
        System.out.println("enter number");
        float b = Float.parseFloat(reader.readLine());
        System.out.println(str);


    }

}
