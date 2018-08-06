package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int s,e,sum=0;
s=in.nextInt();
e=in.nextInt();
for(int i=s;i<=e;i++){
	if(i%2!=0){
		sum=sum+i;
	}
}
System.out.println(sum);
}
}
