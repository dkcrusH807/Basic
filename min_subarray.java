package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,count=0,sub=0,min=1000000;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
for(int i=0;i<1000000;i++){
	count=0;
	for(int j=0;j<n;j++){
		if(i==a[j])
	count=1;
	}
	if(count==1){
		for(int k=0;k<n;k++)
			sub=Math.abs(a[k]-i);
		if(sub<min)
			min=sub;
	}
}
System.out.println(min);
}
}