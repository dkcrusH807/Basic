package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int A,D,N,sum=0;
A=in.nextInt();
D=in.nextInt();
N=in.nextInt();
for(int i=1;i<=N;i++){
	sum=sum+A;
	A=A+D;
}
System.out.println(sum);
}
}
