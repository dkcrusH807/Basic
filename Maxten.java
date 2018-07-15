package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int a[]=new int[10];
int max=0;
Scanner in=new Scanner(System.in);
for(int i=0;i<10;i++){
	a[i]=in.nextInt();
}
for(int i=0;i<10;i++){
	if(a[i]>max)
		max=a[i];
}
System.out.println(max);
}
}

