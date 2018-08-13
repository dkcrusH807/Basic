package github;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
for(int i=str.length()-1;i>=0;i--){
	if(i==0){
		System.out.println(str.charAt(i));
	}else{
	System.out.print(str.charAt(i)+"-");}
}
}
}


