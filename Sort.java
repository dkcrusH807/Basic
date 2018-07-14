package sql;
import java.util.*;
public class Set {
public static void main(String[] args) {
	int n,temp=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=in.nextInt();
	}
	Arrays.sort(arr);
			
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}