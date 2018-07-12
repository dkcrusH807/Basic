package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
char ch;
Scanner in=new Scanner(System.in);
ch=in.next().charAt(0);
 if(ch>=65&&ch<=90||ch>=97&&ch<=122){
	System.out.println("Alphabets");
}else{
	System.out.println("No");
}
}
}
