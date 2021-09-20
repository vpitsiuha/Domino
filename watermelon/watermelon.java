import java.io.*;

public class WaterMelon {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a;
        
        a = Integer.parseInt(br.readLine());
        if ((a%2 == 0) && (a > 2)){System.out.print("YES");}
        else {System.out.print("NO");}
    }
}
