package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,n1,count=0;
n=in.nextInt();
n1=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	if(arr[i]==n1)
		count++;
}
System.out.println(count);
}
}


