package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,q,count=0;
n=in.nextInt();
q=in.nextInt();
for(int i=n+1;i<q;i++){
	for(int j=2;j<i;j++){
		if(i%j==0){
			count=0;
			break;}else count=1;
	}
	if(count ==1 || i==1 ||i==2){
		System.out.println(i);
	}
}
}
}