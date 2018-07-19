package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int l,r;
l=in.nextInt();
r=in.nextInt();
for(int i=1;i<999;i++){
	if(i%l==0&&i%r==0){
		System.out.println(i);break;}
}
}
}