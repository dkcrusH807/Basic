package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int N,K,sum=0;
N=in.nextInt();
K=in.nextInt();
int[] arr=new int[N];
for(int i=0;i<N;i++){
	arr[i]=in.nextInt();
}
for(int i=0;i<K;i++){
	sum=sum+arr[i];
}
System.out.println(sum);
}
}