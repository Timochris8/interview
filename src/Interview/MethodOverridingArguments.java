package Interview;

public class MethodOverridingArguments {
	private void methodOne(int age,char gender) {
		System.out.println("age is "+age+" gender is "+gender);
		}
		private void methodTwo(long phno,String mail,double salary) {
			System.out.println("phno is "+phno+" mail is "+mail);
			}
	public static void main(String[] args) {
		MethodOverridingArguments a = new MethodOverridingArguments();
		a.methodOne(25, 'M');
		a.methodTwo(9995555888l, "welcome@gmail.com",50000.00d);
		

	}
}
