package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s,s1;
int count=0;
s=in.nextLine();
s1=in.nextLine();
if(s.length()==s1.length()){
for(int i=0;i<s.length();i++){
if(s.charAt(i)==s1.charAt(i)){
	count++;
}
}
}
if(count==s.length()){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}

