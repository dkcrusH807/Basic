package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String n;int count=0;
Scanner in=new Scanner(System.in);
n=in.nextLine();
for(int i=0;i<n.length();i++){
if(n.charAt(i)>=48&&n.charAt(i)<=57){
	count++;
}else{
	System.out.println("no");
	break;
}
}
System.out.println(count);
}
}


