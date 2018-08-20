package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,mul=1;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	mul=mul*a[i];
}
if(mul%2==0){
	System.out.println("Even");
}else{
	System.out.println("Odd");
}
}
}