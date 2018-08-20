package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in= new Scanner(System.in);
int n;
n=in.nextInt();
int a[]=new int[n];		
int b[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
	b[i]=in.nextInt();
}
if(a[0]==a[n-1]||b[0]==b[n-1]||a[0]==a[n-1]&&b[0]==b[n-1]){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}
}

