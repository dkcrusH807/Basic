package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int num=0;
num=in.nextInt();
for(int i=0;i<=num;i++){
	if(i%2!=0){
		if(num%i==0){
			System.out.print(i+" ");
		}
	}
}
}
}

