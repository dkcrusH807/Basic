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
for(int i=1;i<a.length;i++){
	sum=sum+a[i];
}
System.out.println(sum);
}
}
