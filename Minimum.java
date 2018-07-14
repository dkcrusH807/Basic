package sql;
import java.util.*;
public class Set3 {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n,min=99;
n=scan.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=scan.nextInt();
}
for(int i=0;i<n;i++){
	if(arr[i]<min)
		min=arr[i];
}
System.out.println(min+" ");
}
}
