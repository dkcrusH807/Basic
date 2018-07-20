package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
String[]s=new String[n];
for(int i=0;i<s.length;i++){
	s[i]=in.next();	
	}
Arrays.sort(s);
for(int i=0;i<s.length;i++){
System.out.println(s[i]);
}
}
}

