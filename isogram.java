package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
int count=0;
str=in.nextLine();
char []ch=str.toCharArray();
for(int i=0;i<str.length()-1;i++){
		if(ch[i]==ch[i+1])
		count=1;
}
if(count==1)
	System.out.println("no");
else
	System.out.println("yes");
}
}