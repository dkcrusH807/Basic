package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,count=0;
n=in.nextInt();
for(int i=1;i<=n;i++){
	if((i*i)==n){
		count=1;
		break;
	}else{
		count=0;
	}
}
if(count==1){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}




