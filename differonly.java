package List;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str=in.nextLine();
String str1=in.nextLine();
int count=0;
for(int i=0;i<str.length();i++){
	if(str.charAt(i)==str1.charAt(i))
	count++;	
}
if(str.length()-1==count)
	System.out.println("yes");
else
	System.out.println("no");
}
}
