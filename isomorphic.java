package List;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
String s,s1;
int count=0,count1=0;
Scanner in=new Scanner(System.in);
s=in.nextLine();
s1=in.nextLine();
if(s.length()==s1.length()){
	for(int i=0;i<s.length();i++){
		for(int j=1;j<s1.length();j++){
			if(s.charAt(i)==s.charAt(j))
			count++;
			if(s1.charAt(i)==s1.charAt(j))
				count1++;
		}
	}
}
if(count==count1)
	System.out.println("yes");
else
	System.out.println("no");
}
}