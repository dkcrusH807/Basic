package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,fact=1;
n=in.nextInt();
for(int i=1;i<=n;i++){
	fact=fact*i;
}
System.out.println(fact);
}
}
