/*import java.util.Scanner;
public class greetingapp{
	public static void main(String[]args){
		//Scanner boy = new Scanner(System.in);
		//System.out.println("Enter your Name here");
		//String a = new boy.nextLine();
		SayHello("Delick");
		SayHello("John");
		SayHello("James");
	}
	public static void SayHello(String name){
		System.out.println("Good morning " +name);
	}
}
*/
public class greetingapp{
	public static void main(String[]args){
		Student mark = new Student();
		mark.id = 1;
		mark.name = "mark";
		mark.age = 15;
		System.out.println(mark.name +" is "+ mark.age +" Years Old");
	}
}