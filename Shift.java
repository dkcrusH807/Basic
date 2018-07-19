package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
int temp;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<2;i++){
	temp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
}
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+"");
}}
}
