package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String n;
int k,p;
n=in.nextLine();
k=in.nextInt();
p=in.nextInt();
p=k+p;
System.out.println(n.substring(p-1,p));
}
}
