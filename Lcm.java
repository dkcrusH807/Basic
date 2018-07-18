package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a,b,temp=0;
a=in.nextInt();
b=in.nextInt();
for(int i=1;i<=a&&i<=b;i++){
	if(a%i==0&&b%i==0)
		temp=i;
}
int lcm=(a*b)/temp;
System.out.println(lcm);
}
}