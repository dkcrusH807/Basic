package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String n;
Scanner in=new Scanner(System.in);
n=in.nextLine();
if(n.length()==1){
	for(int i=0;i<n.length();i++){
	if(n.charAt(i)>=48&&n.charAt(i)<=57){
		System.out.println("yes");
}else{
	System.out.println("no");}
}
}
}
}

