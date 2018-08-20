 package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,t1=122;
n=in.nextInt();
String t2="";
String s[]=new String[n]; 
for(int i=0;i<n;i++){
	s[i]=in.next();
}
for(int i=0;i<n;i++){
   char str=s[i].charAt(0);
   int t=(int)str;
	if(t<t1){
		t1=t;
		t2=s[i];
	}
}
System.out.println(t2);
}
}