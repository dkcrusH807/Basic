package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,s;
n=in.nextInt();
int arr[]=new int[n];
for( int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
Arrays.sort(arr);
s=in.nextInt();
for(int i=0;i<n;i++){
	if(arr[i]==s)
		System.out.println(i+1);
}
}
}


