package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
int count=0,count1=0;
str=in.nextLine();
for(int i=0;i<str.length();i++){
	if(str.charAt(i)==')'){
		count++;
	}
	if(str.charAt(i)=='('){
		count1++;
	}
}
if(count==count1){
	System.out.println("yes");}
else{
	System.out.println("no");
}
}
}


