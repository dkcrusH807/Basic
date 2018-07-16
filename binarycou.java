package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s;int count=0;
s=in.nextLine();
for(int i=0;i<s.length();i++){
if(s.charAt(i)==48||s.charAt(i)==49){
	count++;
}}
if(count==s.length())
	System.out.println("yes");
else
	System.out.println("no");
}
}	


