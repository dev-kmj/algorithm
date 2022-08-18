import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] attend = new boolean[31]; // 출석여부를 판단하기 위한 배열 생성
 
        for (int i = 0; i < 28; i++) {
            attend[Integer.parseInt(br.readLine())] = true;
        }
        for (int i = 1; i < 31; i++) {
            if (!attend[i]) {
                System.out.println(i);
            }
        }
    }
}
