package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
double a;
a=in.nextDouble();
double d=Math.toRadians(a);
double b;
b=in.nextDouble();
double d1=Math.toRadians(b);
double c;
c=in.nextDouble();
double d2=Math.toRadians(c);
if(Math.sin((d1+d2)/2)==Math.cos(d/2)){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}

