package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,r=0,k=0,c=0;
n=in.nextInt();
while(n!=0){
	r=n%10;
	c++;
	n=n/10;
}
System.out.println(c);
}
}