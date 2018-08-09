package github;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s[]=new String[6];
for(int i=0;i<s.length;i++){
	s[i]=in.next();
}
String str;
str=in.next();	
for(int i=0;i<s.length;i++){
	if(s[i].equals(str)){
		System.out.println(i+1);
	}
}
}
}


