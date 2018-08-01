package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
for(int i=1;i<n;i++){
	if(n%i==0){
		int y=n/i;
		if(y%2!=0){
			System.out.println(i);
	break;}}
}
}
}

