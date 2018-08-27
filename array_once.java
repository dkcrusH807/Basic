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
for(int i=0;i<=1000000000;i++){
	c=0;
	for(j=0;j<n;j++){
		if(i==arr[j]){
			c++;}
	}
	if(c==1){
		System.out.print(i+"");
	}
}
}
}
