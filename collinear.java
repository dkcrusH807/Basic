package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a,b,c,x,y,z;
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
x=in.nextInt();
y=in.nextInt();
z=in.nextInt();
int a1=x*(y-z)+y*(x-z)+z*(x-y);
if(a1==0){
	System.out.println("yes");}else{
		System.out.println("no");
	}
}
}