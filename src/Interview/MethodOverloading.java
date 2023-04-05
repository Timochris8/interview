package Interview;

public class MethodOverloading {
	private void methodOne(int age,char gender) {
	System.out.println("age is "+age+" gender is "+gender);
	}
	private void methodTwo(long phno,String mail) {
		System.out.println("phno is "+phno+" mail is "+mail);
		}
public static void main(String[] args) {
	MethodOverloading a = new MethodOverloading();
	a.methodOne(25, 'M');
	a.methodTwo(9995555888l, "welcome@gmail.com");
	

}
}
