package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int n,n1=0,n2=1,n3=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(int i=0;i<n;i++){
	if(n==0){
		System.out.println(n1);}
	if(n==1){
		System.out.println(n1+" "+n2);}
	else if(i==0){
		System.out.print(n1+" "+n2);}
	if(n>2){
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
	}
}
}
}

