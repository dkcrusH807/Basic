package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
String str1=str.replace(",","");
String str2=str1.replace("-","");
if(str2.length()<=10){
	System.out.println("INT");
}else{
	System.out.println("LONG");
}
}
}

