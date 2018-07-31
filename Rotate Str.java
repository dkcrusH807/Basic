package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s,s1;
s=in.nextLine();
int n;
n=in.nextInt();
for(int i=1;i<=n;i++){
System.out.println(s.substring(s.length()-i,s.length())+s.substring(0,s.length()-n));}
}
}

