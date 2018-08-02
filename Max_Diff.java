package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,temp,diff=0;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=1;j<n;j++){
		temp=Math.abs(arr[i]-arr[j]);
		if(temp>diff){
			diff=temp;
		}
	}
}
System.out.println(diff);
}
}



