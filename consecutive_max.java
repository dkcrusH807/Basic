package sql;
import java.util.*;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
String s="";
int arr[]=new int[n];
for( int i=0;i<n;i++){
	arr[i]=in .nextInt();
}
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(arr[i]>arr[j]||arr[i]==arr[j]){
			s=s+arr[i];
		}else{
			s=s+arr[j];
		}
	}
}
for(int i=0;i<n-1;i++){	
System.out.print(s.charAt(i)+" ");}
}
}


