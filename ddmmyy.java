package github;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s;
s=in.nextLine();
int d=Integer.parseInt(s.substring(0,2));
int m=Integer.parseInt(s.substring(3,5));
int y=Integer.parseInt(s.substring(6,10));
if(d>=01&&d<=31&&m>=01&&d<=12&&y>=1000&&y<=9999){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}