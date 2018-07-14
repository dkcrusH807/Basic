package sql;
import java.util.*;
public class Set {
public static void main(String[] args) {
int n,median,sum=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	sum=sum+arr[i];
	}
median=sum/n;
System.out.println(median);
}
}
