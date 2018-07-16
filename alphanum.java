package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;int count=0;
str=in.nextLine();
for(int i=0;i<str.length();i++){
	if(str.charAt(i)>=48&&str.charAt(i)<=57||str.charAt(i)>=65&&str.charAt(i)<=122){
  count++;
}
	}
if(count==str.length()){
	System.out.println("Yes");
}else 
	System.out.println("No");
}
}


