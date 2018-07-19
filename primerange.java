package List;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a=in.nextInt(),b=in.nextInt(),count=0;
for(int i=a+1;i<b;i++){
	for(int j=2;j<i;j++)
	if(i%j==0){
		count=0;
		break;}else{
			count=1;
		}
	if(count==1){
	System.out.println(i);}
}
}
}
