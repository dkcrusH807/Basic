package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String s;
char r=' ';
int count=0;
int maxcount =0;
Scanner in=new Scanner(System.in);
s=in.nextLine();
for(int i=0;i<s.length();i++){
	for(int j=1;j<s.length();j++){
		if(s.charAt(i)==s.charAt(j))
			count++;
	}
	if(count>maxcount){
		maxcount=count;
	r=s.charAt(i);}
	count=0;
}
System.out.println(r);
}}

