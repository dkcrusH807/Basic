package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String s;
int count=0;
Scanner in=new Scanner(System.in);
s=in.nextLine();
for(int i=0;i<s.length();i++){
if(s.substring(i,i+1).equals(".")){
	count++;
}}
if(s.substring(s.length()-1,s.length())!=".")
System.out.println(count+1);
else{
	System.out.println(count);
}
}}


