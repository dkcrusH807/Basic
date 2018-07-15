package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String s;
int count=0;
Scanner in=new Scanner(System.in);
s=in.nextLine();
for(int i=0;i<s.length();i++){
	if(s.charAt(i)>=48&&s.charAt(i)<=57){
		count++;
	}
}
System.out.println(count);
}
}


