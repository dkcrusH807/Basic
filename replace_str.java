package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
if(str.length()%2==0){
str=str.replace(str.substring(str.length()/2-1,str.length()/2+1),"**");
System.out.println(str);}
if(str.length()%2!=0){
str=str.replace(str.substring(str.length()/2,str.length()/2+1),"*");
System.out.println(str);}
}
}