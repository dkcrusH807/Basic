package sql;
import java.util.*;

import oracle.net.aso.s;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
for(int i=0;i<str.length();i++){
	char ch=str.charAt(i);
	int t=(int)ch;
	if(t==88){
		t=62;}
	if(t==89){
		t=63;}
	if(t==90){
		t=64;}
	if(t==120){
		t=94;
	}
	if(t==121){
		t=95;
	}
	if(t==122){
		t=96;
	}
	t=t+3;
	System.out.print((char)t);
      
}
}
}