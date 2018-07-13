package sql;
import java.util.*;
public class Set3 {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a,d,n;
a=scan.nextInt();
int sum=a;
d=scan.nextInt();
n=scan.nextInt();
for(int i=0;i<n;i++){
	sum=sum+a;
	a=a+d;
}
System.out.println(sum-1);
}
}
