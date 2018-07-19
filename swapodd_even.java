package List;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s=in.nextLine();
int eve=0,odd=0;
char e[]=new char[100];
char o[]=new char[100];
for(int i=0;i<s.length();i++){
	if(i%2==0){
		 e[eve]=s.charAt(i);
		eve++;
	}
	if(i%2!=0){
		o[odd]=s.charAt(i);
		odd++;
	}
}
for(int i=0;i<s.length();i++){
	System.out.print(o[i]+""+e[i]);
}}
}
