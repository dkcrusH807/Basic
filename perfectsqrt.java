package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int l,r;
l=in.nextInt();
r=in.nextInt();
for(int i=l+1;i<r;i++){
	double s=Math.sqrt(i);
	if(s-Math.floor(s)==0)
		System.out.println(i);
}
}
}


