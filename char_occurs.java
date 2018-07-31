package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s;
char ch;
int count=0;
s=in.nextLine();
ch=in.next().charAt(0);
for(int i=0;i<s.length();i++){
	if(s.charAt(i)==ch)
		count++;
}
System.out.println(count);
}
}

