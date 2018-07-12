package set1;
import java.util.*;
public class Set1 {
public static void main(String[] args) {
char ch;
Scanner in=new Scanner(System.in);
ch=in.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	System.out.println("Vowels");
}else if(ch>=32&&ch<=47||ch>=58&&ch<=64||ch>=91&&ch<=96||ch>=123&&ch<=127){
	System.out.println("invalid");
}else if(ch>=65&&ch<=90||ch>=97&&ch<=122){
	System.out.println("Consonant");
}
}
}
