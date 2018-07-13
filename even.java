package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,q,temp=0;
n=in.nextInt();
q=in.nextInt();
for(int i=n+1;i<q;i++){
	if(i%2==0)
System.out.println(i);
}
}
}