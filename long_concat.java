package github;
import java.util.*;
public class Problems {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str,str2;
str=in.nextLine();
str2=in.nextLine();
if(str.length()==str2.length()){
	System.out.println(str.concat(str2));
}
if(str.length()!=str2.length()){
	System.out.println(str.substring(0,str2.length()).concat(str2));
}
}
}
