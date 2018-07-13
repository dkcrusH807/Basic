package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
int year = 0;
Scanner in=new Scanner(System.in);
System.out.println("Enter a Year");
year=in.nextInt();
if(year%4==0){
	System.out.println("yes");
}else{
	System.out.println("no");
}
}
}