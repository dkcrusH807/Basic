package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int n,count=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(int i=1;i<=n;i++){
	if(n%i==0)
		System.out.print(i+" ");
}
}
}