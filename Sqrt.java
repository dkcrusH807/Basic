package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int a,b;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
int c=(int)(Math.sqrt(a*b));
if(Math.pow(c,2)==a*b)
	System.out.println("yes");
else
	System.out.println("no");
	}
}
