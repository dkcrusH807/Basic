package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s[]=new String[3];
String s1="";
for(int i=0;i<3;i++){
s[i]=in.nextLine();
}
for(int i=0;i<3;i++){
String str=s[i].toString();
for(int j=str.length()-1;j>=0;j--){
	System.out.println(str.substring(j,j+1));
	s1=s1+str.substring(j,j+1);
}
System.out.println(s1);
}
}
}





