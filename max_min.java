package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<arr.length;i++){
	arr[i]=in.nextInt();
}
int max=0,min=10000;
for(int i=0;i<arr.length;i++){
	if(arr[i]>max)
		max=arr[i];
	if(arr[i]<min)
		min=arr[i];
}
System.out.println(max+" "+min);
}
}

