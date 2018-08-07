package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,sum=0;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++){
	a[i]=in.nextInt();
}
Arrays.sort(a);
int j=0,t;
int temp[]=new int[n];
for(int i=a.length-1;i>=0;i--){
	t=a[i];
	temp[j]=t;
	j++;
}
for(j=0;j<a.length;j++){
System.out.print(temp[j]+" ");
System.out.println(n-j+" ");
}
}
}
