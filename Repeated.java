package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,count=0;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
Arrays.sort(arr);
for(int i=0;i<=100000000;i++){
	count=0;
	for(int j=0;j<n;j++){
		if(i==arr[j])
			count++;
	}
	if(count>=2){
		System.out.print(i+" ");
	}
}
}
}
