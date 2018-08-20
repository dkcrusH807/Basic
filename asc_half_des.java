package guvi;
import java.util.*;
public class PossibleChar {
public static void main(String args[]){
Scanner in= new Scanner(System.in);
int n,tmp=100000000;
n=in.nextInt();
int a[]=new int[n];		
for(int i=0;i<n;i++){
	a[i]=in.nextInt();
}
if(n%2==0){
	for(int i=0;i<=10000000;i++){
for(int j=0;j<n/2;j++){
	if(i==a[j])
		System.out.print(i+" ");
}}
	for(int i=10000000;i>=0;i--){
		for(int j=n/2;j<n;j++){
			if(i==a[j])
				System.out.print(i+" ");
		}}
}
if(n%2!=0){
	for(int i=0;i<=10000000;i++){
for(int j=0;j<n/2+1;j++){
	if(i==a[j])
		System.out.print(i+" ");
}}
	for(int i=10000000;i>=0;i--){
		for(int j=n/2+1;j<n;j++){
			if(i==a[j])
				System.out.print(i+" ");
		}}
}
}
}

