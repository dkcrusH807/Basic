package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,r=0,sum=0;
n=in.nextInt();
int temp=n;
while(n!=0){
	r=n%10;
	sum=sum+(r*r*r);
	n=n/10;
	r=0;
}
if(sum==temp){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}