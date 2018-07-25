package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String a,n;
int c=0;
a=in.nextLine();
n=in.nextLine();
for(int i=0;i<a.length();i++){
	if(a.substring(i, i+1).equals(n)){
		c++;
	}
}
	System.out.println(c);
}
}



