package List;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int n,r,temp;
Scanner in=new Scanner(System.in);
n=in.nextInt();
while(n!=0){
	r=n%10;
	temp=r;
	n=n/10;
	System.out.print(temp);
}
}
}