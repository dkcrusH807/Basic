package sql;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int x,y,t=0;
x=in.nextInt();
y=in.nextInt();
for(int i=1;i<=x;i++){
		if(x%i==0&&y%i==0){
			t=i;
	}

}
System.out.println(t);
}
}