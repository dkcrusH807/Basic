package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
int n,sum=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(int i=1;i<=n;i++){
	sum=sum+i;
}
System.out.println(sum);
}
}