package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
double a;
a=in.nextDouble();
double d=Math.toRadians(a);
d=Math.sin(d);
String str=Double.toString(d);
System.out.println(str.substring(0,4));
}
}

