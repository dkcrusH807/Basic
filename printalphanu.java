package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String a;
Scanner in=new Scanner(System.in);
a=in.nextLine();
for(int i=0;i<a.length();i++){
	if(a.charAt(i)>=48&&a.charAt(i)<=57)
	System.out.print(a.charAt(i));
}
}
}