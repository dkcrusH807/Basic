package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,n1=0,count=0;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=1;i<=1000000;i++){
	count=0;
	for(int j=0;j<n;j++){
		if(arr[j]%i==0)
			count++;
	}
	if(count==n){
		if(i>n1)
			n1=i;
		
	}
}
System.out.println(n1);
}
}