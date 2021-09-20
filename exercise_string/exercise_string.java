import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExerciseString {

    public static void main(String[] args) throws IOException {
        
        String Work;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        
        Work = br.readLine();
        Work = Work.toLowerCase();
        int Size = Work.length();
        
        char[] Array = Work.toCharArray();
        char[] Positive = new char[1000];
        int Counter = 0;
        
        for (int i = 0; i<Size; i++)
        {
            if ((Array[i] != 'a')&&(Array[i] != 'o')&&(Array[i] != 'y')&&(Array[i] != 'e')&&(Array[i] != 'u')&&(Array[i] != 'i'))
            {
                Positive[Counter] = '.';
                Counter++;
                Positive[Counter] = Array[i];
                Counter++;
            }
        }       
        
        for (int i = 0; i<Counter; i++)
        {
            System.out.print(Positive[i]);}
        
    }
}
