import java.io.*;

public class LongWords {

    public static void main(String[] args) throws IOException {
        
        int Number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        Number = Integer.parseInt(br.readLine());
        
        String Words[];
        Words = new String[Number];
        
        for (int i = 0; i < Number; i++)        
        {
            Words[i] = br.readLine();
        }
        
        int LengthString;
        
        for (int i = 0; i < Number; i++)        
        {
            if ( (Words[i].length()) >10)
            {
                LengthString = Words[i].length();
                Words[i] =  (Words[i].substring(0, 1)) + Integer.toString(LengthString - 2) + (Words[i].substring(LengthString-1, LengthString));
                System.out.println(Words[i]);
            }
            else {System.out.println(Words[i]);}
        }
    }
}
