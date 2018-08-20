package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in= new Scanner(System.in);
int n,I,r,count=0,min=10000000;
n=in.nextInt();
int a[]=new int[n];		
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
}
I=in.nextInt();
r=in.nextInt();
for(int i=I;i<r;i++){
	count=0;
	for(int j=0;j<n;j++){
		if(i==a[j])
			count=1;
	}
	if(count==1){
		if(i<min)
		min=i;
	}
}
System.out.println(min);
}
}

