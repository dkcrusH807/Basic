package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String s,s1;
s=in.nextLine();
s1=s.substring(3,5);
if(s1.equals("01")){
	System.out.println("January");
}
if(s1.equals("02")){
	System.out.println("February");
}
if(s1.equals("03")){
	System.out.println("March");
}
if(s1.equals("04")){
	System.out.println("April");
}
if(s1.equals("05")){
	System.out.println("May");
}
if(s1.equals("06")){
	System.out.println("June");
}
if(s1.equals("07")){
	System.out.println("July");
}
if(s1.equals("08")){
	System.out.println("August");
}
if(s1.equals("09")){
	System.out.println("September");
}
if(s1.equals("10")){
	System.out.println("October");
}
if(s1.equals("11")){
	System.out.println("November");
}
if(s1.equals("12")){
	System.out.println("December");
}
}
}