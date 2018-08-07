package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,sum=0;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++){
	a[i]=in.nextInt();
}
Arrays.sort(a);
for(int i=0;i<a.length-1;i++){
	sum=sum+a[i]+a[i+1];
}
System.out.println(sum);
}
}
