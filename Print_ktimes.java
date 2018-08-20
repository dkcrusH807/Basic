package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,k,count=0;
n=in.nextInt();
k=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<=1000000;i++){
	count=0;
	for(int j=0;j<n;j++){
		if(i==arr[j]){
			count++;
		}
	}
	if(count==k){
		System.out.println(i);
	}
}
}
}