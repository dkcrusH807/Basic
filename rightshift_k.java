package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int numright,k;
numright=in.nextInt();
k=in.nextInt();
if((numright>>k)>9){
	String s=Integer.toString(numright>>k);
	System.out.println(s+".00");
}else{
System.out.println(numright>>k);
}
}



