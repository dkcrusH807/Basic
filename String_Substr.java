package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s,str;
int count=0,t=0;
s=in.nextLine();
str=in.nextLine();
if(s.length()>str.length()){
	 t=s.length()-str.length();
}
for(int i=0;i<t;i++){
	str=str+0;
}
for(int i=0;i<s.length();i++){
	for(int j=0;j<str.length();j++){
	if(s.charAt(i)==str.charAt(j)){
		count++;
	}}
}
if(count>=2){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}


