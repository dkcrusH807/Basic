package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
int arr[]=new int[3];
int max=-9;
Scanner in=new Scanner(System.in);
for(int i=0;i<arr.length;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<arr.length;i++){
	if(arr[i]>max){
		max=arr[i];
	}
}
System.out.println(max);
}
}