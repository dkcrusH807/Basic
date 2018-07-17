package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a,b,t=0;
a=in.nextInt();
b=in.nextInt();
for(int i=1;i<=a;i++){
	for(int j=0;j<b;j++)
		if(a%i==0&&b%i==0)
		t=i;	
}
System.out.println(t);
}
}
