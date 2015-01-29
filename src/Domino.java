import java.util.*;

public class Domino {
    public static void main(String args[]){
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int m = in.nextInt();
	  
          int Answer = (int)Math.ceil( ( n * m ) / 2 );
          
     System.out.println(Answer);
  }
}