package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,j=0;
n=in.nextInt();
int arr[]=new int[n];
int brr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	if(i==arr[i]){
		System.out.print(arr[i]+"");
 }
}
}
}
