package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,temp;
n=in.nextInt();
int arr[]=new int[n];
int arr1[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<n;i++){
arr1[i]=in.nextInt();
}
Arrays.sort(arr);
Arrays.sort(arr1);
for(int j=0;j<n;j++){
	for(int k=0;k<n;k++){
	if(arr[j]==arr1[k]){
		System.out.print(arr[j]+" ");
	}
	}
}
}
}



