package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,k,temp=1,temp1=1;
n=in.nextInt();
k=in.nextInt();
for(int i=1;i<=n;i++){
	temp=temp*i;
}
for(int i=1;i<=n-k;i++){
	temp1=temp1*i;
}
System.out.println(temp/(temp1));
}
}



