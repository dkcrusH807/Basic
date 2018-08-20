package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String s,s1,s2="";
s=in.nextLine();
s1=in.nextLine();
s2=s.replaceAll(s1,"");
System.out.println(s2);
}
}