package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String str;
int count=0;
Scanner in=new Scanner(System.in);
str=in.nextLine();
for(int i=0;i<str.length();i++){
	if(str.charAt(i)>=46&&str.charAt(i)<=57){
	count++;	
	}
}
if(count==str.length()){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}
}


