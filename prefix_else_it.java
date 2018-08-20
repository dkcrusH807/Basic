package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,count=0,sum=0;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	if(a[i]%2==0){
	System.out.print((sum+=a[i])+" ");}
	else{
		System.out.print(a[i]+" ");
	}
}
}
}