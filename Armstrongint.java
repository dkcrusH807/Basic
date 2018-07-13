package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,q,sum=0,r=0;
n=in.nextInt();
  q=in.nextInt();
for(int i=n+1;i<q;i++){
	int temp=i;
	sum=0;
	while(temp!=0){
		r=temp%10;
		sum=sum+(r*r*r);
		temp=temp/10;
		r=0;
	}if(i==sum){
		System.out.println(sum);
}else{
System.out.println("no");
}
}
}
}