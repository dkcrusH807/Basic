package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
for(int i=0;i<str.length();i++){
	if(str.charAt(i)>=90&&str.charAt(i)<=122){
		String s="";
		s=s+str.charAt(i);
	System.out.print(s.toUpperCase());
	s="";
	}
	if(str.charAt(i)>=65&&str.charAt(i)<=90){
		String s="";
		s=s+str.charAt(i);
		System.out.print(s.toLowerCase());
	s="";
		}

}
}
}


