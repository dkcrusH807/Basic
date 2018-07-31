package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,min=100;
int k;
n=in.nextInt();
k=in.nextInt();
int r;
int l;
int y;
int s;
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
Arrays.sort(arr);
System.out.prinln(arr[3]);
System.out.println(arr[k]);
}
}

