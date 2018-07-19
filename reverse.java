package List;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String a;
Scanner in=new Scanner(System.in);
a=in.nextLine();
for(int i=0;i<a.length();i++){
	System.out.print(a.substring(a.length()-(i+1),a.length()-i));
}
}
}
