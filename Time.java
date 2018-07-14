package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int minutes=n/60;
int seconds=n%60;
System.out.println(minutes+" "+seconds);
}
}


