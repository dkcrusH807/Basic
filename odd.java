package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,q;
n=in.nextInt();
q=in.nextInt();
for(int i=n;i<=q;i++){
	if((n+i)%2!=0)
		System.out.println(n+i);
}
}
}