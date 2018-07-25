package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
for(int i=1;i<=n;i++){
	if(i%2==0){
		if(n%i==0){
			System.out.print(i+" ");
		}
	}
}
}
}



