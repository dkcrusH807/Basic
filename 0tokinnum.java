package sql;
import java.util.*;
public class guvi{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String str;
str=in.nextLine();
int k,temp=0,count=0;
k=in.nextInt();
for(int i=0;i<=k;i++){
	count=0;
	for(int j=0;j<str.length();j++){
		if(Integer.parseInt(str.substring(j,j+1))==i){
			count=1;
	}}
	if(count==1)
		temp++;
}
if(k+1==temp){
System.out.println("Yes");
}else{
	System.out.println("No");
}
}
}
