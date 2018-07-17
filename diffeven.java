package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a,b;
a=in.nextInt();
b=in.nextInt();
if((a-b)%2==0)
	System.out.println("even");
else
	System.out.println("odd");
}
}