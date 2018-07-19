package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
if(str.equalsIgnoreCase("Saturday")||str.equalsIgnoreCase("Sunday")){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
}
}
