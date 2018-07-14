package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
	System.out.println(arr[i]+" "+i);
}
}
}


