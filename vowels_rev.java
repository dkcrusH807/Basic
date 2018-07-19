package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String s;
Scanner in=new Scanner(System.in);
s=in.nextLine();
s=s.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
for(int i=0;i<s.length();i++){
	System.out.print(s.substring(s.length()-(i+1),s.length()-i));	
}
}}

