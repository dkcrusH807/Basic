package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String s;
int count=0;
Scanner in=new Scanner(System.in);
s=in.nextLine();
for(int i=0;i<s.length();i++){
	if(s.charAt(i)>=32&&s.charAt(i)<=47||s.charAt(i)>=58&&s.charAt(i)<=64||s.charAt(i)>=91&&s.charAt(i)<=96||s.charAt(i)>=123&&s.charAt(i)<=127){
		count++;
	}
}
System.out.println(count);
}
}


