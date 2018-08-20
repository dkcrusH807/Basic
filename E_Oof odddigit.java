package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String s;
s=in.nextLine();
int sum=0;
int a[]=new int[s.length()];
for(int i=0;i<s.length();i++){
a[i]=Integer.parseInt(s.substring(i,i+1));
}
for(int i=0;i<s.length();i++ ){
	if((i+1)%2!=0){
		sum=sum+a[i];
	}
}
if(sum%2==0){
	System.out.println("E");
}else{
System.out.println("O");}
}
}
