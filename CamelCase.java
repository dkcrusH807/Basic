package List;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s;
s=in.nextLine();
String[]str=s.split(" ");
for(int i=0;i<str.length;i++){
	String s1=str[i].toString();
	System.out.print(s1.substring(0,1).toUpperCase()+s1.substring(1,s1.length()));
}
}
}
