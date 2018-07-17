package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
int count=0;
str=in.nextLine();
for(int i=0;i<str.length();i++){
	if(str.substring(i,i+1).equalsIgnoreCase("a")||str.substring(i,i+1).equalsIgnoreCase("e")||str.substring(i,i+1).equalsIgnoreCase("i")||str.substring(i,i+1).equalsIgnoreCase("o")||str.substring(i,i+1).equalsIgnoreCase("u")){
		count=1;
}
}
if(count==1)
	System.out.println("yes");
else
	System.out.println("no");
}
}