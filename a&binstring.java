package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int count=0;
String s;
s=in.nextLine();
for(int i=0;i<s.length();i++){
	if(s.substring(i,i+1).equalsIgnoreCase("a")||s.substring(i,i+1).equalsIgnoreCase("b")){
		count++;
	}
}
if(count==s.length()){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}
}
s