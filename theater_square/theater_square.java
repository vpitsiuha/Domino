import java.io.*;

public class TheaterSquare {

    public static void main(String[] args) throws IOException{
         
        long n,m,a;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String ss[]=s.split(" ",3); // Разбиение строки по частям, каждая часть кончается пробелом, всего 3 части
        
        n=Integer.parseInt(ss[0]);
        m=Integer.parseInt(ss[1]);
        a=Integer.parseInt(ss[2]);
                        
        if(n%a==0){n=n/a;}
        else{n=(n/a)+1;}

        if((m)%a==0){m=((m)/a);}
        else{m=((m)/a)+1;}

        a=n*m;
         
        System.out.println(a);         
    }
}
