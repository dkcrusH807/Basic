package List;
import java.util.*;
public class Guvi {
public static void main(String[] args) {
int num,mul=1;
Scanner in=new Scanner(System.in);
num=in.nextInt();
for(int i=1;i<=num;i++){
	mul=mul*i;
}
System.out.println(mul);
}
}
