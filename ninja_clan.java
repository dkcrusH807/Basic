package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a[]=new int[2]; 
int b[]=new int[2];
int c[]=new int[2];
for(int i=0;i<2;i++){
	a[i]=in.nextInt();
}
for(int i=0;i<1;i++){
System.out.println(a[i]-a[i+1]);}
for(int i=0;i<2;i++){
b[i]=in.nextInt();
}
for(int i=0;i<b.length-1;i++){
System.out.println(b[i]-b[i+1]);}
for(int i=0;i<2;i++){
c[i]=in.nextInt();}
for(int i=0;i<c.length-1;i++){
System.out.println(c[i]-c[i+1]);}
}
}
