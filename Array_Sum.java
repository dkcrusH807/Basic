package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int n,r,sum=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++){
	a[i]=in.nextInt();
}
for(int i=0;i<a.length;i++){
	while(a[i]!=0){
		r=a[i]%10;
		sum=sum+r;
		a[i]=a[i]/10;
	}
}
System.out.println(sum);
}
}