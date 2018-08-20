package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in= new Scanner(System.in);
int n,count=0;;
n=in.nextInt();
int a[]=new int[n];		
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
}
int k;
k=in.nextInt();
for(int i=0;i<n;i++){
	if(a[i]==k){
		count++;
}
}if(count>0){
System.out.println("Yes "+count+" "+k);}
else{
System.out.println("No");}
}
}

