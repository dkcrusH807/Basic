package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,count=0;
n=in.nextInt();
for(int i=1;i<n;i++){
	if(n%i==0)
		count++;
}
if(count==1)
	System.out.println("yes");
else
	System.out.println("no");
}

}