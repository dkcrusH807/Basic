package github;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,n1;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
n1=in.nextInt();
int arr1[]=new int[n1];
for(int i=0;i<n1;i++){
	arr1[i]=in.nextInt();
}
Arrays.sort(arr);
Arrays.sort(arr1);
for(int i=0;i<n;i++){
	for(int j=0;j<n1;j++){
		if(arr[i]==arr1[j]){
			System.out.println(arr[i]+" ");
		}
	}
}
}
}


