package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String str;
int count=0;
Scanner in=new Scanner(System.in);
str=in.nextLine();
for(int i=0;i<str.length();i++){
	if(str.charAt(i)==32)
		count++;
}
System.out.println(count);
}
}
