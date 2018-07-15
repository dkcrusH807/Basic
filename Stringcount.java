package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String str;
Scanner in=new Scanner(System.in);
str=in.nextLine();
String []str1=str.split(" ");
StringBuilder str2=new StringBuilder();
for(String s:str1){
	str2.append(s);
}
str=str2.toString();
System.out.println(str.length());
}
}
