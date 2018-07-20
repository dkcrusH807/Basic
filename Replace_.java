package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
String s=str.replaceAll(" ","0");
s=s.replaceAll("0","");
System.out.println(s); 
}
}

