package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,r,count=1,temp;
n=in.nextInt();
r=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
Arrays.sort(arr);
for(int i=0;i<n;i++){
	count=1;
	for(int j=i+1;j<n;j++){
		if(arr[i]==arr[j]){
			count++;
		}
}
if(count==r){
System.out.println(arr[i]);
	}
}
}
}


