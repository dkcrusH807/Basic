package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
String str=Integer.toBinaryString(n),str2="";
for(int i=str.length()-1;i>=0;i--){
     str2=str2+str.charAt(i);
}
System.out.println(str2);
for(int i=0;i<=str2.length();i++){
	if(str2.substring(i,i+1).equals("1")){
		System.out.println(i+1);
	break;}
}
}
}
