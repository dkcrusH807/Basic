package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,r,sum=0;
n=in.nextInt();
while(n!=0){
	r=n%10;
	sum=sum+r;
	n=n/10;
}
System.out.println(sum);
}
}

