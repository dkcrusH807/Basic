package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
String s;
int count=0;
Scanner in=new Scanner(System.in);
s=in.nextLine();
for(int i=0;i<s.length();){
	char c=s.charAt(i);
	for(int j=i+1;j<s.length();){
		if(c==s.charAt(j)){
			s=s.replace(String.valueOf(s.charAt(j)), "");
			count=1;
		}
		j++;
	}
	if(count==0){
		System.out.print(c);
	}
	i++;
	count=0;
}
}
}

