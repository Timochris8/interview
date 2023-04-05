package Interview;

public class StringReverse {
public static void main(String[] args) {
	
	String a= "timo";
	String b= ""; 
	for (int i = a.length()-1; i >=0; i--) {
		char c= a.charAt(i);
		b=b+c;
	}
	System.out.println(b);
	
}
}
