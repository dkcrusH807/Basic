package github;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,sum=0,sum1=0;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	sum1=sum1+arr[i];
}
for(int i=0;i<n;i++){
	sum=sum1+arr[i];
	System.out.print(sum+" ");
}
}
}


