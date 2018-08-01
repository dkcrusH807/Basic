package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,max=0;
n=in.nextInt();
String s="";
int arr[]=new int[n];
for( int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	if(arr[i]>max){
		max=arr[i];
	}
}
System.out.println(max);
}
}


