package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
String s;
Scanner in=new Scanner(System.in);
s=in.nextLine();
System.out.print(s.substring(0,1));
for(int i=1;i<s.length();i++){
	if(i%3==0){
	System.out.print(s.charAt(i)+"");
}
 }
}
}

