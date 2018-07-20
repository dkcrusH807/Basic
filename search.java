package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,s,count=0;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
s=in.nextInt();
for(int i=0;i<arr.length;i++){
	if(arr[i]==s){
		count=1;
	}
}
if(count==1){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}


