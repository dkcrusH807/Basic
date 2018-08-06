package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s;
s=in.nextLine();
int sum=Integer.parseInt(s.substring(0,1))+Integer.parseInt(s.substring(s.length()-1,s.length()));
System.out.println(sum);
}
}
