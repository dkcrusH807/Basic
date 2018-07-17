package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
StringBuffer sb=new StringBuffer(str);
sb.reverse();
String rev=sb.toString();
if(str.equals(rev))
	System.out.println("yes");
else
	System.out.println("no");
}
}