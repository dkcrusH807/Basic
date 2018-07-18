package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String a;
Scanner in=new Scanner(System.in);
a=in.nextLine();
char ch[]=new char[a.length()];
ch=a.toCharArray();
Arrays.sort(ch);
for(int i=0;i<ch.length;i++){
	System.out.print(ch[i]);
}
}
}