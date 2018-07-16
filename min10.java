package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int arr[]=new int[10];
for(int i=0;i<10;i++){
	arr[i]=in.nextInt();
}
int min=1000000000;
for(int i=0;i<10;i++){
	if(arr[i]<min)
		min=arr[i];
}
System.out.println(min);
}
}	


