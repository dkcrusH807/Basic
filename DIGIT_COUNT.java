package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int num,k=0,r;
num=in.nextInt();
while(num!=0){
	r=num%10;
	k++;
	num=num/10;
}
System.out.println(k);
}
}	


