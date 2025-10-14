package ex_16_Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab_166_BufferReaderInput {
    public static void main(String[] args) {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of N");
        int N = 0;
        try {
            N = Integer.parseInt(bufferReader.readLine().trim());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Scanner scanner = new Scanner(System.in);
//        int N1 scanner.nextInt();
//
        System.out.println(N);
    }
}
