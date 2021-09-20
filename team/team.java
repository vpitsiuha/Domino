import java.util.*;

public class Team {
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
        if ((n>=1)&&(n<=1000)){
	int a[][] = new int[n][3];
        int answer = 0;
	for(int i=0;i<n;i++){
          for(int j=0;j<3;j++){
              a[i][j] = in.nextInt();
              if(j!=0)a[i][0]+=a[i][j];
          }
          if (a[i][0] > 1) answer++;
        }
        System.out.println(answer);
        }
  }
}
