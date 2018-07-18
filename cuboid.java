package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int l,b,h;
Scanner in=new Scanner(System.in);
l=in.nextInt();
b=in.nextInt();
h=in.nextInt();
System.out.println(2*((l*b)+(b*h)+(h*l)));
System.out.println(l*b*h);
}
}