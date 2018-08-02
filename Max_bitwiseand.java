package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,temp,and=0;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=1;j<n;j++){
		temp=a[i]&a[j];
		if(temp>and){
			and=temp;
		}
		}
	}
System.out.println(and);
}
}



