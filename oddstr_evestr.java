package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
for(int i=0;i<str.length();i++){
	if(i%2==0)
		System.out.print(str.charAt(i));}
System.out.print(" ");
for(int i1=0;i1<str.length();i1++){
	if(i1%2!=0)
		System.out.print(str.charAt(i1));}
}
}
