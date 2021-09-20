import java.util.*;

public class Taxi {
  public static void main(String args[]){
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int a[] = new int[5];
	  for(int i=0;i<n;i++){
		  a[in.nextInt()]++;
	  }
	  
	  a[4]+=a[3];
	  if(a[3]>a[1]) a[1]=0;
	  else a[1]=a[1]-a[3];
	  a[2]+=a[1]/2+a[1]%2;
	  
     System.out.println(a[4]+a[2]/2+a[2]%2);
  }
}
