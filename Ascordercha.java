package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,count=0;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<1;i++){
	for(int j=1;j<arr.length;j++){
	if(arr[i]>arr[j])
		count++;
}}
System.out.println(count);
}
}
