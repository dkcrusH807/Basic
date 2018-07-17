package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,r;
n=in.nextInt();
r=n%10;
if(r==0){
	System.out.println(n);}
else if(r==1){
	n=n+9;
	System.out.println(n);
}
else if(r==2){
	n=n+8;
	System.out.println(n);
}else if(r==3){
	n=n+7;
	System.out.println(n);
}else if(r==4){
	n=n+6;
	System.out.println(n);
}else if(r==5){
	n=n+5;
	System.out.println(n);
}else if(r==6){
	n=n+4;
	System.out.println(n);
}else if(r==7){
	n=n+3;
	System.out.println(n);
}else if(r==8){
	n=n+2;
	System.out.println(n);
}else if(r==9){
	n=n+1;
	System.out.println(n);
}
}
}