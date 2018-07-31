package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,count=0;
n=in.nextInt();
String s[]=new String[n];
for(int i=0;i<n;i++){
	s[i]=in.next();
}
String str;
str=in.next();
for(int j=0;j<n;j++){
	if(s[j].equals(str)){
		count++;
	}
}
System.out.println(count);
}
}

