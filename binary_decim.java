package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int p=0;
double dec=0;
while(n!=0){
	dec=dec+(n%10*(Math.pow(2,p)));
	n=n/10;
	p++;
}
System.out.println(dec);
}
}



