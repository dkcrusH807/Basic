package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,n1;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=in.nextInt();
}
n1=in.nextInt();
int arr1[]=new int[n1];
for(int i=0;i<n1;i++){
	arr1[i]=in.nextInt();
}
String s="",s1="";
for(int i=0;i<n;i++){
	s=s+Integer.toString(arr[i]);
}
for(int i=0;i<n1;i++){
	s1=s1+Integer.toString(arr1[i]);
}
String s3=s+s1;
String str[]=s3.split("");
Arrays.sort(str);
for(int i=0;i<str.length;i++){
	System.out.print(str[i]+" ");
}
}
}



