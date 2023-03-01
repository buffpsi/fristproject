package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step1 {
    public static void main(String args[]) throws IOException {
        wise_saying_program wiseSayingProgram = new wise_saying_program();
        wiseSayingProgram.run();

    }
}

class wise_saying_program{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    void run() throws IOException {
        System.out.println("==명언 앱==");
        System.out.print("명령)");
        StringTokenizer st = new StringTokenizer(br.readLine());
    }
}