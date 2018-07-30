package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,count=0;
n=in.nextInt();
int temp[]=new int[n];
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
	 temp[i]=arr[i];
}
Arrays.sort(temp);
for(int i=0;i<n;i++){
	if(arr[i]==temp[i]){
		count++;
	}
}
if(count==n){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}


