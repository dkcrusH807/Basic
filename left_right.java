package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,l,r;
n=in.nextInt();
l=in.nextInt();
r=in.nextInt();
if(n>=l&&n<=r)
	System.out.println("yes");
else
	System.out.println("no");
}
}