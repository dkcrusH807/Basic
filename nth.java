package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in); 
int n,a;
n=in.nextInt();
int k[]=new int[n];
for(int i=0;i<n;i++){
	k[i]=in.nextInt();
}
a=in.nextInt();
for(int i=0;i<n;i++){
	if((a-1)==(i))
		System.out.println(k[i]);
}
}
}