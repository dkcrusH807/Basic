package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,temp=0,a=0,b=0,c=0;
n=in.nextInt();
for(int i=2;i<n;i++){
if(n%i==0){
	for(int j=2;j<i;j++){
		b=i%j;
		if(b==0 && i!=2){
			break;
		}
	}if(b==1 ||i==2){
		System.out.print(i+" ");
	}
}
	}

}
}