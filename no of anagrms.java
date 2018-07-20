package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n;
int count=0;
n=in.nextInt();
String str[]=new String[n];
for(int i=0;i<n;i++){
	str[i]=in.next();
}
for(int i=0;i<n;i++){
	char ch[]=str[i].toLowerCase().toCharArray();Arrays.sort(ch);
	for(int j=1;j<n;j++){
		char ch1[]=str[j].toLowerCase().toCharArray();Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1)){
			count=1;
		}
	}
	count=count+count;
	}
System.out.println(count+1);
}
}