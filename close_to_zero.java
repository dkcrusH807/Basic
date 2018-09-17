package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
}
for(int i=-999999999;i<999999999;i++){
for(int j=0;j<n;j++){
if(i==a[j]){
for(int k=0;k<n;k++){
if(i+a[k]==0){
System.out.println(i+""+a[k]);
}
}
}
}
}
}
}
