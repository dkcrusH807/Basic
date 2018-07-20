package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int count=0;
int arr[][]=new int[3][3];
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		 arr[i][j]=in.nextInt();
	}
}
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
	if(arr[i][j]==1){
        count++;
}
}
}
System.out.println(count);
}
}

