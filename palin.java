package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,k=0,r=0;
n=in.nextInt();
int temp=n;
while(n!=0){
	r=n%10;
    k=k*10+r;
    n=n/10;
}
if(k==temp){
System.out.println("yes");
}else{
System.out.println("no");	
}
}
}