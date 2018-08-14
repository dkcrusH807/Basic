package github;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,l=0;
n=in.nextInt();
String s1="";
String s[]=new String[n];
for(int i=0;i<s.length;i++){
	s[i]=in.next();
}
for(int i=0;i<s.length;i++){
	if(s[i].length()>l){
		l=s[i].length();
		s1=s[i];
	}
}
System.out.print(s1);
}
}
