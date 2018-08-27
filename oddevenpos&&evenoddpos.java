package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,j=0,c=0;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	if(i%2==0){
		if(arr[i]%2!=0){
			System.out.print(arr[i]+" ");
		}
	}
	if(i%2!=0){
		if(arr[i]%2==0){
			System.out.print(arr[i]+" ");
		}
	}
	
}
}
}

