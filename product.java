package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a,b,c=1;
a=in.nextInt();
while(a!=0){
	b=a%10;
	c=c*b;
	a=a/10;
}
System.out.println(c);
}
}
