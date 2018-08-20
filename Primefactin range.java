package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,count=0;
n=in.nextInt();
for(int i=2;i<=n;i++){
	count=0;
	if(n%i==0){
		for(int j=2;j<=n;j++){
			if(i%j==0){
			count++;	
			}
		}
		if(count==1){
			System.out.print(i+" ");
		}
	}
}
}
}