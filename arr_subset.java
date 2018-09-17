package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,n1,count=0;
n=in.nextInt();
n1=in.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
}
for(int i=0;i<n1;i++){
	b[i]=in.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=0;j<i+1;j++){
	 if(a[i]==b[j])
			count++;
	}
}
if(count==n1){
	System.out.println("YES");
}else{
	System.out.println("NO");
}
}
}





