package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String n;
n=in.nextLine();
int count=0;
for(int i=0;i<n.length();i++){
	for(int j=1;j<n.length();j++){
		if(n.charAt(i)==n.charAt(j))
			count++;
	}
}
if(count>0){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}
}
